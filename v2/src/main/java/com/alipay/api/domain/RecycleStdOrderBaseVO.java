package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收订单基础模型
 *
 * @author auto create
 * @since 1.0, 2025-07-03 23:43:54
 */
public class RecycleStdOrderBaseVO extends AlipayObject {

	private static final long serialVersionUID = 4832158777845723939L;

	/**
	 * 若固定金额，则只有assess_max_amount. 

旧衣统收场景下，区间报价。存在“最小100元”的报价，即只有assess_min_amount
	 */
	@ApiField("assess_max_amount")
	private String assessMaxAmount;

	/**
	 * 估价最小金额
	 */
	@ApiField("assess_min_amount")
	private String assessMinAmount;

	/**
	 * FIXED:固定报价
区间报价:RANGE_UNIT\RANGE_PRICE
	 */
	@ApiField("assess_price_type")
	private String assessPriceType;

	/**
	 * 估价产品列表
	 */
	@ApiListField("assess_products")
	@ApiField("recycle_assess_product_v_o")
	private List<RecycleAssessProductVO> assessProducts;

	/**
	 * 回收商订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 交易订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单备注
	 */
	@ApiField("order_memo")
	private String orderMemo;

	/**
	 * 订单更新时间
	 */
	@ApiField("order_modify_time")
	private String orderModifyTime;

	/**
	 * 回收订单状态，详细参见回收订单状态机
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 回收行业类别
	 */
	@ApiField("recycle_category")
	private String recycleCategory;

	/**
	 * 商户质检确认后的最终报价金额。相较于估价，此金额一定是固定金额
	 */
	@ApiField("user_total_amount")
	private String userTotalAmount;

	public String getAssessMaxAmount() {
		return this.assessMaxAmount;
	}
	public void setAssessMaxAmount(String assessMaxAmount) {
		this.assessMaxAmount = assessMaxAmount;
	}

	public String getAssessMinAmount() {
		return this.assessMinAmount;
	}
	public void setAssessMinAmount(String assessMinAmount) {
		this.assessMinAmount = assessMinAmount;
	}

	public String getAssessPriceType() {
		return this.assessPriceType;
	}
	public void setAssessPriceType(String assessPriceType) {
		this.assessPriceType = assessPriceType;
	}

	public List<RecycleAssessProductVO> getAssessProducts() {
		return this.assessProducts;
	}
	public void setAssessProducts(List<RecycleAssessProductVO> assessProducts) {
		this.assessProducts = assessProducts;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderMemo() {
		return this.orderMemo;
	}
	public void setOrderMemo(String orderMemo) {
		this.orderMemo = orderMemo;
	}

	public String getOrderModifyTime() {
		return this.orderModifyTime;
	}
	public void setOrderModifyTime(String orderModifyTime) {
		this.orderModifyTime = orderModifyTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getRecycleCategory() {
		return this.recycleCategory;
	}
	public void setRecycleCategory(String recycleCategory) {
		this.recycleCategory = recycleCategory;
	}

	public String getUserTotalAmount() {
		return this.userTotalAmount;
	}
	public void setUserTotalAmount(String userTotalAmount) {
		this.userTotalAmount = userTotalAmount;
	}

}
