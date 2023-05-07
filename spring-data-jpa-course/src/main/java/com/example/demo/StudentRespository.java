package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student, Long> //Entity and its identifier data type
{
}
