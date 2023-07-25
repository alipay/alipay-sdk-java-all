package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻用户信用额度解冻
 *
 * @author auto create
 * @since 1.0, 2022-11-14 14:19:14
 */
public class ZhimaCreditPeUserCreditUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 7161746696197589856L;

	/**
	 * 解冻额度，单位为元，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 买家的支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 解冻时扩展信息，子订单扩展信息，json格式字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 接入商家的订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 卖家的支付宝id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商户子订单号，一个子订单号只能对应一个主订单号(out_order_no)
	 */
	@ApiField("sub_out_order_no")
	private String subOutOrderNo;

	/**
	 * 解冻类型(退款解冻/支付解冻)，可选值分别是refund_unfreeze/pay_unfreeze；
	 */
	@ApiField("unfreeze_type")
	private String unfreezeType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSubOutOrderNo() {
		return this.subOutOrderNo;
	}
	public void setSubOutOrderNo(String subOutOrderNo) {
		this.subOutOrderNo = subOutOrderNo;
	}

	public String getUnfreezeType() {
		return this.unfreezeType;
	}
	public void setUnfreezeType(String unfreezeType) {
		this.unfreezeType = unfreezeType;
	}

}
