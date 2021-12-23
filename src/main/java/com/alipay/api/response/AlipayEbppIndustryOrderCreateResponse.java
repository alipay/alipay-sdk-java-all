package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:14:21
 */
public class AlipayEbppIndustryOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1391296491114231317L;

	/** 
	 * 扩展属性，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 支付宝的业务订单号，具有唯一性。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 输出机构的业务流水号，需要保证唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
