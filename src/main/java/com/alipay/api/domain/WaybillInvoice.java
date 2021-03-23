package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票即时配送运单集合
 *
 * @author auto create
 * @since 1.0, 2020-09-26 22:33:58
 */
public class WaybillInvoice extends AlipayObject {

	private static final long serialVersionUID = 4756467484284688695L;

	/**
	 * 即时配送运单金额
	 */
	@ApiField("waybill_amount")
	private String waybillAmount;

	/**
	 * 即时配送运单编号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getWaybillAmount() {
		return this.waybillAmount;
	}
	public void setWaybillAmount(String waybillAmount) {
		this.waybillAmount = waybillAmount;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
