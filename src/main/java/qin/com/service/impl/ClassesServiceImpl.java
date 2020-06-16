/**
 * @author：anlzou
 * @Date：Created in22:02 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.stereotype.Service;
import qin.com.entity.Classse;
import qin.com.service.ClassesService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class ClassesServiceImpl implements ClassesService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Classse record) {
        return 0;
    }

    @Override
    public int insertSelective(Classse record) {
        return 0;
    }

    @Override
    public Classse selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Classse record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Classse record) {
        return 0;
    }
}
