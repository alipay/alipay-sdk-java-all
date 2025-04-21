package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息同步
 *
 * @author auto create
 * @since 1.0, 2024-12-31 10:20:39
 */
public class AlipayOpenNppdUserorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6575779373673593762L;

	/**
	 * 订单金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 客户业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 子单标志
	 */
	@ApiField("detail_flag")
	private Long detailFlag;

	/**
	 * 商品列表
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * 订单号
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 主单标志
	 */
	@ApiField("main_flag")
	private Long mainFlag;

	/**
	 * 主订单号
	 */
	@ApiField("main_lm_order_id")
	private String mainLmOrderId;

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
	 * 变化后的订单状态
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 变化后的订单状态
	 */
	@ApiField("pre_order_status")
	private Long preOrderStatus;

	/**
	 * 请求标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 用户id
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

	public String getMainLmOrderId() {
		return this.mainLmOrderId;
	}
	public void setMainLmOrderId(String mainLmOrderId) {
		this.mainLmOrderId = mainLmOrderId;
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
