package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗额度授权协议页面签约接口
 *
 * @author auto create
 * @since 1.0, 2022-12-28 15:54:06
 */
public class AlipayPcreditHuabeiAuthPageSignModel extends AlipayObject {

	private static final long serialVersionUID = 7734334233291358145L;

	/**
	 * 花呗先享签约场景，商户和支付宝签约时确定，商户接入时需要咨询技术支持。
	 */
	@ApiField("auth_scene")
	private String authScene;

	/**
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示。展示时会进行内容脱敏。
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 签约过程中期望进行花呗初始冻结的金额，单位为元，精确到小数点后两位。
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 商户业务订单的简单描述，如商品名称等，长度不超过100个字母或50个汉字。可不填写，默认取销售方案上定义的协议名称。
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。支付宝侧用来做花呗冻结请求的幂等。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 外部签约号，由商户提供，花呗先享协议中标识用户的唯一签约号（确保在商户系统中唯一）。
商户对接时请与技术支持交流下具体的格式规则，确保双方理解一致。
商户系统按需传入，支付宝用做先享协议级别幂等，即同一用户在同一商户、同一花呗先享签约业务场景下，out_sign_no是唯一的。
长度不能超过64位。
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

	/**
	 * 商户的支付宝用户id。如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 该笔订单允许的最晚完成时间，逾期支付宝将关闭。取值范围：1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m。
订单关闭时，会发送关闭的商户通知，商户需要进行处理并标记对应的订单作废。
不传入该参数则订单永远有效，支付宝侧不会主动关闭。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

	public String getExternalLogonId() {
		return this.externalLogonId;
	}
	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutSignNo() {
		return this.outSignNo;
	}
	public void setOutSignNo(String outSignNo) {
		this.outSignNo = outSignNo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
