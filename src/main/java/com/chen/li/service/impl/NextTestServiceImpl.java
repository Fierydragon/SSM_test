package com.chen.li.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.li.mapper.NextTestMapper;
import com.chen.li.pojo.NextTestBean;
import com.chen.li.service.NextTestService;

@Service
public class NextTestServiceImpl implements NextTestService {
	@Autowired
	NextTestMapper nextTestMapper;
	@Override
	public List<NextTestBean> list() {
		// TODO Auto-generated method stub
		return nextTestMapper.list();
	}
	@Override
	public void add(NextTestBean bean) {
		// TODO Auto-generated method stub
		nextTestMapper.add(bean);
	}
}
