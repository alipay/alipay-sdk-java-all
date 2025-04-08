package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出行机票订单数据同步-航段信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 20:34:18
 */
public class TrafficAirticketOrderSegmentInfo extends AlipayObject {

	private static final long serialVersionUID = 8611485653676326246L;

	/**
	 * 航司二字码
	 */
	@ApiField("ac_code")
	private String acCode;

	/**
	 * 航司名称
	 */
	@ApiField("ac_name")
	private String acName;

	/**
	 * 到达机场三字码
	 */
	@ApiField("arr_airport_code")
	private String arrAirportCode;

	/**
	 * 到达机场名称
	 */
	@ApiField("arr_airport_name")
	private String arrAirportName;

	/**
	 * 到达城市三字码
	 */
	@ApiField("arr_city_code")
	private String arrCityCode;

	/**
	 * 到达城市名称
	 */
	@ApiField("arr_city_name")
	private String arrCityName;

	/**
	 * 到达航站楼
	 */
	@ApiField("arr_terminal")
	private String arrTerminal;

	/**
	 * 到达时间
	 */
	@ApiField("arr_time")
	private Date arrTime;

	/**
	 * 舱等代码
	 */
	@ApiField("cabin_code")
	private String cabinCode;

	/**
	 * 舱位名称
	 */
	@ApiField("cabin_name")
	private String cabinName;

	/**
	 * 辅营商品信息
	 */
	@ApiListField("commodity_info_list")
	@ApiField("traffic_airticket_order_commodity_info")
	private List<TrafficAirticketOrderCommodityInfo> commodityInfoList;

	/**
	 * 起飞机场三字码
	 */
	@ApiField("dep_airport_code")
	private String depAirportCode;

	/**
	 * 起飞机场名称
	 */
	@ApiField("dep_airport_name")
	private String depAirportName;

	/**
	 * 起飞城市三字码
	 */
	@ApiField("dep_city_code")
	private String depCityCode;

	/**
	 * 起飞城市名称
	 */
	@ApiField("dep_city_name")
	private String depCityName;

	/**
	 * 出发航站楼
	 */
	@ApiField("dep_terminal")
	private String depTerminal;

	/**
	 * 起飞时间
	 */
	@ApiField("dep_time")
	private Date depTime;

	/**
	 * 航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 餐食描述
	 */
	@ApiField("meal")
	private String meal;

	/**
	 * 机型
	 */
	@ApiField("plane_model")
	private String planeModel;

	/**
	 * 航段序号，按航段的起飞时间顺序编号
	 */
	@ApiField("segment_order")
	private Long segmentOrder;

	/**
	 * 是否经停
	 */
	@ApiField("stop")
	private Boolean stop;

	/**
	 * 经停信息列表
	 */
	@ApiListField("stop_info_list")
	@ApiField("traffic_airticket_order_stop_info")
	private List<TrafficAirticketOrderStopInfo> stopInfoList;

	/**
	 * 关联机票信息
	 */
	@ApiListField("ticket_info_list")
	@ApiField("traffic_airticket_order_ticket_info")
	private List<TrafficAirticketOrderTicketInfo> ticketInfoList;

	public String getAcCode() {
		return this.acCode;
	}
	public void setAcCode(String acCode) {
		this.acCode = acCode;
	}

	public String getAcName() {
		return this.acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getArrAirportCode() {
		return this.arrAirportCode;
	}
	public void setArrAirportCode(String arrAirportCode) {
		this.arrAirportCode = arrAirportCode;
	}

	public String getArrAirportName() {
		return this.arrAirportName;
	}
	public void setArrAirportName(String arrAirportName) {
		this.arrAirportName = arrAirportName;
	}

	public String getArrCityCode() {
		return this.arrCityCode;
	}
	public void setArrCityCode(String arrCityCode) {
		this.arrCityCode = arrCityCode;
	}

	public String getArrCityName() {
		return this.arrCityName;
	}
	public void setArrCityName(String arrCityName) {
		this.arrCityName = arrCityName;
	}

	public String getArrTerminal() {
		return this.arrTerminal;
	}
	public void setArrTerminal(String arrTerminal) {
		this.arrTerminal = arrTerminal;
	}

	public Date getArrTime() {
		return this.arrTime;
	}
	public void setArrTime(Date arrTime) {
		this.arrTime = arrTime;
	}

	public String getCabinCode() {
		return this.cabinCode;
	}
	public void setCabinCode(String cabinCode) {
		this.cabinCode = cabinCode;
	}

	public String getCabinName() {
		return this.cabinName;
	}
	public void setCabinName(String cabinName) {
		this.cabinName = cabinName;
	}

	public List<TrafficAirticketOrderCommodityInfo> getCommodityInfoList() {
		return this.commodityInfoList;
	}
	public void setCommodityInfoList(List<TrafficAirticketOrderCommodityInfo> commodityInfoList) {
		this.commodityInfoList = commodityInfoList;
	}

	public String getDepAirportCode() {
		return this.depAirportCode;
	}
	public void setDepAirportCode(String depAirportCode) {
		this.depAirportCode = depAirportCode;
	}

	public String getDepAirportName() {
		return this.depAirportName;
	}
	public void setDepAirportName(String depAirportName) {
		this.depAirportName = depAirportName;
	}

	public String getDepCityCode() {
		return this.depCityCode;
	}
	public void setDepCityCode(String depCityCode) {
		this.depCityCode = depCityCode;
	}

	public String getDepCityName() {
		return this.depCityName;
	}
	public void setDepCityName(String depCityName) {
		this.depCityName = depCityName;
	}

	public String getDepTerminal() {
		return this.depTerminal;
	}
	public void setDepTerminal(String depTerminal) {
		this.depTerminal = depTerminal;
	}

	public Date getDepTime() {
		return this.depTime;
	}
	public void setDepTime(Date depTime) {
		this.depTime = depTime;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getMeal() {
		return this.meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getPlaneModel() {
		return this.planeModel;
	}
	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}

	public Long getSegmentOrder() {
		return this.segmentOrder;
	}
	public void setSegmentOrder(Long segmentOrder) {
		this.segmentOrder = segmentOrder;
	}

	public Boolean getStop() {
		return this.stop;
	}
	public void setStop(Boolean stop) {
		this.stop = stop;
	}

	public List<TrafficAirticketOrderStopInfo> getStopInfoList() {
		return this.stopInfoList;
	}
	public void setStopInfoList(List<TrafficAirticketOrderStopInfo> stopInfoList) {
		this.stopInfoList = stopInfoList;
	}

	public List<TrafficAirticketOrderTicketInfo> getTicketInfoList() {
		return this.ticketInfoList;
	}
	public void setTicketInfoList(List<TrafficAirticketOrderTicketInfo> ticketInfoList) {
		this.ticketInfoList = ticketInfoList;
	}

}
