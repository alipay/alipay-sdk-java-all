package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行程扩展信息
 *
 * @author auto create
 * @since 1.0, 2026-09-18 16:58:26
 */
public class ExtFields extends AlipayObject {

	private static final long serialVersionUID = 7196561461375365184L;

	/**
	 * 到达站点 ID，与 destination 对应
	 */
	@ApiField("destination_station_id")
	private String destinationStationId;

	/**
	 * 终点线路，用于匹配销售方
	 */
	@ApiField("end_line")
	private String endLine;

	/**
	 * 出发站点 ID，与 origin 对应
	 */
	@ApiField("origin_station_id")
	private String originStationId;

	public String getDestinationStationId() {
		return this.destinationStationId;
	}
	public void setDestinationStationId(String destinationStationId) {
		this.destinationStationId = destinationStationId;
	}

	public String getEndLine() {
		return this.endLine;
	}
	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}

	public String getOriginStationId() {
		return this.originStationId;
	}
	public void setOriginStationId(String originStationId) {
		this.originStationId = originStationId;
	}

}
