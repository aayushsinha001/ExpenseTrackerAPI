package com.myspringproject.expensetrackerapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/categories")
public class CategoryResource {

    @GetMapping("")
    public String getAllCategories(HttpServletRequest httpServletRequest) {
        int userId = (Integer) httpServletRequest.getAttribute("userId");
        return "Authenticated! userId : " + userId;
    }
}
