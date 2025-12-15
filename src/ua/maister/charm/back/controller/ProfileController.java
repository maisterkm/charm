package ua.maister.charm.back.controller;

import ua.maister.charm.back.seervice.ProfileService;

public class ProfileController {

    private final ProfileService service;

    public ProfileController(ProfileService service) {
        this.service = service;
    }

    public String work(String request) {

    }
}
