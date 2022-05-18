package com.kenli.actable.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.kenli.actable.model.SaveOrUpdateDataCommand;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * 已经废弃请勿使用有bug
 * @author sunchenbin
 *
 */
@Transactional
@Deprecated
@InterceptorIgnore(tenantLine = "true")
public interface BaseMysqlCRUDMapper {

	/**
	 * 保存
	 * @param saveOrUpdateDataCommand id+表结构的map
	 */
	 void save(SaveOrUpdateDataCommand saveOrUpdateDataCommand);

	/**
	 * 更新
	 * @param saveOrUpdateDataCommand id+表结构的map
	 */
	 void update(SaveOrUpdateDataCommand saveOrUpdateDataCommand);

	/**
	 * 删除
	 * @param tableMap 表结构的map
	 */
	 void delete(@Param("tableMap") Map<Object, Map<Object, Object>> tableMap);

	/**
	 * 查询
	 * @param tableMap 表结构的map
	 */
	 List<Map<String,Object>> search(@Param("tableMap") Map<Object, Object> tableMap);

	/**
	 * 查询的count
	 * @param tableMap 表结构的map
	 */
	 int searchCount(@Param("tableMap") Map<Object, Object> tableMap);

	/**
	 * 查询
	 * @param value 动态sql
	 */
	 List<LinkedHashMap<String,Object>> query(String value);

    /**
     * 更新，可以更新null
     * @param saveOrUpdateDataCommand
     */
     void updateWithNull(SaveOrUpdateDataCommand saveOrUpdateDataCommand);

}
