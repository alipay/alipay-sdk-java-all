package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除路由绑定
 *
 * @author auto create
 * @since 1.0, 2023-08-09 11:07:39
 */
public class AlipayCloudCloudbaseHttpaccessBindDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2361657445634617214L;

	/**
	 * 路由绑定ID
	 */
	@ApiField("bind_id")
	private String bindId;

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

	public String getBindId() {
		return this.bindId;
	}
	public void setBindId(String bindId) {
		this.bindId = bindId;
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

}
