package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * http访问服务删除自定义域名
 *
 * @author auto create
 * @since 1.0, 2023-08-08 23:35:12
 */
public class AlipayCloudCloudbaseHttpaccessDomainDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1438935211386596954L;

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
	 * 域名
	 */
	@ApiField("name")
	private String name;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
