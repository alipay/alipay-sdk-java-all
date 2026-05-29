package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业积分订单同步
 *
 * @author auto create
 * @since 1.0, 2026-04-13 10:42:44
 */
public class AlipayCommerceAcommunicationPointsOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7238354345783136546L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 机构订单id
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 下单时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 兑换消耗积分值
	 */
	@ApiField("points_count")
	private Long pointsCount;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getInstOrderId() {
		return this.instOrderId;
	}
	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Long getPointsCount() {
		return this.pointsCount;
	}
	public void setPointsCount(Long pointsCount) {
		this.pointsCount = pointsCount;
	}

}
