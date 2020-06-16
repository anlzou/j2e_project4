/**
 * @author：anlzou
 * @Date：Created in22:04 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Department;
import qin.com.mapper.CategoryMapper;
import qin.com.mapper.DepartmentMapper;
import qin.com.service.DepartmentService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired  //注解表示后面的定义的变量spring自动为我们进行封装
    private DepartmentMapper departmentMapper;  //这里声明了数据表的接口类，主要是因为我们业务要调用持久层接口来操作数据表（增删改查操作等）

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }

    @Override
    public Department selectByPrimaryKey(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Department record) {
        return departmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }
}
