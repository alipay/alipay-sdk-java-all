package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单退款信息
 *
 * @author auto create
 * @since 1.0, 2025-11-05 13:42:34
 */
public class RentRefundInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6623683567863956389L;

	/**
	 * 支付创建时传入的商户外部交易ID
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付订单的支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付后退款流水信息
	 */
	@ApiListField("rent_refund_trans_infos")
	@ApiField("rent_refund_trans_v_o")
	private List<RentRefundTransVO> rentRefundTransInfos;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public List<RentRefundTransVO> getRentRefundTransInfos() {
		return this.rentRefundTransInfos;
	}
	public void setRentRefundTransInfos(List<RentRefundTransVO> rentRefundTransInfos) {
		this.rentRefundTransInfos = rentRefundTransInfos;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
