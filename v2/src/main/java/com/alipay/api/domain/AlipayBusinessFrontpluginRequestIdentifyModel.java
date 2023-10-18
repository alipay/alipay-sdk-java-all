package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前端插件请求身份识别
 *
 * @author auto create
 * @since 1.0, 2023-10-07 13:48:29
 */
public class AlipayBusinessFrontpluginRequestIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 5652823489614419997L;

	/**
	 * 操作用户登录账号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作用户主账号
	 */
	@ApiField("operator_master_id")
	private String operatorMasterId;

	/**
	 * 操作用户类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 前端插件输入参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 前端插件唯一标识ID
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 服务唯一标识ID
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorMasterId() {
		return this.operatorMasterId;
	}
	public void setOperatorMasterId(String operatorMasterId) {
		this.operatorMasterId = operatorMasterId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
