package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot酒店房间信息查询
 *
 * @author auto create
 * @since 1.0, 2022-06-08 14:30:04
 */
public class AlipayOpenIotmbsHoteldeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3238677637514573315L;

	/**
	 * 设备ID
	 */
	@ApiField("biztid")
	private String biztid;

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

}
