package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知信息的描述，包括notifyId，bizNo，bizId，sendTimes，sendResult
 *
 * @author auto create
 * @since 1.0, 2021-08-18 17:57:13
 */
public class NotifyInfo extends AlipayObject {

	private static final long serialVersionUID = 3572561851228494717L;

	/**
	 * biz_id+是+返回的业务主体+根据notify_id或者trade_no得到
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * biz_no+是+PID+根据notify_id或者trade_no得到
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * notify_id+是+通知id+mnotify得到
	 */
	@ApiField("notify_id")
	private String notifyId;

	/**
	 * send_result+是+发送结果+根据notify_id或者trade_no得到
	 */
	@ApiField("send_result")
	private String sendResult;

	/**
	 * send_times+是+发送的次数+根据notify_id或者trade_no得到
	 */
	@ApiField("send_times")
	private Long sendTimes;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getNotifyId() {
		return this.notifyId;
	}
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}

	public String getSendResult() {
		return this.sendResult;
	}
	public void setSendResult(String sendResult) {
		this.sendResult = sendResult;
	}

	public Long getSendTimes() {
		return this.sendTimes;
	}
	public void setSendTimes(Long sendTimes) {
		this.sendTimes = sendTimes;
	}

}
