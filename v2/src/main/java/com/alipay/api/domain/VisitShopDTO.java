package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 巡店门店信息
 *
 * @author auto create
 * @since 1.0, 2024-09-13 15:20:20
 */
public class VisitShopDTO extends AlipayObject {

	private static final long serialVersionUID = 3746848758259153633L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 已打卡次数
	 */
	@ApiField("check_times")
	private Long checkTimes;

	/**
	 * 是否打卡达标
	 */
	@ApiField("finish")
	private Boolean finish;

	/**
	 * 店铺名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 2024xxx
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Long getCheckTimes() {
		return this.checkTimes;
	}
	public void setCheckTimes(Long checkTimes) {
		this.checkTimes = checkTimes;
	}

	public Boolean getFinish() {
		return this.finish;
	}
	public void setFinish(Boolean finish) {
		this.finish = finish;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
