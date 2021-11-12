package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用租订单信息查询
 *
 * @author auto create
 * @since 1.0, 2021-03-16 15:20:01
 */
public class ZhimaMerchantOrderCreditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2445821561918822366L;

	/**
	 * 外部订单号,包含字母、数字、下划线，调用方需要保证订单号唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 芝麻订单号
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getZmOrderNo() {
		return this.zmOrderNo;
	}
	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}

}
