package org.example.rbac.service;
import lombok.AllArgsConstructor;
import org.example.mybatis.service.impl.BaseServiceImpl;
import org.example.rbac.dao.SysUserDao;
import org.example.rbac.entity.SysUserEntity;
import org.springframework.stereotype.Service;


/**
 * 系统用户业务实现类
 *
 * @author
 */
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends BaseServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

}
