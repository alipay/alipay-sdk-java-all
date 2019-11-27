package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑大家业务，外部商户查询订单评价信息
 *
 * @author auto create
 * @since 1.0, 2015-12-07 10:27:13
 */
public class AlipayOfflineKhomeCommentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1271531665643155533L;

	/**
	 * 口碑到家订单号
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
