package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收订单商家查询
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:12
 */
public class AlipayCommerceRecycleOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2558289684636741953L;

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
	 * 子单查询列表
	 */
	@ApiListField("sub_order_query_list")
	@ApiField("recycle_sub_order_query_v_o")
	private List<RecycleSubOrderQueryVO> subOrderQueryList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public List<RecycleSubOrderQueryVO> getSubOrderQueryList() {
		return this.subOrderQueryList;
	}
	public void setSubOrderQueryList(List<RecycleSubOrderQueryVO> subOrderQueryList) {
		this.subOrderQueryList = subOrderQueryList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
