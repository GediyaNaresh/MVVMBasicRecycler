package com.nareshgediya.mvvmbasicrecycler;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClass {
private static RepositoryClass instance;
ArrayList<MainData> mainDataArrayList = new ArrayList<>();

    public static RepositoryClass getInstance() {
if (instance == null) {
    instance = new RepositoryClass();
}
return instance;
    }



    public MutableLiveData<List<MainData>> getData() {
setData();
MutableLiveData<List<MainData>> data = new MutableLiveData<>();
data.setValue(mainDataArrayList);

return data;
    }

    public void setData() {
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));
        mainDataArrayList.add(new MainData("Naresh Gediya"));
        mainDataArrayList.add(new MainData("gediya Naresh"));

    }
}
