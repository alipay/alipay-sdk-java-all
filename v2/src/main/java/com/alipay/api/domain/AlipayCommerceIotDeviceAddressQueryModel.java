package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备地址信息
 *
 * @author auto create
 * @since 1.0, 2023-10-30 15:54:36
 */
public class AlipayCommerceIotDeviceAddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4469432637268481953L;

	/**
	 * 设备唯一标识，设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

}
