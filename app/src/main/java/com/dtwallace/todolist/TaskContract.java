package com.dtwallace.todolist;

import android.provider.BaseColumns;

public class TaskContract {

    public static final String DB_Name = "com.dtwallace.todolist.db";
    public static final int DB_Version = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
