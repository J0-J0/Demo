package com.jojo.service;

import com.jojo.persistent.model.SysTask;

import java.util.List;

public interface SysTaskService {
    List<SysTask> selectAll();
}
