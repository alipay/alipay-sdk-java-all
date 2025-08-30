package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备流量信息查询
 *
 * @author auto create
 * @since 1.0, 2020-06-24 09:53:25
 */
public class AlipayCommerceIotNetflowInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2879446838178226383L;

	/**
	 * 设备的sn/imei/bizTid等信息
	 */
	@ApiField("device_tag")
	private String deviceTag;

	public String getDeviceTag() {
		return this.deviceTag;
	}
	public void setDeviceTag(String deviceTag) {
		this.deviceTag = deviceTag;
	}

}
