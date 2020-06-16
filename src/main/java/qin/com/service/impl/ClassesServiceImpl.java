/**
 * @author：anlzou
 * @Date：Created in22:02 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Classse;
import qin.com.mapper.CategoryMapper;
import qin.com.mapper.ClassseMapper;
import qin.com.service.ClassesService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class ClassesServiceImpl implements ClassesService {
    @Autowired  //注解表示后面的定义的变量spring自动为我们进行封装
    private ClassseMapper classseMapper;  //这里声明了数据表的接口类，主要是因为我们业务要调用持久层接口来操作数据表（增删改查操作等）

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return classseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Classse record) {
        return classseMapper.insert(record);
    }

    @Override
    public int insertSelective(Classse record) {
        return classseMapper.insertSelective(record);
    }

    @Override
    public Classse selectByPrimaryKey(Integer id) {
        return classseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Classse record) {
        return classseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Classse record) {
        return classseMapper.updateByPrimaryKey(record);
    }
}
