package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:17:45
 */
public class RentProcurementRefundInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6787426538853548921L;

	/**
	 * null
	 */
	@ApiListField("pay_items")
	@ApiField("rent_procurement_pay_item_info_v_o")
	private List<RentProcurementPayItemInfoVO> payItems;

	/**
	 * 退款总金额，单位：元，精确到小数点后两位
说明：退款总金额= sum{refund_items（退款金额）}-sum{pay_items （支付费用金额）}
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * null
	 */
	@ApiListField("refund_items")
	@ApiField("rent_procurement_pay_item_info_v_o")
	private List<RentProcurementPayItemInfoVO> refundItems;

	public List<RentProcurementPayItemInfoVO> getPayItems() {
		return this.payItems;
	}
	public void setPayItems(List<RentProcurementPayItemInfoVO> payItems) {
		this.payItems = payItems;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<RentProcurementPayItemInfoVO> getRefundItems() {
		return this.refundItems;
	}
	public void setRefundItems(List<RentProcurementPayItemInfoVO> refundItems) {
		this.refundItems = refundItems;
	}

}
