package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询试用小程序
 *
 * @author auto create
 * @since 1.0, 2023-02-04 10:05:01
 */
public class AlipayOpenMiniIsvFastregisterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3677964547229726923L;

	/**
	 * 代创建试用小程序单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
