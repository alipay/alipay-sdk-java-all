package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用租订单信息查询
 *
 * @author auto create
 * @since 1.0, 2019-05-29 16:07:14
 */
public class ZhimaMerchantOrderCreditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2271859611495428455L;

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
