package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业订单查询
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:38:59
 */
public class AlipayBusinessOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6384321989345417346L;

	/**
	 * 商户外部订单号，和支付宝订单号不能同时为空。注：商户已获取order_no（支付宝订单号）的情况下必须优先传入order_no
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 支付宝订单号，与商户外部订单号不能同时为空。注：商户已获取order_no的情况下必须优先传入order_no
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户外部支付工具单据号。若不传，则认为是整单查询，将返回整个订单的所有支付工具信息。
	 */
	@ApiField("paytool_request_no")
	private String paytoolRequestNo;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPaytoolRequestNo() {
		return this.paytoolRequestNo;
	}
	public void setPaytoolRequestNo(String paytoolRequestNo) {
		this.paytoolRequestNo = paytoolRequestNo;
	}

}
