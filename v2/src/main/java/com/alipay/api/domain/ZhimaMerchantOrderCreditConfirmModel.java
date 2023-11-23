package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用租确认下单
 *
 * @author auto create
 * @since 1.0, 2019-07-26 13:57:03
 */
public class ZhimaMerchantOrderCreditConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1643777627435629443L;

	/**
	 * 商户订单号，必需参数，用于确认芝麻订单，该参数必须与调用接口（zhima.merchant.order.credit.create）时传入的out_order_no一致
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 芝麻订单号，必需参数，用于确认芝麻订单，通过调用接口（zhima.merchant.order.credit.create）后获取
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
