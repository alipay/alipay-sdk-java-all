package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 调整绑定层优先级
 *
 * @author auto create
 * @since 1.0, 2025-08-04 11:07:39
 */
public class AlipayCloudCloudbaseFunctionLayerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5115177876357481359L;

	/**
	 * 绑定配置
	 */
	@ApiListField("bindings")
	@ApiField("layer_binding")
	private List<LayerBinding> bindings;

	/**
	 * 小程序云应用APPID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	public List<LayerBinding> getBindings() {
		return this.bindings;
	}
	public void setBindings(List<LayerBinding> bindings) {
		this.bindings = bindings;
	}

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

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

}
