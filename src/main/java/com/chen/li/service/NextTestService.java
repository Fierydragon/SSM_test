package com.chen.li.service;

import java.util.List;

import com.chen.li.pojo.NextTestBean;

public interface NextTestService {
	List<NextTestBean> list();
	void add(NextTestBean bean);
}
