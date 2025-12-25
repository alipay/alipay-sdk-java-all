package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户使用智能营销-消息服务发送短信后，可订阅该消息获取短信回执消息
 *
 * @author auto create
 * @since 1.0, 2024-04-17 12:00:25
 */
public class SmsReport extends AlipayObject {

	private static final long serialVersionUID = 6794524518364812218L;

	/**
	 * 内部回执id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/**
	 * 错误码信息描述。
	 */
	@ApiField("err_msg")
	private String errMsg;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 短信发送时间
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 短信长度
	 */
	@ApiField("sms_size")
	private String smsSize;

	/**
	 * 是否发送成功。取值：
true：发送成功。
false：发送失败。
	 */
	@ApiField("success")
	private Boolean success;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getErrCode() {
		return this.errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
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

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getSmsSize() {
		return this.smsSize;
	}
	public void setSmsSize(String smsSize) {
		this.smsSize = smsSize;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
