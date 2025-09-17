package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文旅订单同步接口
 *
 * @author auto create
 * @since 1.0, 2025-09-15 15:42:39
 */
public class AlipayCommerceTransportTourOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1561914655563325285L;

	/**
	 * null
	 */
	@ApiListField("scene_codes")
	@ApiField("string")
	private List<String> sceneCodes;

	/**
	 * null
	 */
	@ApiListField("tour_order_list")
	@ApiField("tour_order_sync_detail")
	private List<TourOrderSyncDetail> tourOrderList;

	public List<String> getSceneCodes() {
		return this.sceneCodes;
	}
	public void setSceneCodes(List<String> sceneCodes) {
		this.sceneCodes = sceneCodes;
	}

	public List<TourOrderSyncDetail> getTourOrderList() {
		return this.tourOrderList;
	}
	public void setTourOrderList(List<TourOrderSyncDetail> tourOrderList) {
		this.tourOrderList = tourOrderList;
	}

}
