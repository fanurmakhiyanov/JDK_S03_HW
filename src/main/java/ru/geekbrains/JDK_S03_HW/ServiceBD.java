package ru.geekbrains.JDK_S03_HW;

import java.net.http.HttpResponse;
import java.util.List;

/**
 * Создайте интерфейс, который определяет набор методов для работы с базой данных
 * (например, сохранение, удаление, получение данных).
 * Реализуйте этот интерфейс в конкретном классе.
 */
public interface ServiceBD<T> {

    boolean save(T t);
    boolean delete(T t);
    List<T> getAll();

}