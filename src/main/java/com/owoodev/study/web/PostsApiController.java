package com.owoodev.study.web;

import com.owoodev.study.service.posts.PostsService;
import com.owoodev.study.web.dto.PostsResponseDto;
import com.owoodev.study.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
