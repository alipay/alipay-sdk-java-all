package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违约金咨询信息
 *
 * @author auto create
 * @since 1.0, 2024-11-06 14:50:16
 */
public class DamagesConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 7821447233817158873L;

	/**
	 * 是否可以退卡
	 */
	@ApiField("can_close")
	private Boolean canClose;

	/**
	 * 违约金最大值，单位：分
	 */
	@ApiField("damages_cash")
	private Long damagesCash;

	/**
	 * 违约金比例
	 */
	@ApiField("damages_rate")
	private String damagesRate;

	/**
	 * 违约金类型
	 */
	@ApiField("damages_type")
	private String damagesType;

	/**
	 * 是否需要违约金
	 */
	@ApiField("need_damages")
	private Boolean needDamages;

	/**
	 * 退卡金额，单位：分
	 */
	@ApiField("refund_cash")
	private Long refundCash;

	public Boolean getCanClose() {
		return this.canClose;
	}
	public void setCanClose(Boolean canClose) {
		this.canClose = canClose;
	}

	public Long getDamagesCash() {
		return this.damagesCash;
	}
	public void setDamagesCash(Long damagesCash) {
		this.damagesCash = damagesCash;
	}

	public String getDamagesRate() {
		return this.damagesRate;
	}
	public void setDamagesRate(String damagesRate) {
		this.damagesRate = damagesRate;
	}

	public String getDamagesType() {
		return this.damagesType;
	}
	public void setDamagesType(String damagesType) {
		this.damagesType = damagesType;
	}

	public Boolean getNeedDamages() {
		return this.needDamages;
	}
	public void setNeedDamages(Boolean needDamages) {
		this.needDamages = needDamages;
	}

	public Long getRefundCash() {
		return this.refundCash;
	}
	public void setRefundCash(Long refundCash) {
		this.refundCash = refundCash;
	}

}
