/**
 * WeChatService.java
 * Created by zhusy on 2016/11/11 0011 10:30
 * Copyright © 2012 Phoenix New Media Limited All Rights Reserved
 */
package com.ifeng.weChatSpider.Services;

import com.ifeng.weChatSpider.Bean.WeChat;
import com.ifeng.weChatSpider.Mongo.MongoSelect;
import com.ifeng.weChatSpider.Mongo.Where;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import java.util.List;
import java.util.Map;

public interface WeChatService {

    WeChat selectOne(MongoSelect mongoSelect) throws Exception;

    List<WeChat> selectList(MongoSelect mongoSelect) throws Exception;

    UpdateResult update(Map<String, Object> map, Where where) throws Exception;

    DeleteResult delete(Where where) throws Exception;

    int count(MongoSelect mongoSelect) throws Exception;

    void insertOne(WeChat weChat) throws Exception;

    void insertList(List<WeChat> weChatList) throws Exception;

    List<WeChat> selectSpiderList(int size) throws Exception;

    void resetStatus() throws Exception;

    List<WeChat> selectUpdateList() throws Exception;

    List<WeChat> selectPubpiderList(int size) throws Exception;
}