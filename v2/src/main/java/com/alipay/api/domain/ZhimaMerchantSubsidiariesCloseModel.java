package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭子商户信息工单
 *
 * @author auto create
 * @since 1.0, 2024-05-09 09:51:01
 */
public class ZhimaMerchantSubsidiariesCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3359828721475474154L;

	/**
	 * 工单标识
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
