package com.example.demo.controller;


import com.example.demo.mapper.StickerMapper;
import com.example.demo.sticker.Sticker;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
@RequestMapping("/sticker")
public class StickerController {
    @Autowired
    private StickerMapper stickerMapper;
    @RequestMapping("/")//之后必须在url后面加上user才能访问
    public List<Sticker> findall (){
        return stickerMapper.show_all_stickers();
    }
}
