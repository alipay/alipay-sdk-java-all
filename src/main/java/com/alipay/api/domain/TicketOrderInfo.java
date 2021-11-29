package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证信息
 *
 * @author auto create
 * @since 1.0, 2021-08-31 00:53:59
 */
public class TicketOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3361951134514955749L;

	/**
	 * 目的地信息
	 */
	@ApiField("arrival")
	private JourneyLocation arrival;

	/**
	 * 凭证内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 出发地信息
	 */
	@ApiField("departure")
	private JourneyLocation departure;

	/**
	 * 凭证有效数
	 */
	@ApiField("effective_num")
	private Long effectiveNum;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 票面价
	 */
	@ApiField("face_value")
	private String faceValue;

	/**
	 * 功能服务信息
	 */
	@ApiListField("functional_services")
	@ApiField("functional_service")
	private List<FunctionalService> functionalServices;

	/**
	 * 凭证失效原因
	 */
	@ApiField("invalid_reason")
	private String invalidReason;

	/**
	 * 凭证可使用地点
	 */
	@ApiListField("locations")
	@ApiField("journey_location")
	private List<JourneyLocation> locations;

	/**
	 * 商户侧凭证ID或核销码
	 */
	@ApiField("merchant_ticket_no")
	private String merchantTicketNo;

	/**
	 * 座位信息
	 */
	@ApiListField("seat_infos")
	@ApiField("seat_info")
	private List<SeatInfo> seatInfos;

	/**
	 * 凭证服务提供商
	 */
	@ApiField("service_provider")
	private OrderParticipantInfo serviceProvider;

	/**
	 * 凭证可使用门店列表
	 */
	@ApiListField("shops")
	@ApiField("order_shop_info")
	private List<OrderShopInfo> shops;

	/**
	 * 凭证开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 凭证状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 凭证创建时间
	 */
	@ApiField("ticket_create_time")
	private Date ticketCreateTime;

	/**
	 * 凭证修改时间，精确到毫秒
	 */
	@ApiField("ticket_modify_time")
	private Date ticketModifyTime;

	/**
	 * 凭证购买数
	 */
	@ApiField("ticket_num")
	private Long ticketNum;

	/**
	 * 凭证使用者信息
	 */
	@ApiListField("ticket_users")
	@ApiField("user_infomation")
	private List<UserInfomation> ticketUsers;

	/**
	 * 凭证标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 交通工具信息
	 */
	@ApiField("vehicle_info")
	private OrderVehicleInfo vehicleInfo;

	public JourneyLocation getArrival() {
		return this.arrival;
	}
	public void setArrival(JourneyLocation arrival) {
		this.arrival = arrival;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public JourneyLocation getDeparture() {
		return this.departure;
	}
	public void setDeparture(JourneyLocation departure) {
		this.departure = departure;
	}

	public Long getEffectiveNum() {
		return this.effectiveNum;
	}
	public void setEffectiveNum(Long effectiveNum) {
		this.effectiveNum = effectiveNum;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getFaceValue() {
		return this.faceValue;
	}
	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

	public List<FunctionalService> getFunctionalServices() {
		return this.functionalServices;
	}
	public void setFunctionalServices(List<FunctionalService> functionalServices) {
		this.functionalServices = functionalServices;
	}

	public String getInvalidReason() {
		return this.invalidReason;
	}
	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}

	public List<JourneyLocation> getLocations() {
		return this.locations;
	}
	public void setLocations(List<JourneyLocation> locations) {
		this.locations = locations;
	}

	public String getMerchantTicketNo() {
		return this.merchantTicketNo;
	}
	public void setMerchantTicketNo(String merchantTicketNo) {
		this.merchantTicketNo = merchantTicketNo;
	}

	public List<SeatInfo> getSeatInfos() {
		return this.seatInfos;
	}
	public void setSeatInfos(List<SeatInfo> seatInfos) {
		this.seatInfos = seatInfos;
	}

	public OrderParticipantInfo getServiceProvider() {
		return this.serviceProvider;
	}
	public void setServiceProvider(OrderParticipantInfo serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public List<OrderShopInfo> getShops() {
		return this.shops;
	}
	public void setShops(List<OrderShopInfo> shops) {
		this.shops = shops;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTicketCreateTime() {
		return this.ticketCreateTime;
	}
	public void setTicketCreateTime(Date ticketCreateTime) {
		this.ticketCreateTime = ticketCreateTime;
	}

	public Date getTicketModifyTime() {
		return this.ticketModifyTime;
	}
	public void setTicketModifyTime(Date ticketModifyTime) {
		this.ticketModifyTime = ticketModifyTime;
	}

	public Long getTicketNum() {
		return this.ticketNum;
	}
	public void setTicketNum(Long ticketNum) {
		this.ticketNum = ticketNum;
	}

	public List<UserInfomation> getTicketUsers() {
		return this.ticketUsers;
	}
	public void setTicketUsers(List<UserInfomation> ticketUsers) {
		this.ticketUsers = ticketUsers;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public OrderVehicleInfo getVehicleInfo() {
		return this.vehicleInfo;
	}
	public void setVehicleInfo(OrderVehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

}
