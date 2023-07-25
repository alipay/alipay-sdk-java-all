package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.settlement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:40:27
 */
public class AlipayCommerceTransportVehicleownerSettlementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1283678978825247754L;

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
	 * 买家支付宝账户（收单为支付宝必返回）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 平台优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 交易支付使用的资金渠道（收单为支付宝必返回）
	 */
	@ApiListField("fund_bill_list")
	@ApiField("fund_bill")
	private List<FundBill> fundBillList;

	/** 
	 * 商家优惠金额
	 */
	@ApiField("m_discount_amount")
	private String mDiscountAmount;

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
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/** 
	 * 退款总金额， 单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 打款给卖家的时间（收单为支付宝必返回）
	 */
	@ApiField("send_pay_date")
	private Date sendPayDate;

	/** 
	 * 如果收单渠道为支付宝（默认）：
订单状态:
"I":"待支付";
"PI":"支付中";
"S":"支付成功";
"F":"支付失败";
"RI":"退款中";
"R":"已退款".

如果收单渠道为第三方：
订单状态：
"IN_PROCESSING":"受理中"; 
"PROCESS_SUCCESS":"处理成功"; 
"PROCESS_FAIL":"处理失败";
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 订单金额（收单为支付宝必返回）
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

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setFundBillList(List<FundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}
	public List<FundBill> getFundBillList( ) {
		return this.fundBillList;
	}

	public void setmDiscountAmount(String mDiscountAmount) {
		this.mDiscountAmount = mDiscountAmount;
	}
	public String getmDiscountAmount( ) {
		return this.mDiscountAmount;
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

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo( ) {
		return this.plateNo;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setSendPayDate(Date sendPayDate) {
		this.sendPayDate = sendPayDate;
	}
	public Date getSendPayDate( ) {
		return this.sendPayDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
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
