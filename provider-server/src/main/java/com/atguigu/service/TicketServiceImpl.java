package com.atguigu.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "得到一张票";
    }
}
