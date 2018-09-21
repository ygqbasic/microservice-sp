package com.bootdo.clouddobase.controller;

import com.bootdo.clouddocommon.constants.CommonConstants;
import com.bootdo.clouddocommon.context.FilterContextHandler;
import com.bootdo.clouddocommon.dto.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class Healthz {
    @GetMapping(path = "/healthz")
    public String healthz(){
        return "ok";
    }
}
