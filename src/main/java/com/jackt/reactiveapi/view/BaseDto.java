package com.jackt.reactiveapi.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public abstract class BaseDto implements Serializable {
    private String id;

    BaseDto(String id) {
        this.id = id;
    }
}
