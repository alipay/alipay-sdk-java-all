package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福开放平台短信发送
 *
 * @author auto create
 * @since 1.0, 2026-05-27 10:27:49
 */
public class AlipayCommerceMedicalSmsMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 7729864661561284813L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 用户身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道名称
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 加密所需字符串，随机数16位
	 */
	@ApiField("iv")
	private String iv;

	/**
	 * 唯一id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 用户真实名称
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 短信模版code
	 */
	@ApiField("template")
	private String template;

	/**
	 * 模版参数
	 */
	@ApiField("template_param")
	private String templateParam;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIv() {
		return this.iv;
	}
	public void setIv(String iv) {
		this.iv = iv;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getTemplate() {
		return this.template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}

	public String getTemplateParam() {
		return this.templateParam;
	}
	public void setTemplateParam(String templateParam) {
		this.templateParam = templateParam;
	}

}
