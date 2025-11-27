package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收订单商家确认
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:07
 */
public class AlipayCommerceRecycleOrderInspectConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5653882423197125594L;

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
	 * 订单的质检金额，币种：人民币，单位：元
	 */
	@ApiField("order_inspect_price")
	private String orderInspectPrice;

	/**
	 * 商家的订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 子单质检确认列表
	 */
	@ApiListField("sub_order_inspect_confirm_list")
	@ApiField("recycle_sub_order_inspect_confirm_v_o")
	private List<RecycleSubOrderInspectConfirmVO> subOrderInspectConfirmList;

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

	public String getOrderInspectPrice() {
		return this.orderInspectPrice;
	}
	public void setOrderInspectPrice(String orderInspectPrice) {
		this.orderInspectPrice = orderInspectPrice;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public List<RecycleSubOrderInspectConfirmVO> getSubOrderInspectConfirmList() {
		return this.subOrderInspectConfirmList;
	}
	public void setSubOrderInspectConfirmList(List<RecycleSubOrderInspectConfirmVO> subOrderInspectConfirmList) {
		this.subOrderInspectConfirmList = subOrderInspectConfirmList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
