package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抵扣订单详情，用于会员积分扣减（鉴权/不鉴权）
 *
 * @author auto create
 * @since 1.0, 2023-09-18 17:34:51
 */
public class DeductOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 1389346143255364985L;

	/**
	 * ● 单位：元
● 格式：1元 = "1.00"，0元 = "0.00"
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 长度不能超过256，若超过，请联系仕强
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * ● 单位：元
● 格式：1元 = "1.00"，0元 = "0.00"
● 已废弃 当前字段已废弃(为防止客户理解错误，废弃该字段)
	 */
	@ApiField("produce_amount")
	@Deprecated
	private String produceAmount;

	/**
	 * ● 单位：元
● 格式：1元 = "1.00"，0元 = "0.00"
● 说明：积分抵扣前总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProduceAmount() {
		return this.produceAmount;
	}
	public void setProduceAmount(String produceAmount) {
		this.produceAmount = produceAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
