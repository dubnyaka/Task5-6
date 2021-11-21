package com.example.rest_example.service;

import com.example.rest_example.model.Student;

import java.util.List;

public interface StudentService {

    /**
     * Создает нового студента
     * @param student - студент для создания
     */
    void create(Student student);

    /**
     * Возвращает список всех имеющихся студентов
     * @return список студентов
     */
    List<Student> readAll();

    /**
     * Возвращает студента по его ID
     * @param id - ID студента
     * @return - объект студента с заданным ID
     */
    Student read(int id);

    /**
     * Обновляет студента с заданным ID,
     * в соответствии с переданным студентом
     * @param client - студент в соответсвии с которым нужно обновить данные
     * @param id - id студента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Student client, int id);

    /**
     * Удаляет студента с заданным ID
     * @param id - id студента, которого нужно удалить
     * @return - true если студент был удален, иначе false
     */
    boolean delete(int id);
}