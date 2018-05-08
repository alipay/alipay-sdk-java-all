package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos订单推进同步
 *
 * @author auto create
 * @since 1.0, 2018-04-27 19:26:22
 */
public class KoubeiCateringOrderInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8649428537355174229L;

	/**
	 * 订单操作类型，RECEIPT—接单、REJECT—拒单、PREPARE—已备餐、DELIVER—已送餐、REFUND—退款、RENEW—反结
	 */
	@ApiField("action")
	private String action;

	/**
	 * 操作内容信息，Map<String,String> actionInfo = new HashMap<String,String>();
actionInfo.put("NO","5100");// 取餐号
JSONObject.toJSONString(actionInfo);
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
