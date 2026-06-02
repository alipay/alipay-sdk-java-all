package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 买买委托价位，即盘口
 *
 * @author auto create
 * @since 1.0, 2026-04-08 17:46:54
 */
public class LtBidAskLevelDTO extends AlipayObject {

	private static final long serialVersionUID = 3562941185772431184L;

	/**
	 * 大单占比，百分比
	 */
	@ApiField("big_order_percent")
	private String bigOrderPercent;

	/**
	 * 委托订单
	 */
	@ApiListField("orders")
	@ApiField("lt_order_d_t_o")
	private List<LtOrderDTO> orders;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 席位数量
	 */
	@ApiField("seat_count")
	private String seatCount;

	/**
	 * 申买量 股票:股 权证:份 债券:手
	 */
	@ApiField("volume")
	private String volume;

	public String getBigOrderPercent() {
		return this.bigOrderPercent;
	}
	public void setBigOrderPercent(String bigOrderPercent) {
		this.bigOrderPercent = bigOrderPercent;
	}

	public List<LtOrderDTO> getOrders() {
		return this.orders;
	}
	public void setOrders(List<LtOrderDTO> orders) {
		this.orders = orders;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSeatCount() {
		return this.seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public String getVolume() {
		return this.volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

}
