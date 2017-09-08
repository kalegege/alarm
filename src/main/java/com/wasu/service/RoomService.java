package com.wasu.service;

import java.util.Date;

/**
 * Created by kale on 2017/8/16.
 */
public interface RoomService {
    //获取在线玩家数
    int getOnlinePlayers(Date today);
    //当前在线房间数
    int getOnlineRooms(Date today);
    //当前等待开局数
    int getWaitRooms(Date today);
}
