package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行预付融资订单创建
 *
 * @author auto create
 * @since 1.0, 2023-01-05 15:07:25
 */
public class MybankPaymentTradeFinancingOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1796783565939588464L;

	/**
	 * 交易金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 填ANT_OPEN -表示开发平台
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 外部订单号，阿里云或外部商业平台订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 融易收卡号（路由使用）
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 交易币种，默认：156
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 合作机构编码，如aliyun
	 */
	@ApiField("ext_partner")
	private String extPartner;

	/**
	 * 购买的商品详情，JSON格式，UTF-8编码，如购买的商品信息：商品名称，购买件数等
	 */
	@ApiField("goods_info")
	private String goodsInfo;

	/**
	 * 商业平台会员ID，开通子户场景必填
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 订单关闭时间，格式yyyyMMddHHmmss
	 */
	@ApiField("order_close_time")
	private String orderCloseTime;

	/**
	 * 订单扩展字段，JSON格式，key如下：
买家支付宝Id，
卖家支付宝id，
销售产品码，
借款金额，
保证金金额，
还款信息：如借款期限，日利率，还款方式
样例：
{
	"ALIPAY_PAYER_USER_ID": "20885656565656",//买家支付宝id
	"ALIPAY_PAYEE_USER_ID": "20885998980000",//卖家支付宝id
	  "SALE_PD_CODE": "销售产品码",   
	"LOAN_AMOUNT": "300",//借款金额
	"DEPOSIT_AMOUNT": "100",//保证金金额
	"LOAN_INFO": //还款信息
	"[{\"loanTerm\":{\"term\":12,\"termUnit\":\"M\",\"instalItrv\":1,\"instalType\":\"M\"},\"loanRate\":{\"riskIntRate\":{\"termUnitCode\":\"01\",\"amount\":0.005,\"ratioUnitCode\":\"RM\"}},\"loanRepay\":{\"repayMode\":\"1\"}}]"
}
的URLEncoder.encode（UTF-8）
"LOAN_INFO": //还款信息
 具体含义如下，可以下载融资的jar来组织：
[{
	"loanTerm": {//还款期限
		"term": 12,//总共还款期数
		"termUnit": "M",//贷款期限的长度单位(必填)，一般是有年、月、日
		"instalItrv": 1,
		"instalType": "M"//和termUnit一致
	},
	"loanRate": {//还款利率
		"riskIntRate": {//贷款风险利率（年化）
			"termUnitCode": "01",
			"amount": 0.005,
			"ratioUnitCode": "RM"
		}
	},
	"loanRepay": {//还款方式
		"repayMode": "1"
	}
}]
	 */
	@ApiField("order_ext")
	private String orderExt;

	/**
	 * 订单类型，FINANCING_PAY-预付融资
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 收款方资金明细，JSON格式，UTF-8编码，编码前：[{"accountName":"贵州达","accountExtNo":"8888888222222222","accountType":"CURRENT","instCode":"机构外标即联行号",branchInstCode":"分行机构外标",amount":""}]
其中必填：
accountType-账户类型，阿里云场景填：CURRENT
accountName-户名
accountNo-卡号
amount-付方金额，只有一个付方的场景填订单的amount
instCode-机构外标即联行号，阿里云填323331000001
branchInstCode-机构分行外标，阿里云填323331000001
	 */
	@ApiField("payee_fund_detail")
	private String payeeFundDetail;

	/**
	 * 付款方资金明细，JSON格式，需要UTF-8编码，使用URLEncoder.encode(String,"UTF-8")，编码前的JSON：
[{"accountName":"贵州达","accountExtNo":"8888888222222222","accountType":"CURRENT","instCode":"机构外标即联行号",branchInstCode":"分行机构外标",amount":""}]
必填：
accountType-账户类型，阿里云场景填：CURRENT
accountName-户名
accountNo-卡号
amount-付方金额，只有一个付方的场景填订单的amount
instCode-机构外标即联行号，阿里云填323331000001
branchInstCode-机构分行外标，阿里云填323331000001
	 */
	@ApiField("payer_fund_detail")
	private String payerFundDetail;

	/**
	 * 交易备注,URLEncoder.encode(String,"UTF-8")
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求流水号，根据此字段做幂等控制
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizChannel() {
		return this.bizChannel;
	}
	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getExtPartner() {
		return this.extPartner;
	}
	public void setExtPartner(String extPartner) {
		this.extPartner = extPartner;
	}

	public String getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOrderCloseTime() {
		return this.orderCloseTime;
	}
	public void setOrderCloseTime(String orderCloseTime) {
		this.orderCloseTime = orderCloseTime;
	}

	public String getOrderExt() {
		return this.orderExt;
	}
	public void setOrderExt(String orderExt) {
		this.orderExt = orderExt;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPayeeFundDetail() {
		return this.payeeFundDetail;
	}
	public void setPayeeFundDetail(String payeeFundDetail) {
		this.payeeFundDetail = payeeFundDetail;
	}

	public String getPayerFundDetail() {
		return this.payerFundDetail;
	}
	public void setPayerFundDetail(String payerFundDetail) {
		this.payerFundDetail = payerFundDetail;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
