package org.example.rbac.service;
import org.example.mybatis.service.impl.BaseServiceImpl;
import org.example.rbac.dao.SysLogLoginDao;
import org.example.rbac.entity.SysLogLoginEntity;
import org.springframework.stereotype.Service;


/**
 * 登录日志业务实现类
 *
 * @author
 **/
@Service
public class SysLogLoginServiceImpl extends BaseServiceImpl<SysLogLoginDao, SysLogLoginEntity> implements SysLogLoginService {

}
