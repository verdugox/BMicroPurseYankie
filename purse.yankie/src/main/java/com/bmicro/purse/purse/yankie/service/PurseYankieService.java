package com.bmicro.purse.purse.yankie.service;

import com.bmicro.purse.purse.yankie.entity.PurseYankie;
import org.springframework.stereotype.Service;

@Service
public class PurseYankieService {

    private final PurseYankieEventsService purseYankieEventsService;

    public PurseYankieService(PurseYankieEventsService purseYankieEventsService) {
        super();
        this.purseYankieEventsService = purseYankieEventsService;
    }

    public PurseYankie save(PurseYankie purseYankie) {
        System.out.println("Received " + purseYankie);
        this.purseYankieEventsService.publish(purseYankie);
        return purseYankie;

    }

}
