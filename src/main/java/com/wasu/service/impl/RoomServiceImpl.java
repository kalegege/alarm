package com.wasu.service.impl;

import com.wasu.dao.RoomMapper;
import com.wasu.model.RoomExample;
import com.wasu.service.RoomService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kale on 2017/8/16.
 */
@Service("RoomService")
public class RoomServiceImpl implements RoomService {

    private static Logger logger = Logger.getLogger(RoomServiceImpl.class.getName());

    @Resource
    private RoomMapper roomMapper;

    @Override
    public int getOnlinePlayers(Date today){

        RoomExample roomExample=new RoomExample();
        RoomExample.Criteria criteria=roomExample.createCriteria();
        criteria.andCreateTimeGreaterThan(today)
                .andStateEqualTo(1);
        return roomMapper.getSumPlayerNumByExample(roomExample);
    }

    @Override
    public int getOnlineRooms(Date today) {

        RoomExample roomExample=new RoomExample();
        RoomExample.Criteria criteria=roomExample.createCriteria();
        criteria.andCreateTimeGreaterThan(today)
                .andStateEqualTo(1);
        return roomMapper.countByExample(roomExample);
    }

    @Override
    public int getWaitRooms(Date today) {

        RoomExample roomExample=new RoomExample();
        RoomExample.Criteria criteria=roomExample.createCriteria();
        criteria.andCreateTimeGreaterThan(today)
                .andStateEqualTo(0);
        return roomMapper.countByExample(roomExample);
    }
}
