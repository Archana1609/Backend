package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Models.Gadgets;
@Repository
public interface ApiRepo extends JpaRepository<Gadgets,Integer>
{
}
