package com.bmicro.purse.purse.yankie.events;

import com.bmicro.purse.purse.yankie.entity.PurseYankie;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PurseYankieCreatedEvent extends Event<PurseYankie> {
}
