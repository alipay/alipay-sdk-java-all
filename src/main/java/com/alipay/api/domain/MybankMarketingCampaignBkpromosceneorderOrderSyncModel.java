package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall订单数据同步网商
 *
 * @author auto create
 * @since 1.0, 2022-09-23 10:33:46
 */
public class MybankMarketingCampaignBkpromosceneorderOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8167161829898759698L;

	/**
	 * 该单金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 子单标志, 为1表示子单 (一单一品，主子单标志均为1)
	 */
	@ApiField("detail_flag")
	private Long detailFlag;

	/**
	 * 商品列表，订单创建的时候才有值，列表的长度为1，只有一个商品
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * 当前变更的订单号，如果一单一品那么主子订单号一致
	 */
	@ApiField("lm_order_id")
	private Long lmOrderId;

	/**
	 * 主单标志，为1表示主单
	 */
	@ApiField("main_flag")
	private Long mainFlag;

	/**
	 * 主订单号
	 */
	@ApiField("main_lm_order_id")
	private Long mainLmOrderId;

	/**
	 * 变化时间
	 */
	@ApiField("modified_time")
	private Long modifiedTime;

	/**
	 * 当前订单状态
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 原订单状态
	 */
	@ApiField("pre_order_status")
	private Long preOrderStatus;

	/**
	 * 请求标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 蚂蚁统一会员ID
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

	public Long getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(Long lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public Long getMainFlag() {
		return this.mainFlag;
	}
	public void setMainFlag(Long mainFlag) {
		this.mainFlag = mainFlag;
	}

	public Long getMainLmOrderId() {
		return this.mainLmOrderId;
	}
	public void setMainLmOrderId(Long mainLmOrderId) {
		this.mainLmOrderId = mainLmOrderId;
	}

	public Long getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
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
