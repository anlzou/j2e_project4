package qin.com.controller;

import qin.com.entity.Jc;
import qin.com.entity.JcWithBLOBs;

public interface JcController {
    int deleteByPrimaryKey(Integer id);

    int insert(JcWithBLOBs record);

    int insertSelective(JcWithBLOBs record);

    JcWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JcWithBLOBs record);

    int updateByPrimaryKey(Jc record);
}