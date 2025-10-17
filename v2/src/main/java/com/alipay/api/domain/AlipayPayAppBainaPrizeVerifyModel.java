package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户兑奖资格核销
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:05
 */
public class AlipayPayAppBainaPrizeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7653567688146243865L;

	/**
	 * 从下单url的extJosn参数中获取，key=activityId，此接口带回
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 下单商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品价格，单位为元
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 用户下单lm侧订单号
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求编号，编号相同则认为为同一请求，幂等使用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 下单该商品需要的资格数
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
