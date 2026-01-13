package model.dao;

import model.entitites.Department;

import java.util.List;

public interface DepartmentDao {

    void inset(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
