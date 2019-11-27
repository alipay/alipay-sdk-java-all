package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易收款
 *
 * @author auto create
 * @since 1.0, 2018-07-05 21:28:22
 */
public class MybankCreditSupplychainTradeProceedsApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5849645823519347837L;

	/**
	 * 申请日期，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 渠道，枚举如下：TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理，DSCYFRZ：大搜车预付融资，CNBILL：菜鸟电票，CHENGYISHE：诚e赊
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 贷款方案签名
	 */
	@ApiField("data_sign")
	private String dataSign;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 申请收款金额，单位元，等于订单金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 幂等编号，用于幂等控制，格式：机构ipRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 卖家会员信息
	 */
	@ApiField("seller")
	private Member seller;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付，PREPAYBILL：电票预付，CHENGYISHE：诚e赊
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDataSign() {
		return this.dataSign;
	}
	public void setDataSign(String dataSign) {
		this.dataSign = dataSign;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public Member getSeller() {
		return this.seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
