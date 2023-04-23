package org.example.rbac.dao;
import org.apache.ibatis.annotations.Mapper;
import org.example.mybatis.dao.BaseDao;
import org.example.rbac.entity.SysMenuEntity;


import java.util.List;


/**
 * 菜单管理 dao
 *
 * @author
 */
@Mapper
public interface SysMenuDao extends BaseDao<SysMenuEntity> {

}
