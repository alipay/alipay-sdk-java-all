package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收订单商家结算确认
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:08
 */
public class AlipayCommerceRecycleOrderSettleConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5885217674126357151L;

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
	 * 子单结算确认列表
	 */
	@ApiListField("sub_order_settle_confirm_list")
	@ApiField("recycle_sub_order_settle_confirm_v_o")
	private List<RecycleSubOrderSettleConfirmVO> subOrderSettleConfirmList;

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

	public List<RecycleSubOrderSettleConfirmVO> getSubOrderSettleConfirmList() {
		return this.subOrderSettleConfirmList;
	}
	public void setSubOrderSettleConfirmList(List<RecycleSubOrderSettleConfirmVO> subOrderSettleConfirmList) {
		this.subOrderSettleConfirmList = subOrderSettleConfirmList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
