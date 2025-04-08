package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车预授权扣款
 *
 * @author auto create
 * @since 1.0, 2024-05-24 16:22:56
 */
public class AlipayEcoMycarRentcarPreauthPayModel extends AlipayObject {

	private static final long serialVersionUID = 4484219699967944761L;

	/**
	 * 扣款金额，单位分
	 */
	@ApiField("deduct_amount")
	private Long deductAmount;

	/**
	 * 商户告知车生活押金扣款原因
	 */
	@ApiField("deduct_reason")
	private String deductReason;

	/**
	 * 费用类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扣款的外部交易号，车生活侧通过此字段进行幂等控制，同一笔预授权的多次扣款要使用不同的交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Long getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(Long deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getDeductReason() {
		return this.deductReason;
	}
	public void setDeductReason(String deductReason) {
		this.deductReason = deductReason;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
