package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额外参数
 *
 * @author auto create
 * @since 1.0, 2025-08-21 16:37:36
 */
public class AuthTokenApplyExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3155949847349288256L;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 请求来源
	 */
	@ApiField("request_channel")
	private String requestChannel;

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getRequestChannel() {
		return this.requestChannel;
	}
	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

}
