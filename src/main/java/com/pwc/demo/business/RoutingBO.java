package com.pwc.demo.business;

import com.pwc.demo.models.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoutingBO {

    /**
     * retrieve possible land routing from origin to destination
     *
     * @param origin
     * @param destination
     *
     * @return routing
     * */
    public List<String> searchRoutingFromOriginToDestination(String origin, String destination);
}
