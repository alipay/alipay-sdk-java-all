package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付免密下单
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:02
 */
public class AlipayTradeCreditPayModel extends AlipayObject {

	private static final long serialVersionUID = 8874222392218717179L;

	/**
	 * 先采协议号
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 订单附加信息。 如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
	 */
	@ApiField("body")
	private String body;

	/**
	 * 先采后付免密下单业务大字段，用于业务字段透传
	 */
	@ApiField("business_params")
	private CreditTradePayBusinessParams businessParams;

	/**
	 * 先采后付免密下单扩展参数
	 */
	@ApiField("extend_params")
	private CreditTradePayExtendParams extendParams;

	/**
	 * 商户订单号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 订单标题。 注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单绝对超时时间。 格式为yyyy-MM-dd HH:mm:ss。超时时间范围：1m~15d。 注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("time_expire")
	private Date timeExpire;

	/**
	 * 订单相对超时时间。从交易创建时间开始计算。 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。 当面付场景默认值为3h； 其它场景默认值为15d;
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额。 单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public CreditTradePayBusinessParams getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(CreditTradePayBusinessParams businessParams) {
		this.businessParams = businessParams;
	}

	public CreditTradePayExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(CreditTradePayExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
