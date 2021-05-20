package com.example.javaesp32sqlwebsocket.controler;

import com.example.javaesp32sqlwebsocket.dao.DeviceDao;
import com.example.javaesp32sqlwebsocket.model.DeviceEsp32Dht11;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/DeviceDBService")
public class DeviceControler {


    @PostMapping("/data/add")
    public boolean addData(@RequestBody DeviceEsp32Dht11 d){
        return DeviceDao.addData(d);
    }

    @GetMapping("/all")
    public List<DeviceEsp32Dht11> getAll(){
        return DeviceDao.getAllDummy();
    }




}

