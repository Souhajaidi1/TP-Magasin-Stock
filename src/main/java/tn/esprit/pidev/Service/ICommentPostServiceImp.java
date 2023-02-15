package tn.esprit.pidev.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.Entity.CommentPost;
import tn.esprit.pidev.Repository.CommentPostRepository;
import tn.esprit.pidev.generic.IGenericServiceImp;

@Service
@RequiredArgsConstructor
public class ICommentPostServiceImp extends IGenericServiceImp<CommentPost,Long> implements ICommentPostService{
    public final CommentPostRepository commentPostRepository;
}
