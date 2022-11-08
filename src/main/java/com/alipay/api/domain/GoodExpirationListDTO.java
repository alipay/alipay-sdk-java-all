package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 临期食品列表
 *
 * @author auto create
 * @since 1.0, 2022-03-14 15:42:05
 */
public class GoodExpirationListDTO extends AlipayObject {

	private static final long serialVersionUID = 4427771693387812684L;

	/**
	 * 商品有效时长，单位:天，有临期食品时可填写，非必填。
	 */
	@ApiField("good_effective_duration")
	private Long goodEffectiveDuration;

	/**
	 * 商品有效截止时间(商品过期时间)，有临期食品时可填写，非必填。时间格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("good_expiration_time")
	private Date goodExpirationTime;

	/**
	 * 商品生产时间，有临期食品时可填写，非必填。时间格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("good_prd_time")
	private Date goodPrdTime;

	public Long getGoodEffectiveDuration() {
		return this.goodEffectiveDuration;
	}
	public void setGoodEffectiveDuration(Long goodEffectiveDuration) {
		this.goodEffectiveDuration = goodEffectiveDuration;
	}

	public Date getGoodExpirationTime() {
		return this.goodExpirationTime;
	}
	public void setGoodExpirationTime(Date goodExpirationTime) {
		this.goodExpirationTime = goodExpirationTime;
	}

	public Date getGoodPrdTime() {
		return this.goodPrdTime;
	}
	public void setGoodPrdTime(Date goodPrdTime) {
		this.goodPrdTime = goodPrdTime;
	}

}
