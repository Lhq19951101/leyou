package com.leyou.item.service;

import com.leyou.common.exception.pojo.ExceptionEnum;
import com.leyou.common.exception.pojo.LyException;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    public Long saveItem(Long id){
        // 模拟添加操作，如果id为1抛异常
        if(id.equals(1L)){
            //throw new RuntimeException("Id不能为1！");
            //throw new LyException(501,"自定义：Id不能为1！");
            throw new LyException(ExceptionEnum.DATA_TRANSFER_ERROR);
        }
        return id;
    }

}