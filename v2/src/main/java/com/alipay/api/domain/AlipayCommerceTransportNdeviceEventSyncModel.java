package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出行行业司机签到同步
 *
 * @author auto create
 * @since 1.0, 2025-05-27 20:41:52
 */
public class AlipayCommerceTransportNdeviceEventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6881672667499533596L;

	/**
	 * 司机签到-driverSign
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
