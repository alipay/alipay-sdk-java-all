package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短信发送明细。
 *
 * @author auto create
 * @since 1.0, 2024-01-22 21:02:18
 */
public class SmsSendDetail extends AlipayObject {

	private static final long serialVersionUID = 7645594797798982264L;

	/**
	 * 短信内容。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 接收短信的手机号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 短信发送时间
	 */
	@ApiField("send_date")
	private String sendDate;

	/**
	 * 运营商短信状态码。
	 */
	@ApiField("sms_code")
	private String smsCode;

	/**
	 * 短信发送结果说明
	 */
	@ApiField("sms_desc")
	private String smsDesc;

	/**
	 * 短信模板
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSendDate() {
		return this.sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getSmsDesc() {
		return this.smsDesc;
	}
	public void setSmsDesc(String smsDesc) {
		this.smsDesc = smsDesc;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
