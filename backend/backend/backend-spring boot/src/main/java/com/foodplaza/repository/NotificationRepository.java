package com.foodplaza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodplaza.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	public List<Notification> findByCustomerId(Long userId);
	public List<Notification> findByRestaurantId(Long restaurantId);

}
