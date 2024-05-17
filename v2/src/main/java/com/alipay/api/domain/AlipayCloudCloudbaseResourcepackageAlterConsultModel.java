package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变配资源包询价
 *
 * @author auto create
 * @since 1.0, 2024-05-13 16:20:22
 */
public class AlipayCloudCloudbaseResourcepackageAlterConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8472129323889376985L;

	/**
	 * 待变配的规格编码
	 */
	@ApiField("alter_spec_code")
	private String alterSpecCode;

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

	public String getAlterSpecCode() {
		return this.alterSpecCode;
	}
	public void setAlterSpecCode(String alterSpecCode) {
		this.alterSpecCode = alterSpecCode;
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
