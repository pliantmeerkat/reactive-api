package com.jackt.reactiveapi.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class BaseDto {
    private String id;

    protected BaseDto(String id) {
        this.id = id;
    }
}
