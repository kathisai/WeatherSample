package com.mobilenat.Home;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import static com.google.common.base.Preconditions.checkNotNull;


public class HomePresenter implements HomeContract.Presenter {

//    private final TasksRepository mTasksRepository;

    private final HomeContract.View mTaskDetailView;

    @Nullable
    private String mTaskId;

    public HomePresenter(@Nullable String taskId,
                        /* @NonNull TasksRepository tasksRepository,*/
                         @NonNull HomeContract.View taskDetailView) {
        mTaskId = taskId;
        mTaskDetailView = checkNotNull(taskDetailView, "taskDetailView cannot be null!");

        mTaskDetailView.setPresenter(this);
    }

    @Override
    public void start() {
        // On start
    }


    @Override
    public void editTask() {

    }
}