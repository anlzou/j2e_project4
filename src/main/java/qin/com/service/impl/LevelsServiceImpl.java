/**
 * @author：anlzou
 * @Date：Created in22:06 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.stereotype.Service;
import qin.com.entity.Levels;
import qin.com.service.LevelsService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class LevelsServiceImpl implements LevelsService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Levels record) {
        return 0;
    }

    @Override
    public int insertSelective(Levels record) {
        return 0;
    }

    @Override
    public Levels selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Levels record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Levels record) {
        return 0;
    }
}
