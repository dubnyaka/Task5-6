package com.example.rest_example.service;

import com.example.rest_example.model.StudentsGroup;

import java.util.List;

public interface StudentGroupService {

    /**
     * Создает нового клиента
     * @param group - группа студентов для создания
     */
    void create(StudentsGroup group);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<StudentsGroup> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    StudentsGroup read(int id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param group - группа студентов в соответсвии с которой нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(StudentsGroup group, int id);

    /**
     * Удаляет клиента с заданным ID
     * @param id - id группы студентов, которую нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);
}