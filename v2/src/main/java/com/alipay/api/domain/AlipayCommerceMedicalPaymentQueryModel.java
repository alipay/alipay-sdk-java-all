package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保线上支付订单查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:09:06
 */
public class AlipayCommerceMedicalPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5465533758185179866L;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 渠道订单流水号,取值为调用下单接口中返回的渠道渠道订单号流水号字段
	 */
	@ApiField("chnl_order_sn")
	private String chnlOrderSn;

	/**
	 * 医院订单号(商户需保证appId维度唯一)
	 */
	@ApiField("med_org_ord")
	private String medOrgOrd;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 医保电子凭证线上身份核验服务反馈单中的定点医疗机构编码
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 外部订单类型
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 第三方平台商单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付订单号（处方上传的出参订单号）
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 支付宝侧自费交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChnlOrderSn() {
		return this.chnlOrderSn;
	}
	public void setChnlOrderSn(String chnlOrderSn) {
		this.chnlOrderSn = chnlOrderSn;
	}

	public String getMedOrgOrd() {
		return this.medOrgOrd;
	}
	public void setMedOrgOrd(String medOrgOrd) {
		this.medOrgOrd = medOrgOrd;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
