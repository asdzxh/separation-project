package org.example.dao;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.NoticeEntity;
import org.example.mybatis.dao.BaseDao;


/**
 * NoticeDao
 *
 * @author
 **/
@Mapper
public interface NoticeDao extends BaseDao<NoticeEntity> {

}
