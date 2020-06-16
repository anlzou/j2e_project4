/**
 * @author：anlzou
 * @Date：Created in22:04 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Jc;
import qin.com.entity.JcWithBLOBs;
import qin.com.mapper.CategoryMapper;
import qin.com.mapper.JcMapper;
import qin.com.service.JcService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class JcServiceImpl implements JcService {
    @Autowired  //注解表示后面的定义的变量spring自动为我们进行封装
    private JcMapper jcMapper;  //这里声明了数据表的接口类，主要是因为我们业务要调用持久层接口来操作数据表（增删改查操作等）

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JcWithBLOBs record) {
        return jcMapper.insert(record);
    }

    @Override
    public int insertSelective(JcWithBLOBs record) {
        return jcMapper.insertSelective(record);
    }

    @Override
    public JcWithBLOBs selectByPrimaryKey(Integer id) {
        return jcMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JcWithBLOBs record) {
        return jcMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(JcWithBLOBs record) {
        return jcMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Jc record) {
        return jcMapper.updateByPrimaryKey(record);
    }
}
