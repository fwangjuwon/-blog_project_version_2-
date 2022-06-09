package site.metacoding.blog_project_version_2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.blog_project_version_2.service.post.PostService;

@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostService postService;

    @GetMapping("/")
    public String main() {
        return "post/list";
    }
}
