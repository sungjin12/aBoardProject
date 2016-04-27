package kr.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
