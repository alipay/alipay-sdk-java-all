package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下线圈查询碰一下页面跳转链接
 *
 * @author auto create
 * @since 1.0, 2025-06-03 16:34:25
 */
public class AlipayOpenSpNordertagQrcodeurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6424155216979926616L;

	/**
	 * 线圈编号
	 */
	@ApiField("coil_no")
	private String coilNo;

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}

}
