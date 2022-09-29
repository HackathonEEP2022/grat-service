package com.eep.grat.profile.controller;

import com.eep.grat.login.model.LoginUser;
import com.eep.grat.profile.model.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {
    @PostMapping("stub/profile")
    public String createProfile(@RequestBody Profile newProfile){
        System.out.println("request for new profile creation {}" + newProfile.toString());
        return "P00001";
    }
    @GetMapping("stub/profile/{profileid}")
    public Profile getProfilebyID(@PathVariable("id") final Long id){
        return new Profile();
    }
}
