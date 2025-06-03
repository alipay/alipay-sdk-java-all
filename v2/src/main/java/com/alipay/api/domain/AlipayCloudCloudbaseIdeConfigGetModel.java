package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询调试上下文
 *
 * @author auto create
 * @since 1.0, 2023-08-22 20:32:02
 */
public class AlipayCloudCloudbaseIdeConfigGetModel extends AlipayObject {

	private static final long serialVersionUID = 2352589452272953373L;

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
	 * 密钥超时时长(分钟)
	 */
	@ApiField("key_expire_time")
	private Long keyExpireTime;

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

	public Long getKeyExpireTime() {
		return this.keyExpireTime;
	}
	public void setKeyExpireTime(Long keyExpireTime) {
		this.keyExpireTime = keyExpireTime;
	}

}
