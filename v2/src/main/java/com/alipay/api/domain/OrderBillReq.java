package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单费用明细
 *
 * @author auto create
 * @since 1.0, 2025-12-12 10:22:53
 */
public class OrderBillReq extends AlipayObject {

	private static final long serialVersionUID = 2355359419497455651L;

	/**
	 * 优惠金额，单位分
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * 费用明细对象列表
	 */
	@ApiListField("fee_item_list")
	@ApiField("bill_fee_item_req")
	private List<BillFeeItemReq> feeItemList;

	/**
	 * 支付金额，单位分 totalAmount - discountAmount = payAmount
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 支付时间，order_status=PAYED时候必传
	 */
	@ApiField("pay_time")
	private Date payTime;

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

	public List<BillFeeItemReq> getFeeItemList() {
		return this.feeItemList;
	}
	public void setFeeItemList(List<BillFeeItemReq> feeItemList) {
		this.feeItemList = feeItemList;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
