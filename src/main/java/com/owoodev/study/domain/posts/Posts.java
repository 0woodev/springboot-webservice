package com.owoodev.study.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Entity 클래스에는 Setter 메서드를 절대 만들지 않습니다.<br>
 * 대신 해당 필드의 값 변경이 필요하면, 명확히 그 목적과 의도를 나타낼 수 있는 메서드를 추가해야만 한다.<br>
 * <br>
 * lombok Annotation 은 코드를 단순화시켜주지만, 필수는 아니다.<br>
 * 따라서, 조금 더 중요한 Annotation 을 class 에 가깝게 둔다.
 * <br>
 * Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이며, 보통 Entity 클래스라고 한다.<br>
 * <br>
 * @ Entity : 테이블과 링크될 클래스임을 나타낸다. <br><Br>
 * @ Id : 해당 테이블의 PK 필드를 나타낸다.<br>
 * <Br>
 * @ GeneratedValue<br>
 * <ul>
 *     <li>PK 의 생성규칙을 나타낸다.</li>
 *     <li>스프링 부트2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment 가 된다.</li>
 * </ul>
 * <Br>
 * @ Column <br>
 * <ul>
 *     <li>테이블의 칼럼을 나타내며, 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 된다.</li>
 *     <li>기본값 외에 추가로 변경이 필요한 옵션이 있는 경우 사용한다.</li>
 *     <li>밑의 사용되는 이유는 다음과 같다</li>
 *     <ul>
 *         <li>문자열의 경우 VARCHAR(255) 가 기본값인데, 사이즈를 500 으로 늘리고 싶은경우</li>
 *         <li>타입을 TEXT로 변경하고 싶거나 할때</li>
 *     </ul>
 * </ul>
 */
@Getter             // lombok Annotation
@NoArgsConstructor  // lombok Annotation
@Entity             // JPA Annotation
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /**
     * 해당 클래스의 빌더 패턴 클래스를 생성<br>
     * 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함<br>
     * @param title String
     * @param content String
     * @param author String
     */
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
