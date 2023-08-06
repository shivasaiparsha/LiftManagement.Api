package com.example.Bookproject1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
//    PassengerId, Lift, Weight

    private int PassengerId;
    private int Weight;
    private Lift lift;
}
