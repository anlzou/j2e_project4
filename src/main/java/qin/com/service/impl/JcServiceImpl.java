/**
 * @author：anlzou
 * @Date：Created in22:04 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.stereotype.Service;
import qin.com.entity.Jc;
import qin.com.entity.JcWithBLOBs;
import qin.com.service.JcService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class JcServiceImpl implements JcService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(JcWithBLOBs record) {
        return 0;
    }

    @Override
    public int insertSelective(JcWithBLOBs record) {
        return 0;
    }

    @Override
    public JcWithBLOBs selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(JcWithBLOBs record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(JcWithBLOBs record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Jc record) {
        return 0;
    }
}
