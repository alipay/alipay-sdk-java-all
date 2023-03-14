package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑点餐订单后付商户退款
 *
 * @author auto create
 * @since 1.0, 2022-07-01 16:26:13
 */
public class KoubeiCateringOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3518264158629541748L;

	/**
	 * 退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 口碑端订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * BUSY(店铺太忙，无法接待)/DUPLICATE_ORDER(重复订单)/SHOP_CLOSE(店铺已打烊)/SELL_OUT(菜品售完)/OTHER_REASON(其他原因)/TABLE_NOT_EXIST(桌号不存在)/RECEIVE_TIMEOUT(超时未接单)/ACCEPT_REFUND(协商退款)/LOW_VERSION(收银系统版本过低)/SHOP_NOT_CONNECTED("没有门店绑定关系")/MERCHANT_NOT_AUTHORIZED(商户没有授权)/POS_UNCONNECTED(POS关机或未联网)/DISH_REASON(菜品原因)
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 退款请求id，基于该id做幂等等控制
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
