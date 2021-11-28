package com.pwc.demo.controllers;

import com.pwc.demo.business.RoutingBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import utils.ListUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/routing")
public class RoutingController {

    private RoutingBO routingBO;

    @Autowired
    public void setRoutingBO(RoutingBO routingBO) {
        this.routingBO = routingBO;
    }

    @GetMapping("/{origin}/{destination}")
    @ResponseBody
    public ResponseEntity<?> getRouting(@PathVariable String origin, @PathVariable String destination) {

        List<String> response = this.routingBO.searchRoutingFromOriginToDestination(origin, destination);

        return !ListUtils.isNullOrEmpty(response)
                ? new ResponseEntity<>(response,HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
