package kafka.springboot.cabbookdriver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kafka.springboot.cabbookdriver.service.CabLocationService;

@RestController
@RequestMapping("/location")
public class CabLocationController {
    @Autowired
    private CabLocationService cabLocationService;

    // Business Logic
    


    // publish the location of the driver
    @PutMapping
    public ResponseEntity updateLocation(){

        int range = 100;
        while(range > 0){
            System.out.println(
                Math.random() + " ," + Math.random()
            ); // randomly print out location of the driver
            range --;
        }

        return new ResponseEntity<>(Map.of("message", "location Updated"), HttpStatus.OK);
    }
}