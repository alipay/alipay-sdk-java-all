package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 插件使用关系查询
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:32:30
 */
public class AlipayOpenMiniPluginuseconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7217723963971237249L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 插件appid
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 取值包括WORKING（启用）/WAIT_WORKING(待启用)/STOP_WORKING(停止)/EXECUTING(实施中)
	 */
	@ApiListField("plugin_relation_status_list")
	@ApiField("string")
	private List<String> pluginRelationStatusList;

	/**
	 * 运行模式，取值包括ONLINE(线上)/TRIAL(联调)
	 */
	@ApiField("run_model_type")
	private String runModelType;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public List<String> getPluginRelationStatusList() {
		return this.pluginRelationStatusList;
	}
	public void setPluginRelationStatusList(List<String> pluginRelationStatusList) {
		this.pluginRelationStatusList = pluginRelationStatusList;
	}

	public String getRunModelType() {
		return this.runModelType;
	}
	public void setRunModelType(String runModelType) {
		this.runModelType = runModelType;
	}

}
