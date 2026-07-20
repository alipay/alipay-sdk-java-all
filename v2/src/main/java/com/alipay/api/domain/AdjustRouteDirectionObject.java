package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调整线路方向对象
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class AdjustRouteDirectionObject extends AlipayObject {

	private static final long serialVersionUID = 7153647161222245621L;

	/**
	 * 调整详情
	 */
	@ApiField("adjustment_detail")
	private String adjustmentDetail;

	/**
	 * 调整方式: cancel(撤销), shorten(截短), split(拆线),skip_stop(跳站),no_adjustment(无调整)
	 */
	@ApiField("adjustment_type")
	private String adjustmentType;

	/**
	 * 排序
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 线路名称
	 */
	@ApiField("route_name")
	private String routeName;

	public String getAdjustmentDetail() {
		return this.adjustmentDetail;
	}
	public void setAdjustmentDetail(String adjustmentDetail) {
		this.adjustmentDetail = adjustmentDetail;
	}

	public String getAdjustmentType() {
		return this.adjustmentType;
	}
	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
	}

	public Long getRank() {
		return this.rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getRouteName() {
		return this.routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

}
