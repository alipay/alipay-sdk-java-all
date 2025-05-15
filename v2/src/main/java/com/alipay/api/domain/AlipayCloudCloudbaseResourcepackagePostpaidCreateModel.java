package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 按量付费开通下单
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:35:45
 */
public class AlipayCloudCloudbaseResourcepackagePostpaidCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2367684291523321142L;

	/**
	 * 小程序云应用APPID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境描述
	 */
	@ApiField("env_description")
	private String envDescription;

	/**
	 * 环境名称，只能包含数字、小写字母和-，只能以小写字母开头且不超过20个字符
	 */
	@ApiField("env_name")
	private String envName;

	/**
	 * 环境区域
 - cn-hangzhou
	 */
	@ApiField("region")
	private String region;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getEnvDescription() {
		return this.envDescription;
	}
	public void setEnvDescription(String envDescription) {
		this.envDescription = envDescription;
	}

	public String getEnvName() {
		return this.envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
