package com.testtask.moneyheist.objects;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.ArrayList;

@Builder
@With
@Value
public class Member {
    String name;
    String sex;
    String email;
    ArrayList<Skill> skills;
    String mainSkill;
    String status;
}
