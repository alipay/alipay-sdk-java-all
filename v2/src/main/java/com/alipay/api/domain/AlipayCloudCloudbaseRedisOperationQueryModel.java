package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取任务列表
 *
 * @author auto create
 * @since 1.0, 2025-04-09 11:16:16
 */
public class AlipayCloudCloudbaseRedisOperationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4141743881181971727L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 过滤内容
	 */
	@ApiField("filter_content")
	private String filterContent;

	/**
	 * 任务类型，执行状态等, 0:不需要过滤条件，1:按照任务类型，2:任务状态
	 */
	@ApiField("filter_type")
	private Long filterType;

	/**
	 * 实例名称
	 */
	@ApiField("instance_name")
	private String instanceName;

	/**
	 * 区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 机房
	 */
	@ApiField("zone")
	private String zone;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getFilterContent() {
		return this.filterContent;
	}
	public void setFilterContent(String filterContent) {
		this.filterContent = filterContent;
	}

	public Long getFilterType() {
		return this.filterType;
	}
	public void setFilterType(Long filterType) {
		this.filterType = filterType;
	}

	public String getInstanceName() {
		return this.instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getZone() {
		return this.zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

}
