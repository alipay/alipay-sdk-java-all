package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易单数据
 *
 * @author auto create
 * @since 1.0, 2026-07-23 10:42:21
 */
public class OrderBizInfo extends AlipayObject {

	private static final long serialVersionUID = 4891949447253351828L;

	/**
	 * 订单优惠后金额
	 */
	@ApiField("amount_discount")
	private String amountDiscount;

	/**
	 * 订单原始价格
	 */
	@ApiField("amount_original")
	private String amountOriginal;

	/**
	 * 营销折扣信息
	 */
	@ApiListField("discount_info")
	@ApiField("health_discount_info")
	private List<HealthDiscountInfo> discountInfo;

	/**
	 * 下单时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单详情链接
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 支付过期时间
	 */
	@ApiField("pay_expire_time")
	private Date payExpireTime;

	public String getAmountDiscount() {
		return this.amountDiscount;
	}
	public void setAmountDiscount(String amountDiscount) {
		this.amountDiscount = amountDiscount;
	}

	public String getAmountOriginal() {
		return this.amountOriginal;
	}
	public void setAmountOriginal(String amountOriginal) {
		this.amountOriginal = amountOriginal;
	}

	public List<HealthDiscountInfo> getDiscountInfo() {
		return this.discountInfo;
	}
	public void setDiscountInfo(List<HealthDiscountInfo> discountInfo) {
		this.discountInfo = discountInfo;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getPayExpireTime() {
		return this.payExpireTime;
	}
	public void setPayExpireTime(Date payExpireTime) {
		this.payExpireTime = payExpireTime;
	}

}
