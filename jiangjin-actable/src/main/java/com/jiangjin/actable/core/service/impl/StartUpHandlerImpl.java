package com.jiangjin.actable.core.service.impl;

import com.jiangjin.actable.api.annotation.constants.Constants;
import com.jiangjin.actable.api.utils.ConfigurationUtil;
import com.jiangjin.actable.core.service.StartUpHandler;
import com.jiangjin.actable.core.service.SysMysqlCreateTableManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 启动时进行处理的实现类
 *
 * @author chenbin.sun
 */
@SuppressWarnings("restriction")
@Service
@Slf4j
public class StartUpHandlerImpl implements StartUpHandler {


    @Resource
    private ConfigurationUtil springContextUtil;

    /**
     * 数据库类型：mysql
     */
    public static String MYSQL = "mysql";

    /**
     * 数据库类型：oracle
     */
    public static String ORACLE = "oracle";

    /**
     * 数据库类型：sqlserver
     */
    public static String SQLSERVER = "sqlserver";

    /**
     * 数据库类型：postgresql
     */
    public static String POSTGRESQL = "postgresql";

    @Resource
    private SysMysqlCreateTableManager sysMysqlCreateTableManager;

    @Override
    @PostConstruct
    public void startHandler() {
        // 数据库类型
        String databaseType = springContextUtil.getConfig(Constants.DATABASE_TYPE_KEY) == null ? MYSQL : springContextUtil.getConfig(Constants.DATABASE_TYPE_KEY);
        // 执行mysql的处理方法
        if (MYSQL.equals(databaseType)) {
            log.info("databaseType=mysql，开始执行mysql的处理方法");
            sysMysqlCreateTableManager.createMysqlTable();
        } else if (ORACLE.equals(databaseType)) {
            log.info("databaseType=oracle，开始执行oracle的处理方法");
        } else if (SQLSERVER.equals(databaseType)) {
            log.info("databaseType=sqlserver，开始执行sqlserver的处理方法");
        } else if (POSTGRESQL.equals(databaseType)) {
            log.info("databaseType=postgresql，开始执行postgresql的处理方法");
        } else {
            log.info("没有找到符合条件的处理方法！");
        }
    }
}