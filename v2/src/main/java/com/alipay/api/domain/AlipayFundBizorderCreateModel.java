package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单创建
 *
 * @author auto create
 * @since 1.0, 2023-01-09 15:59:52
 */
public class AlipayFundBizorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3211729866998642148L;

	/**
	 * 转账请求的扩展参数，具体请与支付宝工程师联系
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 业务订单标题，用于在支付宝用户的账单里显示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务订单所属商户ID
	 */
	@ApiField("partner_user_id")
	private String partnerUserId;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private Participant payeeInfo;

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerUserId() {
		return this.partnerUserId;
	}
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	public Participant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(Participant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

}
