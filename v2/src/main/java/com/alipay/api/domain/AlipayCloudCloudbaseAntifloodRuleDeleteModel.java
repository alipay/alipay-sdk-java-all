package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除防刷规则
 *
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:21
 */
public class AlipayCloudCloudbaseAntifloodRuleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4752988794486828399L;

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
