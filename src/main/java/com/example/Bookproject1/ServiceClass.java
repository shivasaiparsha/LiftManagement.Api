package com.example.Bookproject1;
import java.util.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class ServiceClass {

    @Autowired
    private RepositaryClass repclassobj;

    public void addLiftToserv(Lift lift)
    {
        repclassobj.addLiftdb(lift);
    }

    public void addPassengerTocon(Passenger passenger)
    {
        repclassobj.addpassengerTodb(passenger);
    }

    public void deletePassenegers()
    {
        try {
            repclassobj.deleteallthePassenegersIdlessThan5();
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
            log.error("there is passengers in passengerdb");
        }
    }

    public int getAllPassengers(int x, int liftid)
    {
        List<Passenger> passengerList=repclassobj.getList(liftid);
           int cnt=0;
        for(Passenger p : passengerList)
        {
            if(p.getWeight()==x)
                cnt++;
        }
        return cnt;
    }

    public int findPeoples(int id)
    {
        List<Passenger> pl =repclassobj.getListOfPassengers(id);
           int cnt=0;
        for(Passenger p : pl)
        {
            if(p.getWeight()>50)
                cnt++;
        }
        return cnt;
    }

}
