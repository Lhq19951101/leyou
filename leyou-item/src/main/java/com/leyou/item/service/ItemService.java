package com.leyou.item.service;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

    public Long saveItem(Long id){
        // 模拟添加操作，如果id为1抛异常
        if(id.equals(1L)){
            throw new RuntimeException("Id不能为1！");
        }
        return id;
    }

}