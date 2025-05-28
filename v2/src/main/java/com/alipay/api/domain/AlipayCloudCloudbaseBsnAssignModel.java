package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 将申请的备案服务码授权给阿里云指定账号
 *
 * @author auto create
 * @since 1.0, 2024-06-27 15:09:07
 */
public class AlipayCloudCloudbaseBsnAssignModel extends AlipayObject {

	private static final long serialVersionUID = 1776712621233418216L;

	/**
	 * 阿里云账号ID
	 */
	@ApiField("aliuid")
	private String aliuid;

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
	 * 备案服务码
	 */
	@ApiField("bsn")
	private String bsn;

	public String getAliuid() {
		return this.aliuid;
	}
	public void setAliuid(String aliuid) {
		this.aliuid = aliuid;
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

	public String getBsn() {
		return this.bsn;
	}
	public void setBsn(String bsn) {
		this.bsn = bsn;
	}

}
