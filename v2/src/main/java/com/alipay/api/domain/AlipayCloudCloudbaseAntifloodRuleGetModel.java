package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取防刷规则信息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 17:40:59
 */
public class AlipayCloudCloudbaseAntifloodRuleGetModel extends AlipayObject {

	private static final long serialVersionUID = 8643766284948962462L;

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
	 * IP或IP段
	 */
	@ApiField("cidr_block")
	private String cidrBlock;

	/**
	 * 规则来源
 - BARRIER
 - BLACKLIST
	 */
	@ApiField("source")
	private String source;

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

	public String getCidrBlock() {
		return this.cidrBlock;
	}
	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
