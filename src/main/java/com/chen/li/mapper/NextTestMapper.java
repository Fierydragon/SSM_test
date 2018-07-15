package com.chen.li.mapper;

import java.util.List;

import com.chen.li.pojo.NextTestBean;

public interface NextTestMapper {
	public void add(NextTestBean bean);
	public void delete(int id);
	public void update(NextTestBean bean);
	public NextTestBean get(int id);
	public List<NextTestBean> list();
	public int count();
}
