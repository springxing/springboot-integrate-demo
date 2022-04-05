package com.xingyechen.security.controller;

import com.xingyechen.security.dao.UserRepository;
import com.xingyechen.security.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Resource
    private UserRepository userRepository;

    @GetMapping
    public String listTasks(){
        return "任务列表";
    }

    @PostMapping
    public String newTasks(){
        return "创建了一个新的任务";
    }

    @PutMapping("/{taskId}")
    public String updateTasks(@PathVariable("taskId")Integer id){
        return "更新了一下id为:"+id+"的任务";
    }

    @DeleteMapping("/{taskId}")
    public String deleteTasks(@PathVariable("taskId")Integer id){
        userRepository.deleteById(id);
        return "删除了id为:"+id+"的任务";
    }
}
