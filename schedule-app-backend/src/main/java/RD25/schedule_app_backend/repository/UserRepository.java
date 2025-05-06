package RD25.schedule_app_backend.repository;

import RD25.schedule_app_backend.model.User;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.jpa.repository.JpaRepository;

// Repository is the interfacae that lets us connect to the database, without writing any SQL code.
// Basically just gives us prebuilt functions like findAll(), save(), etc.
// We use CrudRepository

public interface UserRepository extends CrudRepository<User, Integer> {

}

// public interface UserRepository extends JpaRepository<User, Integer> {}