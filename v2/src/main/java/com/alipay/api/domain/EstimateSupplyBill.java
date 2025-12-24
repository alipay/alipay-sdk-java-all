package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单对象
 *
 * @author auto create
 * @since 1.0, 2025-12-12 10:21:54
 */
public class EstimateSupplyBill extends AlipayObject {

	private static final long serialVersionUID = 3339883398851979427L;

	/**
	 * 优惠金额，单位分
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * 费用明细对象列表
	 */
	@ApiListField("fee_item_list")
	@ApiField("bill_fee_item")
	private List<BillFeeItem> feeItemList;

	/**
	 * 支付金额，单位分
totalAmount - discountAmount = payAmount
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 预估总费用，单位分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<BillFeeItem> getFeeItemList() {
		return this.feeItemList;
	}
	public void setFeeItemList(List<BillFeeItem> feeItemList) {
		this.feeItemList = feeItemList;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
