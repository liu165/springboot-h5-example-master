package com.yxy.service;

import com.yxy.DTO.EntryUserInputDTO;
import com.yxy.dao.EntryUserMapper;
import com.yxy.model.EntryUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class EntryUserService {
  @Resource
  private EntryUserMapper entryUserMapper;

  /**
   * 往数据库表 entry_user中新增一条记录
   * @param inputDTO
   * @return
   */
  public EntryUser addUser(EntryUserInputDTO inputDTO) {
    EntryUser insertObj = new EntryUser();
    BeanUtils.copyProperties(inputDTO, insertObj);
    // 入库
    entryUserMapper.insertSelective(insertObj);
    return insertObj;
  }
  public List<EntryUser>  UserList(){
    List<EntryUser>  list = entryUserMapper.userList();
    return list;
  }
}
