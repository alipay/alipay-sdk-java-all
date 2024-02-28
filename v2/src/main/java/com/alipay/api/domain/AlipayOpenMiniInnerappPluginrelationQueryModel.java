package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询插件引用关系
 *
 * @author auto create
 * @since 1.0, 2021-06-01 10:44:34
 */
public class AlipayOpenMiniInnerappPluginrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7182242891622419964L;

	/**
	 * 应用ID列表
	 */
	@ApiListField("mini_app_id_list")
	@ApiField("string")
	private List<String> miniAppIdList;

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
	 * 插件ID
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 插件使用关系状态，取值包括WORKING/WAIT_WORKING/STOP_WORKING/EXECUTING
	 */
	@ApiListField("plugin_relation_status_list")
	@ApiField("string")
	private List<String> pluginRelationStatusList;

	/**
	 * 运行类型，取值包括ONLINE/TRIAL/REVIEW/DEBUG
	 */
	@ApiField("run_model_type")
	private String runModelType;

	/**
	 * 是否展示邀测信息
	 */
	@ApiField("show_beta_info")
	private Boolean showBetaInfo;

	public List<String> getMiniAppIdList() {
		return this.miniAppIdList;
	}
	public void setMiniAppIdList(List<String> miniAppIdList) {
		this.miniAppIdList = miniAppIdList;
	}

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

	public Boolean getShowBetaInfo() {
		return this.showBetaInfo;
	}
	public void setShowBetaInfo(Boolean showBetaInfo) {
		this.showBetaInfo = showBetaInfo;
	}

}
