package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TradeAssocBillDetails;
import com.alipay.api.domain.FundBillListEco;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.pay.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 14:32:18
 */
public class AlipayEcoCplifePayResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4232612482891187147L;

	/** 
	 * 本次交易关联的账单详情
	 */
	@ApiField("assoc_bill_details")
	private TradeAssocBillDetails assocBillDetails;

	/** 
	 * 该笔缴费归属的支付宝房号，支付宝小区编号，和物业房间户号
	 */
	@ApiField("biz_entity_id")
	private String bizEntityId;

	/** 
	 * 缴费类型：
00--上传账单类缴费
CJ--欠费直查类缴费
YC--预存类缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 脱敏后的买家支付宝登录账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 交易支付使用的资金渠道
	 */
	@ApiField("fund_bill_list")
	private FundBillListEco fundBillList;

	/** 
	 * 交易完成付款时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 卖家（即物业缴费收款方）支付宝用户号
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 本次交易支付的订单金额，单位为人民币（元）
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 用户完成物业缴费对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setAssocBillDetails(TradeAssocBillDetails assocBillDetails) {
		this.assocBillDetails = assocBillDetails;
	}
	public TradeAssocBillDetails getAssocBillDetails( ) {
		return this.assocBillDetails;
	}

	public void setBizEntityId(String bizEntityId) {
		this.bizEntityId = bizEntityId;
	}
	public String getBizEntityId( ) {
		return this.bizEntityId;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setFundBillList(FundBillListEco fundBillList) {
		this.fundBillList = fundBillList;
	}
	public FundBillListEco getFundBillList( ) {
		return this.fundBillList;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
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

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
