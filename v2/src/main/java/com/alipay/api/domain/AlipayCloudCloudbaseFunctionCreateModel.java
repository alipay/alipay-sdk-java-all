package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建云函数
 *
 * @author auto create
 * @since 1.0, 2025-05-16 15:14:18
 */
public class AlipayCloudCloudbaseFunctionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6576224569974614262L;

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
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 运行环境
 - nodejs16
 - nodejs18
 - python39
 - php74
 - java17
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 规格配置
 - 0.25c0.5g
 - 0.5c1g
 - 1c2g
	 */
	@ApiField("quota_name")
	private String quotaName;

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

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getImageName() {
		return this.imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getQuotaName() {
		return this.quotaName;
	}
	public void setQuotaName(String quotaName) {
		this.quotaName = quotaName;
	}

}
