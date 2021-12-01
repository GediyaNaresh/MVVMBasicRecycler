package com.nareshgediya.mvvmbasicrecycler;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ModelViewModel extends ViewModel {

    private MutableLiveData<List<MainData>> arrayList;

    public void init() {
        if (arrayList != null)
            return;
        RepositoryClass repositoryClass = RepositoryClass.getInstance();
        Log.d("TAG", "arr");
        arrayList = repositoryClass.getData();
    }


    public LiveData<List<MainData>> getData() {
        Log.d("TAG", "getData");
        return arrayList;
    }
}
