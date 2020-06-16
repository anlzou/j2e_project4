/**
 * @author：anlzou
 * @Date：Created in22:03 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Course;
import qin.com.mapper.CategoryMapper;
import qin.com.mapper.CourseMapper;
import qin.com.service.CourseService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class CourseServiceImpl implements CourseService {
    @Autowired  //注解表示后面的定义的变量spring自动为我们进行封装
    private CourseMapper courseMapper;  //这里声明了数据表的接口类，主要是因为我们业务要调用持久层接口来操作数据表（增删改查操作等）

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Course record) {
        return courseMapper.insert(record);
    }

    @Override
    public int insertSelective(Course record) {
        return courseMapper.insertSelective(record);
    }

    @Override
    public Course selectByPrimaryKey(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Course record) {
        return courseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }
}
