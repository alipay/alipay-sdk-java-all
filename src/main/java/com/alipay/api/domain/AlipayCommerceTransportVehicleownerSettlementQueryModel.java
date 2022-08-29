package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务订单查询接口
 *
 * @author auto create
 * @since 1.0, 2021-08-10 20:37:53
 */
public class AlipayCommerceTransportVehicleownerSettlementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3133189865758431968L;

	/**
	 * 业务扣款协议号，由用户申请办理时生成并同步给外部。非支付宝收单必传。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 订单支付时传入的商户订单号，商户订单号和交易号两者不能同时为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 收单机构交易流水号，商户订单号和交易流水号两者不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
