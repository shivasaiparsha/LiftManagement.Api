package com.example.Bookproject1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lift {

    private int LiftNo;
    private int CapacityInWeight;
    private int CapacityInPerson;
    private List<Passenger> passengerList;

}
