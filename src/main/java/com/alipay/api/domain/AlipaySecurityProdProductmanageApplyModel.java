package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品管理服务流程处理接口
 *
 * @author auto create
 * @since 1.0, 2019-06-28 10:53:12
 */
public class AlipaySecurityProdProductmanageApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5626274612125594759L;

	/**
	 * 产品动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 环境数据
	 */
	@ApiField("env_data")
	private String envData;

	/**
	 * 产品管理初始化token
	 */
	@ApiField("init_token")
	private String initToken;

	/**
	 * 产品管理操作类型
	 */
	@ApiField("module")
	private String module;

	/**
	 * 扩展信息
	 */
	@ApiField("params")
	private String params;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getEnvData() {
		return this.envData;
	}
	public void setEnvData(String envData) {
		this.envData = envData;
	}

	public String getInitToken() {
		return this.initToken;
	}
	public void setInitToken(String initToken) {
		this.initToken = initToken;
	}

	public String getModule() {
		return this.module;
	}
	public void setModule(String module) {
		this.module = module;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}
