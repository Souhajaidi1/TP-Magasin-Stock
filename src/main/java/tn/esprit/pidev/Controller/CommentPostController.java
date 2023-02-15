package tn.esprit.pidev.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pidev.Entity.CommentPost;
import tn.esprit.pidev.Service.ICommentPostService;
import tn.esprit.pidev.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/comment")
public class CommentPostController extends GenericController<CommentPost,Long> {
    public final ICommentPostService iCommentPostService;
}
