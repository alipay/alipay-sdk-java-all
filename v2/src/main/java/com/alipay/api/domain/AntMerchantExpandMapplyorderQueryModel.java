package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户入驻单查询接口
 *
 * @author auto create
 * @since 1.0, 2021-04-19 16:57:00
 */
public class AntMerchantExpandMapplyorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4871297519366379883L;

	/**
	 * 支付宝端商户入驻申请单据号
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
