package com.owoodev.study.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Entity 클래스와 Repository 인터페이스는 함께 위치해야한다.<br>
 * 프로젝트의 규모가 커져서 도메인별로 프로젝트를 분리해야 한다면, 두개의 파일은 함께 관리해야한다.<br>
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
