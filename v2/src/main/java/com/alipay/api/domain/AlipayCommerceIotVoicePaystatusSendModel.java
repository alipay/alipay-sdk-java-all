package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot漏单提醒播报服务
 *
 * @author auto create
 * @since 1.0, 2021-09-22 17:15:39
 */
public class AlipayCommerceIotVoicePaystatusSendModel extends AlipayObject {

	private static final long serialVersionUID = 3656291363577897859L;

	/**
	 * 设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 1.为扫码提示音
2.为取消支付提示音
	 */
	@ApiField("pay_status")
	private Long payStatus;

	/**
	 * 间连商户id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 触发提醒的时间戳
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public Long getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(Long payStatus) {
		this.payStatus = payStatus;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
