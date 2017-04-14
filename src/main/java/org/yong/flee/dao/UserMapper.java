package org.yong.flee.dao;

import org.yong.flee.model.User;

public interface UserMapper {

	public void add(User user);

	public void update(User user);

	public User getUserByTelAndPassword(User user);
}
