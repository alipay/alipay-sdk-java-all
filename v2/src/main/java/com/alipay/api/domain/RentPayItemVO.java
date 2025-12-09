package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单支付费项
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:59:01
 */
public class RentPayItemVO extends AlipayObject {

	private static final long serialVersionUID = 5733394551418635784L;

	/**
	 * 第几期租金，从1开始
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 当前费用项支付金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 用户支付时，实际申领的支付宝平台优惠金额，单位：元,精确到小数点后两位
	 */
	@ApiField("promo")
	private String promo;

	/**
	 * 商家租中减收费用时传，单位：元，精确到小数点后两位。
	 */
	@ApiField("reduction")
	private String reduction;

	/**
	 * 订单费用类型
	 */
	@ApiField("type")
	private String type;

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPromo() {
		return this.promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}

	public String getReduction() {
		return this.reduction;
	}
	public void setReduction(String reduction) {
		this.reduction = reduction;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
