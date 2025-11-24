package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Voyager订单改签信息
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:48:13
 */
public class VoyagerOrderRebookInfo extends AlipayObject {

	private static final long serialVersionUID = 7115357958499613649L;

	/**
	 * 改签后人航段信息集合
	 */
	@ApiListField("after_rebook")
	@ApiField("voyager_segment_of_passengers_info")
	private List<VoyagerSegmentOfPassengersInfo> afterRebook;

	/**
	 * 改签前人航段信息集合
	 */
	@ApiListField("before_rebook")
	@ApiField("voyager_segment_of_passengers_info")
	private List<VoyagerSegmentOfPassengersInfo> beforeRebook;

	public List<VoyagerSegmentOfPassengersInfo> getAfterRebook() {
		return this.afterRebook;
	}
	public void setAfterRebook(List<VoyagerSegmentOfPassengersInfo> afterRebook) {
		this.afterRebook = afterRebook;
	}

	public List<VoyagerSegmentOfPassengersInfo> getBeforeRebook() {
		return this.beforeRebook;
	}
	public void setBeforeRebook(List<VoyagerSegmentOfPassengersInfo> beforeRebook) {
		this.beforeRebook = beforeRebook;
	}

}
