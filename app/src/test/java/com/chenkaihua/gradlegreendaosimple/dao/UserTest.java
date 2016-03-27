package com.chenkaihua.gradlegreendaosimple.dao;

import de.greenrobot.dao.test.AbstractDaoTestLongPk;

import com.chenkaihua.gradlegreendaosimple.entity.User;
import com.chenkaihua.gradlegreendaosimple.dao.UserDao;

public class UserTest extends AbstractDaoTestLongPk<UserDao, User> {

    public UserTest() {
        super(UserDao.class);
    }

    @Override
    protected User createEntity(Long key) {
        User entity = new User();
        entity.setId(key);
        return entity;
    }

}
