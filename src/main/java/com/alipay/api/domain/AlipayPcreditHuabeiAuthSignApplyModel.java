package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 轻会员页面签约接口
 *
 * @author auto create
 * @since 1.0, 2020-01-10 17:44:34
 */
public class AlipayPcreditHuabeiAuthSignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3575855978611656763L;

	/**
	 * 支付宝的用户id。用于水平校验，当传入用户id与实际唤起支付宝用户id不一致时，签约申请失败。特殊业务(用户在商户侧已经绑定了支付宝A，不允许支付宝B进行开通花芝)需求定制，无特殊需求时不要传入此商户
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部渠道标识
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 自定义冻结金额，单位：元。部分商户开放，需要申请
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 外部请求号，对应一次请求交互流水，由调用方生成
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 外部签约号，调用方需要保证唯一
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

	/**
	 * 支付宝商家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 模版ID，对接时联系技术支持确定
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 该笔订单允许的最晚完成时间，逾期支付宝将关闭。取值范围：1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m。 订单关闭时，会发送关闭的商户通知，商户需要进行处理并标记对应的订单作废。默认为1h
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
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

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
