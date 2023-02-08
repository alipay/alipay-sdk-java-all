package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO页面签约接口
 *
 * @author auto create
 * @since 1.0, 2022-11-15 15:11:14
 */
public class ZhimaCreditPeZmgoSignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4336435288137231739L;

	/**
	 * 支付宝的用户id。用于水平校验，当传入用户id与实际唤起支付宝用户id不一致时，签约申请失败。特殊业务(用户在商户侧已经绑定了支付宝A，不允许支付宝B进行开通芝麻GO)需求定制，无特殊需求时不要传入此参数
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝的用户id。用于水平校验，当传入用户id与实际唤起支付宝用户id不一致时，签约申请失败。特殊业务(用户在商户侧已经绑定了支付宝A，不允许支付宝B进行开通芝麻GO)需求定制，无特殊需求时不要传入此参数
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部渠道标识
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_params")
	private SignExtendInfo extendParams;

	/**
	 * 自定义冻结金额，单位：元。部分商户开放，需要申请
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 芝麻GO预创单号
	 */
	@ApiField("preorder_no")
	private String preorderNo;

	/**
	 * 模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 该笔订单允许的最晚完成时间，逾期支付宝将关闭。取值范围：1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m。 默认为1h
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

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

	public SignExtendInfo getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(SignExtendInfo extendParams) {
		this.extendParams = extendParams;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPreorderNo() {
		return this.preorderNo;
	}
	public void setPreorderNo(String preorderNo) {
		this.preorderNo = preorderNo;
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
