package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还撤销订单
 *
 * @author auto create
 * @since 1.0, 2021-03-16 15:20:07
 */
public class ZhimaMerchantOrderRentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8494595757891819829L;

	/**
	 * 信用借还订单号，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.merchant.order.rent.create">zhima.merchant.order.rent.create</a>(信用借还订单创建(页面))接口创建信用借还订单后获取。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 信用借还的产品码,固定为：w1010100000000002858。
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
