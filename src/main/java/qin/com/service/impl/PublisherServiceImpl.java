/**
 * @author：anlzou
 * @Date：Created in22:08 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.stereotype.Service;
import qin.com.entity.Publisher;
import qin.com.service.PublisherService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class PublisherServiceImpl implements PublisherService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Publisher record) {
        return 0;
    }

    @Override
    public int insertSelective(Publisher record) {
        return 0;
    }

    @Override
    public Publisher selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Publisher record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Publisher record) {
        return 0;
    }
}
