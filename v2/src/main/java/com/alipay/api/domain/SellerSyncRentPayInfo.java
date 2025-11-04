package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户同步的支付信息
 *
 * @author auto create
 * @since 1.0, 2025-07-10 10:54:21
 */
public class SellerSyncRentPayInfo extends AlipayObject {

	private static final long serialVersionUID = 6199162761145565268L;

	/**
	 * 实际支付金额，单位元
	 */
	@ApiField("act_pay_amount")
	private String actPayAmount;

	/**
	 * 实际支付时间
	 */
	@ApiField("act_pay_time")
	private Date actPayTime;

	/**
	 * 资金类型 租金：RENT、买断金：BUYOUT
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 交易组件分期单号
	 */
	@ApiField("installment_no")
	private String installmentNo;

	/**
	 * 优惠金额，单位元
	 */
	@ApiField("promo_amount")
	private String promoAmount;

	public String getActPayAmount() {
		return this.actPayAmount;
	}
	public void setActPayAmount(String actPayAmount) {
		this.actPayAmount = actPayAmount;
	}

	public Date getActPayTime() {
		return this.actPayTime;
	}
	public void setActPayTime(Date actPayTime) {
		this.actPayTime = actPayTime;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(String installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getPromoAmount() {
		return this.promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}

}
