package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务市场订单同步
 *
 * @author auto create
 * @since 1.0, 2021-08-10 10:37:36
 */
public class AlipayOpenServicemarketOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2452959225827358752L;

	/**
	 * 实际支付金额，单位分
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * 购买者uid
	 */
	@ApiField("consumer_uid")
	private String consumerUid;

	/**
	 * 优惠券抵扣金额，单位分
	 */
	@ApiField("coupon_amount")
	private Long couponAmount;

	/**
	 * 商品折扣金额，单位分
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * 有业务含义的外部订单号，用做页面跳转等操作
	 */
	@ApiField("fin_tech_order_no")
	private String finTechOrderNo;

	/**
	 * 金融科技产品码
	 */
	@ApiField("fin_tech_product_code")
	private String finTechProductCode;

	/**
	 * 最后修改时间，用做防请求乱序，针对同一条数据的更新，如果值小于上一个请求的值，该次请求会被丢弃。建议使用数据的修改时间，或者乐观锁的version作为参数值。
	 */
	@ApiField("gmt_modified")
	private Long gmtModified;

	/**
	 * 金融科技订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 下单时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 金融科技订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商品原始金额，单位分
	 */
	@ApiField("original_amount")
	private Long originalAmount;

	/**
	 * 幂等参数，比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getConsumerUid() {
		return this.consumerUid;
	}
	public void setConsumerUid(String consumerUid) {
		this.consumerUid = consumerUid;
	}

	public Long getCouponAmount() {
		return this.couponAmount;
	}
	public void setCouponAmount(Long couponAmount) {
		this.couponAmount = couponAmount;
	}

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getFinTechOrderNo() {
		return this.finTechOrderNo;
	}
	public void setFinTechOrderNo(String finTechOrderNo) {
		this.finTechOrderNo = finTechOrderNo;
	}

	public String getFinTechProductCode() {
		return this.finTechProductCode;
	}
	public void setFinTechProductCode(String finTechProductCode) {
		this.finTechProductCode = finTechProductCode;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Long getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(Long originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
