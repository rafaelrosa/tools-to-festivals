package com.festival.tools.quicksearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuickSearchController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/changelog")
    public String changelogPage() {
        return "changelog";
    }
}
