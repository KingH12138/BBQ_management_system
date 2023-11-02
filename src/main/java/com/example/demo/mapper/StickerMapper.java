package com.example.demo.mapper;

import com.example.demo.sticker.Sticker;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.lang.String;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jhb
 * @since 2023-10-29
 */
@Mapper
@Repository
public interface StickerMapper extends BaseMapper<Sticker> {
    List<Sticker> show_all_stickers();
    int insert_sticker(Sticker sticker);
    List<Sticker> SearchByKind(Sticker sticker);
    List<Sticker> SearchBySender(Sticker sticker);
    int DeleteById(Sticker sticker);
}