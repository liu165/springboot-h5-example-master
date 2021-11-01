package com.yxy.dao;

import com.yxy.base.MyMapper;
import com.yxy.model.EntryUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EntryUserMapper extends MyMapper<EntryUser> {
    @Select("select * from entry_user")
    List<EntryUser> userList();
}
