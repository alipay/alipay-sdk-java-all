package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集卡lm订单信息同步
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:46
 */
public class AlipayOfflineMarketingAiplayfieldbusUserorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6811712357361522436L;

	/**
	 * 订单额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 子单标志
	 */
	@ApiField("detail_flag")
	private Long detailFlag;

	/**
	 * 商品信息
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * lm订单id
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 主单标志
	 */
	@ApiField("main_flag")
	private Long mainFlag;

	/**
	 * 变化时间
	 */
	@ApiField("modified_time")
	private String modifiedTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 之前订单状态
	 */
	@ApiField("pre_order_status")
	private Long preOrderStatus;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getDetailFlag() {
		return this.detailFlag;
	}
	public void setDetailFlag(Long detailFlag) {
		this.detailFlag = detailFlag;
	}

	public String getItemList() {
		return this.itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public Long getMainFlag() {
		return this.mainFlag;
	}
	public void setMainFlag(Long mainFlag) {
		this.mainFlag = mainFlag;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPreOrderStatus() {
		return this.preOrderStatus;
	}
	public void setPreOrderStatus(Long preOrderStatus) {
		this.preOrderStatus = preOrderStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
