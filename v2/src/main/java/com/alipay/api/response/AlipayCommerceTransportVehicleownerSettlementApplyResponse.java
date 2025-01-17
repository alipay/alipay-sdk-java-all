package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.settlement.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:00
 */
public class AlipayCommerceTransportVehicleownerSettlementApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7523322937352448349L;

	/** 
	 * 收单机构渠道码，该字段不返回默认为ALIPAY
	 */
	@ApiField("aquirer")
	private String aquirer;

	/** 
	 * 业务扩展参数
	 */
	@ApiField("biz_ext_info")
	private String bizExtInfo;

	/** 
	 * 买家在支付宝的用户id（收单为支付宝必返回）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 交易支付使用的资金渠道（收单为支付宝必返回）
	 */
	@ApiListField("fund_bill_list")
	@ApiField("fund_bill")
	private List<FundBill> fundBillList;

	/** 
	 * 如果收单渠道支付宝（默认）：交易支付时间
如果收单渠道为第三方：为渠道处理成功的时间，具体业务语义由渠道定义。
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 应用维度的用户Id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付金额（收单为支付宝必返回）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/** 
	 * 如果收单渠道为支付宝（默认）：
"I":"待支付";
"PI":"支付中";
"S":"支付成功";
"F":"支付失败";
"RI":"退款中";
"R":"已退款".
如果收单渠道为第三方：
"IN_PROCESSING":"受理中"; 
"PROCESS_SUCCESS":"处理成功"; 
"PROCESS_FAIL":"处理失败";
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 收单机构交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAquirer(String aquirer) {
		this.aquirer = aquirer;
	}
	public String getAquirer( ) {
		return this.aquirer;
	}

	public void setBizExtInfo(String bizExtInfo) {
		this.bizExtInfo = bizExtInfo;
	}
	public String getBizExtInfo( ) {
		return this.bizExtInfo;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setFundBillList(List<FundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}
	public List<FundBill> getFundBillList( ) {
		return this.fundBillList;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo( ) {
		return this.plateNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
