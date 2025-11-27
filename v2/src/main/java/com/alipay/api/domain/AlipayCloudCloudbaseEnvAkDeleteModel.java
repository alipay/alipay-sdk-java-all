package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除 Access Key
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:40:40
 */
public class AlipayCloudCloudbaseEnvAkDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5462651367876142443L;

	/**
	 * ak
	 */
	@ApiField("access_key_id")
	private String accessKeyId;

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

	public String getAccessKeyId() {
		return this.accessKeyId;
	}
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
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
