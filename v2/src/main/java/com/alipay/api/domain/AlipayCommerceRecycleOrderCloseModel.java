package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收订单商家关闭
 *
 * @author auto create
 * @since 1.0, 2025-09-09 15:32:07
 */
public class AlipayCommerceRecycleOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7894689392935384937L;

	/**
	 * 关闭的原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 回收的订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家的订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 子单关闭信息
	 */
	@ApiListField("sub_order_close_list")
	@ApiField("recycle_sub_order_close_v_o")
	private List<RecycleSubOrderCloseVO> subOrderCloseList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
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

	public List<RecycleSubOrderCloseVO> getSubOrderCloseList() {
		return this.subOrderCloseList;
	}
	public void setSubOrderCloseList(List<RecycleSubOrderCloseVO> subOrderCloseList) {
		this.subOrderCloseList = subOrderCloseList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
