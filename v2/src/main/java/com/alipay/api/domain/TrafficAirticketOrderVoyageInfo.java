package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出行机票订单数据同步-航程信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 20:34:18
 */
public class TrafficAirticketOrderVoyageInfo extends AlipayObject {

	private static final long serialVersionUID = 2393459287315118587L;

	/**
	 * 辅营商品信息
	 */
	@ApiListField("commodity_info_list")
	@ApiField("traffic_airticket_order_commodity_info")
	private List<TrafficAirticketOrderCommodityInfo> commodityInfoList;

	/**
	 * 航程结束机场三字码
	 */
	@ApiField("end_airport_code")
	private String endAirportCode;

	/**
	 * 航程结束机场名称
	 */
	@ApiField("end_airport_name")
	private String endAirportName;

	/**
	 * 航程结束城市三字码
	 */
	@ApiField("end_city_code")
	private String endCityCode;

	/**
	 * 航程结束城市名称
	 */
	@ApiField("end_city_name")
	private String endCityName;

	/**
	 * 航程结束时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 是否国际航程
1. true-是国际航程
2. false-不是国际航程（仅国内）
	 */
	@ApiField("international")
	private Boolean international;

	/**
	 * 航段信息
	 */
	@ApiListField("segment_info_list")
	@ApiField("traffic_airticket_order_segment_info")
	private List<TrafficAirticketOrderSegmentInfo> segmentInfoList;

	/**
	 * 航程开始机场三字码
	 */
	@ApiField("start_airport_code")
	private String startAirportCode;

	/**
	 * 航程开始机场名称
	 */
	@ApiField("start_airport_name")
	private String startAirportName;

	/**
	 * 航程开始城市三字码
	 */
	@ApiField("start_city_code")
	private String startCityCode;

	/**
	 * 航程开始城市名称
	 */
	@ApiField("start_city_name")
	private String startCityName;

	/**
	 * 航程开始时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 是否中转
1. true-是中转
2. false-不是中转
	 */
	@ApiField("transfer")
	private Boolean transfer;

	/**
	 * 航程序号，按航程的起飞时间顺序编号
	 */
	@ApiField("voyage_order")
	private Long voyageOrder;

	public List<TrafficAirticketOrderCommodityInfo> getCommodityInfoList() {
		return this.commodityInfoList;
	}
	public void setCommodityInfoList(List<TrafficAirticketOrderCommodityInfo> commodityInfoList) {
		this.commodityInfoList = commodityInfoList;
	}

	public String getEndAirportCode() {
		return this.endAirportCode;
	}
	public void setEndAirportCode(String endAirportCode) {
		this.endAirportCode = endAirportCode;
	}

	public String getEndAirportName() {
		return this.endAirportName;
	}
	public void setEndAirportName(String endAirportName) {
		this.endAirportName = endAirportName;
	}

	public String getEndCityCode() {
		return this.endCityCode;
	}
	public void setEndCityCode(String endCityCode) {
		this.endCityCode = endCityCode;
	}

	public String getEndCityName() {
		return this.endCityName;
	}
	public void setEndCityName(String endCityName) {
		this.endCityName = endCityName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getInternational() {
		return this.international;
	}
	public void setInternational(Boolean international) {
		this.international = international;
	}

	public List<TrafficAirticketOrderSegmentInfo> getSegmentInfoList() {
		return this.segmentInfoList;
	}
	public void setSegmentInfoList(List<TrafficAirticketOrderSegmentInfo> segmentInfoList) {
		this.segmentInfoList = segmentInfoList;
	}

	public String getStartAirportCode() {
		return this.startAirportCode;
	}
	public void setStartAirportCode(String startAirportCode) {
		this.startAirportCode = startAirportCode;
	}

	public String getStartAirportName() {
		return this.startAirportName;
	}
	public void setStartAirportName(String startAirportName) {
		this.startAirportName = startAirportName;
	}

	public String getStartCityCode() {
		return this.startCityCode;
	}
	public void setStartCityCode(String startCityCode) {
		this.startCityCode = startCityCode;
	}

	public String getStartCityName() {
		return this.startCityName;
	}
	public void setStartCityName(String startCityName) {
		this.startCityName = startCityName;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Boolean getTransfer() {
		return this.transfer;
	}
	public void setTransfer(Boolean transfer) {
		this.transfer = transfer;
	}

	public Long getVoyageOrder() {
		return this.voyageOrder;
	}
	public void setVoyageOrder(Long voyageOrder) {
		this.voyageOrder = voyageOrder;
	}

}
