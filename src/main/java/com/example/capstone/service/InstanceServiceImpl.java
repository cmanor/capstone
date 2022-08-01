package com.example.capstone.service;

import com.example.capstone.model.Instance;
import com.example.capstone.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstanceServiceImpl implements InstanceService{

    @Autowired
    private InstanceRepository instanceRepository;

    @Override
    public void makeStartTimeStamp(Instance instance) {

    }

    @Override
    public void makeStopTimeStamp(Instance instance) {

    }
}
