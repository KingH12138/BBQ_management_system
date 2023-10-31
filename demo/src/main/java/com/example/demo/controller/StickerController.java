package com.example.demo.controller;


import com.example.demo.dto.InsertSticker;
import com.example.demo.mapper.StickerMapper;
import com.example.demo.service.StickerService;
import com.example.demo.service.UserService;
import com.example.demo.sticker.Sticker;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jhb
 * @since 2023-10-29
 */
@CrossOrigin("*")
@RestController
public class StickerController {
    @Autowired
    private StickerMapper stickerMapper;
    @Autowired
    private StickerService stickerService;
    @RequestMapping("/stickers")//之后必须在url后面加上user才能访问  //查询所有的帖子
    public List<Sticker> findall (){
        return stickerMapper.show_all_stickers();
    }
    @RequestMapping("/WriteSticker")    //插入一个帖子
    public int insert(@RequestBody  Sticker sticker){
//        System.out.println(sticker);
        return stickerMapper.insert_sticker(sticker);
    }
}
