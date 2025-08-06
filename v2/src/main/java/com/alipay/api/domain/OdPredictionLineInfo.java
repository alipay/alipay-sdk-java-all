package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-客流预测任务-线路信息
 *
 * @author auto create
 * @since 1.0, 2023-04-12 10:30:06
 */
public class OdPredictionLineInfo extends AlipayObject {

	private static final long serialVersionUID = 8568451942927582548L;

	/**
	 * 客流预测任务对当前线路的操作类型,CREATE/UPDATE/DELETE
	 */
	@ApiField("action")
	private String action;

	/**
	 * 线路方向,枚举UP/DOWN
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 可扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 公交线路id，统一公交企业下应唯一
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路名称
	 */
	@ApiField("line_name")
	private String lineName;

	/**
	 * 票价，单位:元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 线路营运时间(HH24:mm:ss)
	 */
	@ApiField("service_time")
	private String serviceTime;

	/**
	 * 线路对应站点列表
	 */
	@ApiListField("station_list")
	@ApiField("station_info")
	private List<StationInfo> stationList;

	/**
	 * 线路交通类型
	 */
	@ApiField("traffic_type")
	private String trafficType;

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

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getServiceTime() {
		return this.serviceTime;
	}
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}

	public List<StationInfo> getStationList() {
		return this.stationList;
	}
	public void setStationList(List<StationInfo> stationList) {
		this.stationList = stationList;
	}

	public String getTrafficType() {
		return this.trafficType;
	}
	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
	}

}
