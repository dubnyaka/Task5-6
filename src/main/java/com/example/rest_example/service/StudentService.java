package com.example.rest_example.service;

import com.example.rest_example.model.Student;

import java.util.List;

public interface StudentService {

    /**
     * Создает нового клиента
     * @param client - клиент для создания
     */
    void create(Student client);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<Student> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    Student read(int id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param client - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Student client, int id);

    /**
     * Удаляет клиента с заданным ID
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);
}