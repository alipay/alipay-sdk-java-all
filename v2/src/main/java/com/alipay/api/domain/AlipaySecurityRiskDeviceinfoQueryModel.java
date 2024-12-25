package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备风险咨询
 *
 * @author auto create
 * @since 1.0, 2023-06-09 10:03:03
 */
public class AlipaySecurityRiskDeviceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8299932547767726946L;

	/**
	 * 渠道的唯一标识
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 手机号码的SHA256值
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
