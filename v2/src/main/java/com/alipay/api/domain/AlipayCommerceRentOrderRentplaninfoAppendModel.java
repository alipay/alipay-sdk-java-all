package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单租赁计划信息追加
 *
 * @author auto create
 * @since 1.0, 2025-08-06 15:28:53
 */
public class AlipayCommerceRentOrderRentplaninfoAppendModel extends AlipayObject {

	private static final long serialVersionUID = 7832415722953315394L;

	/**
	 * 租金分期计划
	 */
	@ApiListField("installments")
	@ApiField("rent_installment_info")
	private List<RentInstallmentInfo> installments;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 租期结束时间
	 */
	@ApiField("rent_end_time")
	private Date rentEndTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<RentInstallmentInfo> getInstallments() {
		return this.installments;
	}
	public void setInstallments(List<RentInstallmentInfo> installments) {
		this.installments = installments;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Date getRentEndTime() {
		return this.rentEndTime;
	}
	public void setRentEndTime(Date rentEndTime) {
		this.rentEndTime = rentEndTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
