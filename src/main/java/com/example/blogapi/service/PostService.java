package com.example.blogapi.service;

import com.example.blogapi.dto.PostDto;
import com.example.blogapi.dto.PostResponse;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String direction);

    PostDto getPostById(Long id);

    PostDto updatePost(Long id, PostDto postDto);

    String deletePostById(Long id);
}
