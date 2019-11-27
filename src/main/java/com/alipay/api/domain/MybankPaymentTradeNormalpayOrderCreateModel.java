package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付创建订单
 *
 * @author auto create
 * @since 1.0, 2019-11-05 11:56:53
 */
public class MybankPaymentTradeNormalpayOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8516199342125927142L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 渠道类型，表示请求的来源
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 外部平台的单据号，网商订单与外部平台订单一一对应
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用户的网商卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 币种
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 扩展参数，内容是JSON格式，并用urlconde编码，按场景约定具体字段
ETC场景：
etc_corp：高速公司名称
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用户在网商的会员ID
	 */
	@ApiField("ipid")
	private String ipid;

	/**
	 * 用户在网商的会员角色ID
	 */
	@ApiField("iproleid")
	private String iproleid;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 收方资产信息，内容是JSON格式，并用urlencode编码，按场景约定具体字段
	 */
	@ApiField("payee_fund_detail")
	private String payeeFundDetail;

	/**
	 * 付方资产信息，内容是JSON格式，并用urlencode编码，按场景约定具体字段
	 */
	@ApiField("payer_fund_detail")
	private String payerFundDetail;

	/**
	 * 请求流水号，表示外部一次请求，幂等字段
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

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

}
