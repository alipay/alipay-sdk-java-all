package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos订单推进同步
 *
 * @author auto create
 * @since 1.0, 2018-11-13 11:00:49
 */
public class KoubeiCateringOrderInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7367498856143222211L;

	/**
	 * 订单操作类型，RECEIPT—接单、REJECT—拒单、PREPARE—已备餐、DELIVER—已送餐、REFUND—退款、RENEW—反结、ACCEPT_REFUND 接受退款、REJECT_REFUND 拒接退款、TABLE_CHANGE-修改桌号、PARTIAL_REFUND-部分退款、COOKING-下厨、QUEUE_NUM_SYNC-排队顺序同步
	 */
	@ApiField("action")
	private String action;

	/**
	 * 操作内容信息，Map<String,String> actionInfo = new HashMap<String,String>();
actionInfo.put("NO","5100");// 取餐号
JSONObject.toJSONString(actionInfo);拒单原因/主动退款原因/同意退款原因包括:1、RECEIVE_TIMEOUT超时未接单，2、BUSY店铺太忙，无法接待3、DUPLICATE_ORDER重复订单，4、SHOP_CLOSE店铺已打烊5、SELL_OUT菜品售完，5、OTHER_REASON 其他原因，6、TABLE_NOT_EXIST 桌号不存在;拒绝退款原因包括:1、RECEIVE_TIMEOUT用户已取餐，2、UNDER_LINE_NEGOTIATION和用户协商一致，线下解决，3、OTHER_REASON其他原因，4、ORDER_HAS_PARTIAL_REFUNDED订单发起部分退款，5、ORDER_HAS_REFUNDED订单发起整单退款，6、ORDER_HAS_VERIFIED订单发起核销;接单时action_info中加桌号(tableNo)，tableNo和no只能传一种，并确定取餐方式;修改桌号时action_info中传tableNo，4、部分退款调用时，out_refund_no为外部退款单号来保证幂等，refund_amount为部分退款金额。5、排队顺序同步时，action_info中加排队序号queueNum
	 */
	@ApiField("action_info")
	private String actionInfo;

	/**
	 * 口碑端自己的订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getActionInfo() {
		return this.actionInfo;
	}
	public void setActionInfo(String actionInfo) {
		this.actionInfo = actionInfo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
