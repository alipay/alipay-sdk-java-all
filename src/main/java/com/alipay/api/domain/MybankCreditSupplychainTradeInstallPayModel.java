package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易分期
 *
 * @author auto create
 * @since 1.0, 2018-07-05 22:33:53
 */
public class MybankCreditSupplychainTradeInstallPayModel extends AlipayObject {

	private static final long serialVersionUID = 4799571374788556291L;

	/**
	 * 申请分期额度，单位元，必须和所有订单总金额相等
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 申请日期，格式：yyyy-mm-dd
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 买家会员信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道，枚举如下：TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理，DSCYFRZ：大搜车预付融资，CNBILL：菜鸟电票，CHENGYISHE：诚e赊
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 签名
	 */
	@ApiField("data_sign")
	private String dataSign;

	/**
	 * 订单数量
	 */
	@ApiField("order_num")
	private Long orderNum;

	/**
	 * 订单号列表,必须与订单数量匹配
订单号格式：机构ipRoleId_外部订单号
	 */
	@ApiListField("out_order_list")
	@ApiField("string")
	private List<String> outOrderList;

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
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付，PREPAYBILL：电票预付，CHENGYISHE：诚e赊
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
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

	public Long getOrderNum() {
		return this.orderNum;
	}
	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}

	public List<String> getOutOrderList() {
		return this.outOrderList;
	}
	public void setOutOrderList(List<String> outOrderList) {
		this.outOrderList = outOrderList;
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

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
