package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopPosSchedule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.shift.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class KoubeiCateringPosShiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4271815511343185932L;

	/** 
	 * 班次信息列表
	 */
	@ApiListField("shop_pos_schedules")
	@ApiField("shop_pos_schedule")
	private List<ShopPosSchedule> shopPosSchedules;

	public void setShopPosSchedules(List<ShopPosSchedule> shopPosSchedules) {
		this.shopPosSchedules = shopPosSchedules;
	}
	public List<ShopPosSchedule> getShopPosSchedules( ) {
		return this.shopPosSchedules;
	}

}
