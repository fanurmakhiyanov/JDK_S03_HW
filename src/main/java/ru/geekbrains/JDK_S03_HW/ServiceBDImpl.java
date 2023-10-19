package ru.geekbrains.JDK_S03_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceBDImpl<T> implements ServiceBD<T>{

    //Заглушка Db
    List<T> list = new ArrayList<>();

    @Override
    public boolean save(T t) {
        return list.add(t);
    }

    @Override
    public boolean delete(T t) {
        return list.remove(t);
    }

    @Override
    public List<T> getAll() {
        return list;
    }
}