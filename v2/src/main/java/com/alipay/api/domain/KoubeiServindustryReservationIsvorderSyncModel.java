package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv订单信息同步接口
 *
 * @author auto create
 * @since 1.0, 2020-12-16 20:50:47
 */
public class KoubeiServindustryReservationIsvorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1886523534146255149L;

	/**
	 * 用户到店时间
	 */
	@ApiField("arrive_time")
	private Date arriveTime;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 预订订单订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户在口碑开店后的门店号
	 */
	@ApiField("shop_id")
	private String shopId;

	public Date getArriveTime() {
		return this.arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
