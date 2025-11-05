package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭子商户信息工单
 *
 * @author auto create
 * @since 1.0, 2025-07-16 16:37:34
 */
public class ZhimaMerchantSubsidiariesCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6372425283997943188L;

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
