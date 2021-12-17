package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票即时配送运单集合
 *
 * @author auto create
 * @since 1.0, 2021-03-29 17:58:49
 */
public class WaybillInvoice extends AlipayObject {

	private static final long serialVersionUID = 7682211396318912153L;

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
