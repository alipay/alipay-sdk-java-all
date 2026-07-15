package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗消息触达发送接口
 *
 * @author auto create
 * @since 1.0, 2026-06-23 10:02:56
 */
public class AlipayCommerceMedicalMsgReachSendModel extends AlipayObject {

	private static final long serialVersionUID = 1711414488426838156L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用户OPENID
	 */
	@ApiField("alipay_user_open_id")
	private String alipayUserOpenId;

	/**
	 * 业务来源标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 消息模版code，业务方提供
	 */
	@ApiField("msg_template_code")
	private String msgTemplateCode;

	/**
	 * 幂等键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * Push推送渠道参数
	 */
	@ApiField("push_channel")
	private PushChannelDTO pushChannel;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAlipayUserOpenId() {
		return this.alipayUserOpenId;
	}
	public void setAlipayUserOpenId(String alipayUserOpenId) {
		this.alipayUserOpenId = alipayUserOpenId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgTemplateCode() {
		return this.msgTemplateCode;
	}
	public void setMsgTemplateCode(String msgTemplateCode) {
		this.msgTemplateCode = msgTemplateCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public PushChannelDTO getPushChannel() {
		return this.pushChannel;
	}
	public void setPushChannel(PushChannelDTO pushChannel) {
		this.pushChannel = pushChannel;
	}

}
