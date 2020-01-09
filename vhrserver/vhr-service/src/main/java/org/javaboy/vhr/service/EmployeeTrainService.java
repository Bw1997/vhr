package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.EmployeetrainMapper;
import org.javaboy.vhr.model.Employeetrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTrainService {

    @Autowired
    private EmployeetrainMapper employeetrainMapper;

    public int AddEmployeeTrain(Employeetrain employeetrain){
        return employeetrainMapper.insert(employeetrain);
    }

    public List<Employeetrain> getAll(){
        return employeetrainMapper.getAll();
    }

    public int DeleteById(Integer id){
        return employeetrainMapper.deleteByPrimaryKey(id);
    }

    public int UpdateEmployeeTrain(Employeetrain employeetrain){
        return employeetrainMapper.updateByPrimaryKey(employeetrain);
    }
}
