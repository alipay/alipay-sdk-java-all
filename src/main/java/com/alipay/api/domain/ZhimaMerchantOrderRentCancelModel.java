package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还撤销订单
 *
 * @author auto create
 * @since 1.0, 2017-05-25 14:34:16
 */
public class ZhimaMerchantOrderRentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5446396727687583779L;

	/**
	 * 信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 信用借还的产品码:w1010100000000002858
	 */
	@ApiField("product_code")
	private String productCode;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
