package org.javaboy.vhr.controller.emp;

import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.Employeetrain;
import org.javaboy.vhr.model.RespBean;
import org.javaboy.vhr.model.RespPageBean;
import org.javaboy.vhr.service.EmployeeTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("employee/train")
public class EmployeeTrainController {

    @Autowired
    private EmployeeTrainService employeeTrainService;

    /**
     * 添加一条记录
     * @param employeetrain
     * @return
     */
    @PostMapping("/")
    public RespBean addEmp(@RequestBody Employeetrain employeetrain) {
        if (employeeTrainService.AddEmployeeTrain(employeetrain) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    /**
     * 查询所有的记录
     * @return
     */
    @GetMapping("/")
    public List<Employeetrain> getAll(){
        return employeeTrainService.getAll();
    }

    /**
     * 根据id删除指定的记录
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (employeeTrainService.DeleteById(id) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    /**
     * 更新信息
     * @param employeetrain
     * @return
     */
    @PutMapping("/")
    public RespBean updateEmployeeTrain(@RequestBody Employeetrain employeetrain) {
        if (employeeTrainService.UpdateEmployeeTrain(employeetrain) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
