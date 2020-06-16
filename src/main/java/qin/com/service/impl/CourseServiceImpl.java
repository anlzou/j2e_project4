/**
 * @author：anlzou
 * @Date：Created in22:03 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.stereotype.Service;
import qin.com.entity.Course;
import qin.com.service.CourseService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class CourseServiceImpl implements CourseService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Course record) {
        return 0;
    }

    @Override
    public int insertSelective(Course record) {
        return 0;
    }

    @Override
    public Course selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Course record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Course record) {
        return 0;
    }
}
