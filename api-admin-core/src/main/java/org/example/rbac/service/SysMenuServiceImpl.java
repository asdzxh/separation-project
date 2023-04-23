package org.example.rbac.service;
import lombok.AllArgsConstructor;
import org.example.mybatis.service.impl.BaseServiceImpl;
import org.example.rbac.dao.SysMenuDao;
import org.example.rbac.entity.SysMenuEntity;
import org.springframework.stereotype.Service;

/**
 * 系统菜单业务实现类
 *
 * @author
 */
@Service
@AllArgsConstructor
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

}
