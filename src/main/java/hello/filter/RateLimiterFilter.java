package hello.filter;

import com.google.common.util.concurrent.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * @author pyogi
 **/
@Component
@WebFilter(urlPatterns = "/hello")
public class RateLimiterFilter implements Filter {

    @Value("${limit.rate.second:1}")
    private int limitRate = 1;// default to 1 sec

    private static final Logger logger = LoggerFactory.getLogger(RateLimiterFilter.class.getName());

    private final ConcurrentHashMap<String,RateLimiter> limiters = new ConcurrentHashMap<>();

    private Function<String,RateLimiter> createLimiter(){
        return name -> RateLimiter.create(limitRate);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String localAddr = servletRequest.getLocalAddr();

        RateLimiter limiter = limiters.computeIfAbsent(localAddr, createLimiter());
        if (!limiter.tryAcquire(0, TimeUnit.SECONDS)) {
            logger.debug("Rate limit exceeded: {} / sec for localAddr {} ", limitRate, localAddr);
            HttpServletResponse r = (HttpServletResponse) servletResponse;
            r.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
            return;
        }


        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
