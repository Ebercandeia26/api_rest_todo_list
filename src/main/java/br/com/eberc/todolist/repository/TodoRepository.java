package br.com.eberc.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eberc.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

    
    
}
