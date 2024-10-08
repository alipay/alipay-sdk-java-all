package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建指标计算任务
 *
 * @author auto create
 * @since 1.0, 2024-08-26 09:45:54
 */
public class AlipayCommerceTransportIntelligentizeTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5649485496133346882L;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 扩展参数，双方约定
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 请求的唯一值标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务任务名
	 */
	@ApiField("service_task_name")
	private String serviceTaskName;

	/**
	 * 枚举字段声明要计算的指标类型
	 */
	@ApiField("task_type")
	private String taskType;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceTaskName() {
		return this.serviceTaskName;
	}
	public void setServiceTaskName(String serviceTaskName) {
		this.serviceTaskName = serviceTaskName;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
