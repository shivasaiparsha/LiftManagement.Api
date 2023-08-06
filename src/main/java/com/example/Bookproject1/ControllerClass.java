package com.example.Bookproject1;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ControllerClass {

    @Autowired
    private ServiceClass servobj;

    @PostMapping("AddLift")

    public ResponseEntity<String> addLift(@RequestBody Lift lift)
    {
        servobj.addLiftToserv(lift);
        return  new ResponseEntity<>("Lift Added successfully", HttpStatus.OK);
    }

    @PostMapping("AddPassenger")

    public ResponseEntity<String> addPassenger(@RequestBody Passenger passenger)
    {
        servobj.addPassengerTocon(passenger);

        return  new ResponseEntity<>("Passenger Added successfully", HttpStatus.OK);

    }

    @DeleteMapping("deletePassengerIdlessthan5")

    public ResponseEntity<String> deletePassenger()
    {
        servobj.deletePassenegers();

        return new ResponseEntity<>("all passengers with id lessthan 5 are removed", HttpStatus.CREATED);
    }

    @GetMapping("findthepassengers/{weight}/{liftId}")
    public ResponseEntity<Integer> findThePassenegrs(@PathVariable Integer weight,@PathVariable Integer liftId)
    {
        int val=servobj.getAllPassengers(weight, liftId);

        return new ResponseEntity<>(val, HttpStatus.CREATED);

    }

    @GetMapping("findthepeopleswithGreaterthan50/liftNo")
    public ResponseEntity<Integer> findPeoples(@RequestParam Integer liftid)
    {
        int peoples=servobj.findPeoples(liftid);
        return new ResponseEntity<>(peoples, HttpStatus.OK);
    }
}
