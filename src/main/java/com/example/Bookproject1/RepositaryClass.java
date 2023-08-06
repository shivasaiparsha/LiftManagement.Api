package com.example.Bookproject1;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
@Slf4j
public class RepositaryClass {

  HashMap<Integer, Lift> liftdb= new HashMap<>();

  HashMap<Integer, Passenger> passengerdb = new HashMap<>();
   public void addLiftdb(Lift lift)
   {
       int primaryKey=lift.getLiftNo();
       liftdb.put(primaryKey, lift);
   }

    public void addpassengerTodb(Passenger passenger)
    {
        int primaryKey=passenger.getPassengerId();
        passengerdb.put(primaryKey, passenger);
    }

    public void deleteallthePassenegersIdlessThan5() throws NullPointerException
    {
        if(passengerdb.size()==0)
            throw new NullPointerException();
        for(int key : passengerdb.keySet())
        {
            if(key<5)
            {
                passengerdb.remove(key);
            }
        }
    }

    public  List<Passenger> getListOfPassengers(int id)
    {
         List<Passenger> pl=liftdb.get(id).getPassengerList();
         return pl;
    }

    public  List<Passenger> getList(int id)
    {
        List<Passenger> pl=liftdb.get(id).getPassengerList();
        return pl;
    }

}
