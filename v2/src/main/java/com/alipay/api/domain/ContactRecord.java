package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 骑手和消费者联系记录
 *
 * @author auto create
 * @since 1.0, 2023-06-13 21:28:15
 */
public class ContactRecord extends AlipayObject {

	private static final long serialVersionUID = 6397916982567325379L;

	/**
	 * 通话时长(未接通时为0)，单位秒
	 */
	@ApiField("call_duration")
	private String callDuration;

	/**
	 * 通话发起时间
	 */
	@ApiField("call_time")
	private String callTime;

	/**
	 * 被呼叫人电话（骑手号码脱敏)
	 */
	@ApiField("callee_mobile")
	private String calleeMobile;

	/**
	 * 呼叫人电话（骑手号码脱敏）
	 */
	@ApiField("caller_mobile")
	private String callerMobile;

	/**
	 * 通话接通时间
	 */
	@ApiField("pick_up_time")
	private String pickUpTime;

	/**
	 * 呼叫状态(呼叫状态 1-主叫挂机，2-被叫挂机，4-被叫无应答， 5-被叫忙 ，6-被叫号码停机或空号，7-被叫号码关机，8-运营商服务异常，9-Other，12-未知异常)
	 */
	@ApiField("status")
	private String status;

	public String getCallDuration() {
		return this.callDuration;
	}
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}

	public String getCallTime() {
		return this.callTime;
	}
	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}

	public String getCalleeMobile() {
		return this.calleeMobile;
	}
	public void setCalleeMobile(String calleeMobile) {
		this.calleeMobile = calleeMobile;
	}

	public String getCallerMobile() {
		return this.callerMobile;
	}
	public void setCallerMobile(String callerMobile) {
		this.callerMobile = callerMobile;
	}

	public String getPickUpTime() {
		return this.pickUpTime;
	}
	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
