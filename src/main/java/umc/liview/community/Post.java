package umc.liview.community;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import umc.liview.tour.domain.Tour;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "view_counts")
    private int viewCounts;
    @Enumerated(EnumType.STRING)
    @Column(name = "post_status")
    private PostStatus postStatus;

    @OneToOne(mappedBy = "post")
    private Tour tour;
    @OneToMany(mappedBy = "post")
    private List<Comments> comments = new ArrayList<>();
    @OneToMany(mappedBy = "post")
    private List<Likes> likes = new ArrayList<>();

    @Getter
    @RequiredArgsConstructor
    public enum PostStatus {
        PUBLIC("공개"),
        PRIVATE("비공개");

        private final String status;
    }
}
