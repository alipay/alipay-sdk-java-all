package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 班次同步接口
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:20:56
 */
public class KoubeiCateringPosShiftSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7633693984692557136L;

	/**
	 * 班次信息
	 */
	@ApiListField("schedules")
	@ApiField("shop_pos_schedule")
	private List<ShopPosSchedule> schedules;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<ShopPosSchedule> getSchedules() {
		return this.schedules;
	}
	public void setSchedules(List<ShopPosSchedule> schedules) {
		this.schedules = schedules;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
