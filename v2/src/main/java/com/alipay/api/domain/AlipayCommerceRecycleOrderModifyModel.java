package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收订单信息修改
 *
 * @author auto create
 * @since 1.0, 2026-01-07 17:37:42
 */
public class AlipayCommerceRecycleOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4482145279483577854L;

	/**
	 * 地址信息
	 */
	@ApiField("address_info")
	private RecycleModifyAddressInfo addressInfo;

	/**
	 * 修改原因
	 */
	@ApiField("modify_reason")
	private String modifyReason;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 回收工程师信息
	 */
	@ApiField("send_order_contact_info")
	private RecycleSendContactInfo sendOrderContactInfo;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public RecycleModifyAddressInfo getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RecycleModifyAddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getModifyReason() {
		return this.modifyReason;
	}
	public void setModifyReason(String modifyReason) {
		this.modifyReason = modifyReason;
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

	public RecycleSendContactInfo getSendOrderContactInfo() {
		return this.sendOrderContactInfo;
	}
	public void setSendOrderContactInfo(RecycleSendContactInfo sendOrderContactInfo) {
		this.sendOrderContactInfo = sendOrderContactInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
