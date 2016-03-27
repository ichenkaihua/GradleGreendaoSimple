package com.chenkaihua.gradlegreendaosimple;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.chenkaihua.gradlegreendaosimple.dao.DaoMaster;
import com.chenkaihua.gradlegreendaosimple.dao.DaoSession;

/**
 * Created by dellidc on 2016/3/27.
 */
public class App extends Application {


    private DaoSession mDaoSession;


    @Override
    public void onCreate() {
        super.onCreate();
    }


    public synchronized DaoSession getDaoSession() {
        if (mDaoSession == null) {
            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "simple-db.db", null);
            SQLiteDatabase db = helper.getWritableDatabase();
            DaoMaster daoMaster = new DaoMaster(db);
            mDaoSession = daoMaster.newSession();
        }
        return mDaoSession;


    }


}
