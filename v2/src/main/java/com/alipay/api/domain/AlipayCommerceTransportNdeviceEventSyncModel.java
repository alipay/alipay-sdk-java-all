package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出行行业司机签到同步
 *
 * @author auto create
 * @since 1.0, 2025-06-11 14:31:32
 */
public class AlipayCommerceTransportNdeviceEventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5566537619448685359L;

	/**
	 * type为driverManualSign传入司机id
	 */
	@ApiField("biz_event_identity")
	private String bizEventIdentity;

	/**
	 * 司机签到-driverSign
司机人工签到-driverManualSign
	 */
	@ApiField("biz_event_type")
	private String bizEventType;

	/**
	 * 来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 设备序列号，为一串数字或字母，一般为电子产品的标识码
	 */
	@ApiField("sn")
	private String sn;

	public String getBizEventIdentity() {
		return this.bizEventIdentity;
	}
	public void setBizEventIdentity(String bizEventIdentity) {
		this.bizEventIdentity = bizEventIdentity;
	}

	public String getBizEventType() {
		return this.bizEventType;
	}
	public void setBizEventType(String bizEventType) {
		this.bizEventType = bizEventType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
