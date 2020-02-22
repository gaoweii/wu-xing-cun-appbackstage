package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.comment;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scenicarea")
public class CommentController {
    private CommentList commentList;
    @RequestMapping(value = "/commentlist", method = RequestMethod.POST)
    public String getCommentList(@RequestParam int id) {
        commentList = new CommentList();
        return JSON.toJSONString(commentList);
    }
}
