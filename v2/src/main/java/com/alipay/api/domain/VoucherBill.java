package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券交易账单信息(核销交易信息、交易退款信息等可能存在多条)
 *
 * @author auto create
 * @since 1.0, 2019-11-20 20:49:54
 */
public class VoucherBill extends AlipayObject {

	private static final long serialVersionUID = 5337984121779917913L;

	/**
	 * 券核销/退款金额(单位：元)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 账单类型(V_USE:支付,V_REFUND:退款)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 交易时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商户名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 交易状态(I: 处理中, S: 成功)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
