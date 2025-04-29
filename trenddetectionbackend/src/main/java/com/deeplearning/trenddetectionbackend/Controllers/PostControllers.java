package com.deeplearning.trenddetectionbackend.Controllers;


import com.deeplearning.trenddetectionbackend.Entities.Post;
import com.deeplearning.trenddetectionbackend.Services.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/posts")
public class PostControllers {

    private final PostService postService;

    public PostControllers(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public Page<Post> getALlPosts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "desc") String sortDir
    ){
        Sort sort = sortDir.equalsIgnoreCase("asc")?
                Sort.by("postedAt").ascending():Sort.by("postedAt").descending();
        Pageable pageable = PageRequest.of(page, size, sort);

        return postService.getAllPosts(pageable);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Post> getOnePost(@PathVariable String id){

        return postService.getPostById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }
}
