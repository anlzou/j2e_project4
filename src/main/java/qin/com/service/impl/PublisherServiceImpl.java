/**
 * @author：anlzou
 * @Date：Created in22:08 2020/6/16
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Publisher;
import qin.com.mapper.CategoryMapper;
import qin.com.mapper.PublisherMapper;
import qin.com.service.PublisherService;

@Service("adminServiceImpl")  //注解为业务类，并且方便在控制器中注入我们这个业务类
public class PublisherServiceImpl implements PublisherService {
    @Autowired  //注解表示后面的定义的变量spring自动为我们进行封装
    private PublisherMapper publisherMapper;  //这里声明了数据表的接口类，主要是因为我们业务要调用持久层接口来操作数据表（增删改查操作等）

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publisherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Publisher record) {
        return publisherMapper.insert(record);
    }

    @Override
    public int insertSelective(Publisher record) {
        return publisherMapper.insertSelective(record);
    }

    @Override
    public Publisher selectByPrimaryKey(Integer id) {
        return publisherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Publisher record) {
        return publisherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Publisher record) {
        return publisherMapper.updateByPrimaryKey(record);
    }
}
