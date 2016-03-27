package com.chenkaihua.gradlegreendaosimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;

import com.chenkaihua.gradlegreendaosimple.dao.DaoSession;
import com.chenkaihua.gradlegreendaosimple.dao.UserDao;
import com.chenkaihua.gradlegreendaosimple.entity.User;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaoSession daoSession = ((App) getApplication()).getDaoSession();
        UserDao userDao = daoSession.getUserDao();
        List<User> users = userDao.loadAll();
        // 这里可以使用users ...



    }
}
