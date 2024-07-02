package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻Go解冻接口
 *
 * @author auto create
 * @since 1.0, 2024-05-08 10:40:15
 */
public class ZhimaCreditPeZmgoSettleUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 6177716347536375975L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 解冻成功时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 解冻的描述
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。由商户传入，最终返回给商户。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 解冻金额
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

	/**
	 * 解冻相关拓展字段
	 */
	@ApiField("unfreeze_extend_params")
	private UnfreezeExtendParams unfreezeExtendParams;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getUnfreezeAmount() {
		return this.unfreezeAmount;
	}
	public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

	public UnfreezeExtendParams getUnfreezeExtendParams() {
		return this.unfreezeExtendParams;
	}
	public void setUnfreezeExtendParams(UnfreezeExtendParams unfreezeExtendParams) {
		this.unfreezeExtendParams = unfreezeExtendParams;
	}

}
