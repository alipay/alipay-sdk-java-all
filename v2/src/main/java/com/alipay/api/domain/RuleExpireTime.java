package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务规则过期时间
 *
 * @author auto create
 * @since 1.0, 2023-08-04 13:57:07
 */
public class RuleExpireTime extends AlipayObject {

	private static final long serialVersionUID = 6588144958827781113L;

	/**
	 * 规则生效时间，当过期标识选true时必传
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 规则过期时间，当过期标识选true时必传
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 业务规则是否过期标识，true:过期限制，false:永不过期
	 */
	@ApiField("expire_type")
	private Boolean expireType;

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Boolean getExpireType() {
		return this.expireType;
	}
	public void setExpireType(Boolean expireType) {
		this.expireType = expireType;
	}

}
