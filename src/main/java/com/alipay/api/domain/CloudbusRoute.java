package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公交线路信息
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:27:55
 */
public class CloudbusRoute extends AlipayObject {

	private static final long serialVersionUID = 8716955496334263148L;

	/**
	 * 修改类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 线路方向：枚举 up  down
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 路线id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 公交路线轨迹
	 */
	@ApiListField("line_lon_lat")
	@ApiField("cloudbus_location")
	private List<CloudbusLocation> lineLonLat;

	/**
	 * 线路名称(87 路-上行)
	 */
	@ApiField("line_name")
	private String lineName;

	/**
	 * 运营时间
	 */
	@ApiListField("operation_time")
	@ApiField("string")
	private List<String> operationTime;

	/**
	 * 票价
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 站点
	 */
	@ApiListField("stops")
	@ApiField("cloudbus_stop")
	private List<CloudbusStop> stops;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
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

	public List<CloudbusLocation> getLineLonLat() {
		return this.lineLonLat;
	}
	public void setLineLonLat(List<CloudbusLocation> lineLonLat) {
		this.lineLonLat = lineLonLat;
	}

	public String getLineName() {
		return this.lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public List<String> getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(List<String> operationTime) {
		this.operationTime = operationTime;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public List<CloudbusStop> getStops() {
		return this.stops;
	}
	public void setStops(List<CloudbusStop> stops) {
		this.stops = stops;
	}

}
