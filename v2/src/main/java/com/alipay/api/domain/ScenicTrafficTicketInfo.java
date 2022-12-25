package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区小交通票务信息。
 *
 * @author auto create
 * @since 1.0, 2021-09-01 10:16:14
 */
public class ScenicTrafficTicketInfo extends AlipayObject {

	private static final long serialVersionUID = 3792463854231958823L;

	/**
	 * 检票时间
	 */
	@ApiField("check_time")
	private Date checkTime;

	/**
	 * isv侧出发地景区id
	 */
	@ApiField("departure_outer_scenic_id")
	private String departureOuterScenicId;

	/**
	 * isv侧目的地景区id
	 */
	@ApiField("destination_outer_scenic_id")
	private String destinationOuterScenicId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private ScenicExtInfo extInfo;

	/**
	 * 乘客信息。
	 */
	@ApiField("passengers")
	private ScenicTrafficUserInfo passengers;

	/**
	 * 门票图片流的base64编码，大小不要超过1M。
	 */
	@ApiField("pic")
	private String pic;

	/**
	 * 景区小交通产品信息。
	 */
	@ApiField("product_info")
	private TrafficProductInfo productInfo;

	/**
	 * 该车票数量
	 */
	@ApiField("ticket_count")
	private Long ticketCount;

	/**
	 * 门票名称
	 */
	@ApiField("ticket_name")
	private String ticketName;

	/**
	 * isv侧门票唯一标识。
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * ADULT 成人票，
CHILDREN 儿童票，
OLD 老年票
	 */
	@ApiField("ticket_specs")
	private String ticketSpecs;

	/**
	 * TO_USE 待核销，
USED 已核销
	 */
	@ApiField("ticket_status")
	private String ticketStatus;

	/**
	 * PASS 通票/时间段，
POINT 时间点。

注意：对于时间点类型的小交通门票，使用开始时间和使用结束时间传值一致。
	 */
	@ApiField("ticket_use_type")
	private String ticketUseType;

	/**
	 * 使用结束时间
	 */
	@ApiField("use_end_time")
	private Date useEndTime;

	/**
	 * 使用开始时间
	 */
	@ApiField("use_start_time")
	private Date useStartTime;

	public Date getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getDepartureOuterScenicId() {
		return this.departureOuterScenicId;
	}
	public void setDepartureOuterScenicId(String departureOuterScenicId) {
		this.departureOuterScenicId = departureOuterScenicId;
	}

	public String getDestinationOuterScenicId() {
		return this.destinationOuterScenicId;
	}
	public void setDestinationOuterScenicId(String destinationOuterScenicId) {
		this.destinationOuterScenicId = destinationOuterScenicId;
	}

	public ScenicExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ScenicExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public ScenicTrafficUserInfo getPassengers() {
		return this.passengers;
	}
	public void setPassengers(ScenicTrafficUserInfo passengers) {
		this.passengers = passengers;
	}

	public String getPic() {
		return this.pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}

	public TrafficProductInfo getProductInfo() {
		return this.productInfo;
	}
	public void setProductInfo(TrafficProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public Long getTicketCount() {
		return this.ticketCount;
	}
	public void setTicketCount(Long ticketCount) {
		this.ticketCount = ticketCount;
	}

	public String getTicketName() {
		return this.ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getTicketSpecs() {
		return this.ticketSpecs;
	}
	public void setTicketSpecs(String ticketSpecs) {
		this.ticketSpecs = ticketSpecs;
	}

	public String getTicketStatus() {
		return this.ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTicketUseType() {
		return this.ticketUseType;
	}
	public void setTicketUseType(String ticketUseType) {
		this.ticketUseType = ticketUseType;
	}

	public Date getUseEndTime() {
		return this.useEndTime;
	}
	public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

	public Date getUseStartTime() {
		return this.useStartTime;
	}
	public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

}
