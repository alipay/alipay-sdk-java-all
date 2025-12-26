package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收订单发起售后
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:08
 */
public class AlipayCommerceRecycleOrderAftersaleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3827426522627976732L;

	/**
	 * 发起售后原因
	 */
	@ApiField("after_sale_reason")
	private String afterSaleReason;

	/**
	 * 售后类型
	 */
	@ApiField("after_sale_type")
	private String afterSaleType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 回收订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 发起售后的子单列表
	 */
	@ApiListField("sub_order_after_sale_create_list")
	@ApiField("recycle_sub_order_after_sale_create_v_o")
	private List<RecycleSubOrderAfterSaleCreateVO> subOrderAfterSaleCreateList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAfterSaleReason() {
		return this.afterSaleReason;
	}
	public void setAfterSaleReason(String afterSaleReason) {
		this.afterSaleReason = afterSaleReason;
	}

	public String getAfterSaleType() {
		return this.afterSaleType;
	}
	public void setAfterSaleType(String afterSaleType) {
		this.afterSaleType = afterSaleType;
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

	public List<RecycleSubOrderAfterSaleCreateVO> getSubOrderAfterSaleCreateList() {
		return this.subOrderAfterSaleCreateList;
	}
	public void setSubOrderAfterSaleCreateList(List<RecycleSubOrderAfterSaleCreateVO> subOrderAfterSaleCreateList) {
		this.subOrderAfterSaleCreateList = subOrderAfterSaleCreateList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
