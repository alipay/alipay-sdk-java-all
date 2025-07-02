package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改Https证书托管状态
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:20:09
 */
public class AlipayCloudCloudbaseHttpscerthostingModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7828268721953224652L;

	/**
	 * 小程序云APPID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云ENVID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 证书托管是否开启
	 */
	@ApiField("open")
	private Boolean open;

	/**
	 * 对外唯一标识
	 */
	@ApiField("uid")
	private String uid;

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

	public Boolean getOpen() {
		return this.open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
