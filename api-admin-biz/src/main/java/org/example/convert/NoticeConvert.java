package org.example.convert;

import org.example.entity.NoticeEntity;
import org.example.vo.NoticeVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

/**
 * Notice 实体转换
 *
 * @author
 **/
@Mapper
public interface NoticeConvert {
    NoticeConvert INSTANCE = Mappers.getMapper(NoticeConvert.class);

    NoticeVO convert(NoticeEntity entity);

    NoticeEntity convert(NoticeVO vo);

    List<NoticeVO> convertList(List<NoticeEntity> list);

}
