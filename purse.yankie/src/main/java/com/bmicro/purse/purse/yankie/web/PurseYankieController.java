package com.bmicro.purse.purse.yankie.web;

import com.bmicro.purse.purse.yankie.entity.PurseYankie;
import com.bmicro.purse.purse.yankie.service.PurseYankieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purseYankie")
public class PurseYankieController {

    private final PurseYankieService purseYankieService;

    public PurseYankieController(PurseYankieService purseYankieService) {
        super();
        this.purseYankieService = purseYankieService;
    }

    @PostMapping
    public PurseYankie save(@RequestBody PurseYankie purseYankie) {
        return this.purseYankieService.save(purseYankie);
    }

}
