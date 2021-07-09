package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付创建订单
 *
 * @author auto create
 * @since 1.0, 2021-04-13 20:30:08
 */
public class MybankPaymentTradeNormalpayOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1373183723678296128L;

	/**
	 * 订单金额，单位:分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 渠道类型，表示请求的来源
ANT_OPEN=蚂蚁开放平台
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 外部平台的单据号，建议和request_no保持一致
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 买家信息，user_info_type表示账户类型，ALIPAY_UID=支付宝UID，BANK_UID=网商会员角色ID，MYBANK_CARD_NO=网商卡号，样例内容是{"user_info_type":"ALIPAY_UID","user_info_id":"2088102146225135"}，在进行urlencode
	 */
	@ApiField("buyer_info")
	private String buyerInfo;

	/**
	 * 网商卡号，具体是买方还是卖方，按接入场景而定，详情咨询开发小二
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 关单时间，格式是数字+单位，m=分钟，h=小时，d=天
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 币种，156=人民币
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 扩展参数，内容是JSON格式，并用urlconde编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 网商会员ID，具体是买方还是卖方，按接入场景而定，详情咨询开发小二
	 */
	@ApiField("ipid")
	private String ipid;

	/**
	 * 网商会员角色ID，具体是买方还是卖方，按接入场景而定，详情咨询开发小二
	 */
	@ApiField("iproleid")
	private String iproleid;

	/**
	 * 订单类型，
NORMAL_PAY=通用支付
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 收方资产信息，内容是JSON格式，并用urlencode编码，样例内容是[{"accountName":"张三", "accountNo":"620227193903043336","accountType":"EXTEND_BANK_CARD"}]
	 */
	@ApiField("payee_fund_detail")
	private String payeeFundDetail;

	/**
	 * 付方资产信息，内容是JSON格式，并用urlencode编码，样例内容是[{"accountName":"张三", "accountNo":"620227193903043336","accountType":"EXTEND_BANK_CARD"}]
	 */
	@ApiField("payer_fund_detail")
	private String payerFundDetail;

	/**
	 * 网商对账单的备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求流水号，表示外部一次请求，控重字段
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 卖家信息，user_info_type表示账户类型，ALIPAY_UID=支付宝UID，BANK_UID=网商会员角色ID，MYBANK_CARD_NO=网商卡号，样例内容是{"user_info_type":"ALIPAY_UID","user_info_id":"2088102146225135"}，再进行urlencode
	 */
	@ApiField("seller_info")
	private String sellerInfo;

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

	public String getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(String buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIpid() {
		return this.ipid;
	}
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	public String getIproleid() {
		return this.iproleid;
	}
	public void setIproleid(String iproleid) {
		this.iproleid = iproleid;
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

	public String getSellerInfo() {
		return this.sellerInfo;
	}
	public void setSellerInfo(String sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

}
