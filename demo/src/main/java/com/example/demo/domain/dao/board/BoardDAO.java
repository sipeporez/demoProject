package com.example.demo.domain.dao.board;


import com.example.demo.domain.dao.member.MemberDAO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board", indexes = {
        @Index(name = "idx_desc_index", columnList = "idx DESC")
})
public class BoardDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", referencedColumnName = "userid",
            nullable = false,
    foreignKey = @ForeignKey(name = "fk_userid_for_board"))
    private MemberDAO member;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 5000, nullable = false)
    private String content;

    @CreationTimestamp
    private LocalDateTime writtenDate;

    @Column(name = "like_cnt", nullable = false)
    @Builder.Default
    private Long likeCnt = 0L;
}