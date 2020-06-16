/**
 * @author：anlzou
 * @Date：Created in22:07 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Major;
import qin.com.mapper.CategoryMapper;
import qin.com.mapper.MajorMapper;
import qin.com.service.MajorService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class MajorServiceImpl implements MajorService {
    @Autowired  //注解表示后面的定义的变量spring自动为我们进行封装
    private MajorMapper majorMapper;  //这里声明了数据表的接口类，主要是因为我们业务要调用持久层接口来操作数据表（增删改查操作等）

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return majorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Major record) {
        return majorMapper.insert(record);
    }

    @Override
    public int insertSelective(Major record) {
        return majorMapper.insertSelective(record);
    }

    @Override
    public Major selectByPrimaryKey(Integer id) {
        return majorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Major record) {
        return majorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Major record) {
        return majorMapper.updateByPrimaryKey(record);
    }
}
