package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * linkMall订单状态同步
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:04
 */
public class AlipayPayAppBainaOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2835982124318225621L;

	/**
	 * 该单金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品订单详细说明
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 子单标识。为1表示子单   （一单一品，主子单标志均为1）
	 */
	@ApiField("detail_flag")
	private Long detailFlag;

	/**
	 * 订单商品信息
	 */
	@ApiListField("items")
	@ApiField("order_item_detail")
	private List<OrderItemDetail> items;

	/**
	 * linkmall侧订单号
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 主单标识,为1表示主单
	 */
	@ApiField("main_flag")
	private Long mainFlag;

	/**
	 * linkedmall主订单号
	 */
	@ApiField("main_lm_order_id")
	private String mainLmOrderId;

	/**
	 * 订单变化时间戳，单位为毫秒
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
	 * 外部请求编号，编号相同则认为是同一请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 订单变化前状态,创建订单是无前置状态
	 */
	@ApiField("pre_order_status")
	private Long preOrderStatus;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getDetailFlag() {
		return this.detailFlag;
	}
	public void setDetailFlag(Long detailFlag) {
		this.detailFlag = detailFlag;
	}

	public List<OrderItemDetail> getItems() {
		return this.items;
	}
	public void setItems(List<OrderItemDetail> items) {
		this.items = items;
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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getPreOrderStatus() {
		return this.preOrderStatus;
	}
	public void setPreOrderStatus(Long preOrderStatus) {
		this.preOrderStatus = preOrderStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
