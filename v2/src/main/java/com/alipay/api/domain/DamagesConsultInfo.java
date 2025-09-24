package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违约金咨询信息
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:38:54
 */
public class DamagesConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 8282587246356867492L;

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
	 * 违约金比例，单位：%，例如返回值是30，代表30%
	 */
	@ApiField("damages_rate")
	private String damagesRate;

	/**
	 * 违约金类型
	 */
	@ApiField("damages_type")
	private String damagesType;

	/**
	 * 注意 如果售卖订单在7天内没有核销使用过，退卡时是没有违约金的
	 */
	@ApiField("need_damages")
	private Boolean needDamages;

	/**
	 * 退卡金额，单位：分
	 */
	@ApiField("refund_cash")
	private Long refundCash;

	/**
	 * 不可以退卡的原因
	 */
	@ApiField("refuse_close_reason")
	private String refuseCloseReason;

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

	public String getRefuseCloseReason() {
		return this.refuseCloseReason;
	}
	public void setRefuseCloseReason(String refuseCloseReason) {
		this.refuseCloseReason = refuseCloseReason;
	}

}
