package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出行机票订单数据同步-机票信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 20:34:18
 */
public class TrafficAirticketOrderTicketInfo extends AlipayObject {

	private static final long serialVersionUID = 1453845739656284569L;

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
	 * 到达时间
	 */
	@ApiField("arr_time")
	private Date arrTime;

	/**
	 * 辅营商品信息
	 */
	@ApiListField("commodity_info_list")
	@ApiField("traffic_airticket_order_commodity_info")
	private List<TrafficAirticketOrderCommodityInfo> commodityInfoList;

	/**
	 * 出发机场三字码
	 */
	@ApiField("dep_airport_code")
	private String depAirportCode;

	/**
	 * 出发机场名称
	 */
	@ApiField("dep_airport_name")
	private String depAirportName;

	/**
	 * 出发城市三字码
	 */
	@ApiField("dep_city_code")
	private String depCityCode;

	/**
	 * 出发城市名称
	 */
	@ApiField("dep_city_name")
	private String depCityName;

	/**
	 * 出发时间
	 */
	@ApiField("dep_time")
	private Date depTime;

	/**
	 * 是否国际航班票
1. true-该票是国际航班票
2. false-该票不是国际航班票
	 */
	@ApiField("international")
	private Boolean international;

	/**
	 * 该机票状态变更前关联的机票唯一标识，如：机票改签前旧票的uuid
	 */
	@ApiField("ori_ticket_uuid")
	private String oriTicketUuid;

	/**
	 * 是否共享航班
1. true-该航班是共享航班
2. false-该航班不是共享航班
	 */
	@ApiField("share")
	private Boolean share;

	/**
	 * 共享航班信息
	 */
	@ApiField("share_info")
	private TrafficAirticketOrderShareInfo shareInfo;

	/**
	 * 机票状态code
	 */
	@ApiField("status")
	private String status;

	/**
	 * 机票状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 机票号
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 机票序号，按机票的起飞时间顺序编号
	 */
	@ApiField("ticket_order")
	private Long ticketOrder;

	/**
	 * 机票类型
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 由商家生成的机票唯一标识
	 */
	@ApiField("ticket_uuid")
	private String ticketUuid;

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

	public Date getArrTime() {
		return this.arrTime;
	}
	public void setArrTime(Date arrTime) {
		this.arrTime = arrTime;
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

	public Date getDepTime() {
		return this.depTime;
	}
	public void setDepTime(Date depTime) {
		this.depTime = depTime;
	}

	public Boolean getInternational() {
		return this.international;
	}
	public void setInternational(Boolean international) {
		this.international = international;
	}

	public String getOriTicketUuid() {
		return this.oriTicketUuid;
	}
	public void setOriTicketUuid(String oriTicketUuid) {
		this.oriTicketUuid = oriTicketUuid;
	}

	public Boolean getShare() {
		return this.share;
	}
	public void setShare(Boolean share) {
		this.share = share;
	}

	public TrafficAirticketOrderShareInfo getShareInfo() {
		return this.shareInfo;
	}
	public void setShareInfo(TrafficAirticketOrderShareInfo shareInfo) {
		this.shareInfo = shareInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public Long getTicketOrder() {
		return this.ticketOrder;
	}
	public void setTicketOrder(Long ticketOrder) {
		this.ticketOrder = ticketOrder;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getTicketUuid() {
		return this.ticketUuid;
	}
	public void setTicketUuid(String ticketUuid) {
		this.ticketUuid = ticketUuid;
	}

}
