package org.example.rbac.service.impl;
import org.example.mybatis.service.impl.BaseServiceImpl;
import org.example.rbac.dao.SysLogLoginDao;
import org.example.rbac.entity.SysLogLoginEntity;
import org.example.rbac.service.SysLogLoginService;
import org.springframework.stereotype.Service;


/**
 * 登录日志业务实现类
 *
 * @author
 **/
@Service
public class SysLogLoginServiceImpl extends BaseServiceImpl<SysLogLoginDao, SysLogLoginEntity> implements SysLogLoginService {

}
