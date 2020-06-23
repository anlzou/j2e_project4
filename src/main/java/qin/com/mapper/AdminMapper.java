package qin.com.mapper;

import qin.com.entity.Admin;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);
    int updateByPrimaryKey(Admin record);

    List<Admin> selectAll();
}