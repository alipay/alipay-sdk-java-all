package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客流预测结果查询
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:28:10
 */
public class CloudbusRouteRItem extends AlipayObject {

	private static final long serialVersionUID = 4578466494963957152L;

	/**
	 * 线路变更后结果
	 */
	@ApiField("after")
	private CloudbusPredictRItem after;

	/**
	 * 线路变更前线路信息
	 */
	@ApiField("before")
	private CloudbusPredictRItem before;

	/**
	 * 线路方向
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路名称(87 路-上行)
	 */
	@ApiField("line_name")
	private String lineName;

	public CloudbusPredictRItem getAfter() {
		return this.after;
	}
	public void setAfter(CloudbusPredictRItem after) {
		this.after = after;
	}

	public CloudbusPredictRItem getBefore() {
		return this.before;
	}
	public void setBefore(CloudbusPredictRItem before) {
		this.before = before;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return this.lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

}
