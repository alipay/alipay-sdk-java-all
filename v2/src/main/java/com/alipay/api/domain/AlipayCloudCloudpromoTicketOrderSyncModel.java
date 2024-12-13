package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云门票订单信息同步
 *
 * @author auto create
 * @since 1.0, 2024-08-22 11:36:35
 */
public class AlipayCloudCloudpromoTicketOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3658996723373333716L;

	/**
	 * 实付金额,单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 证件号
	 */
	@ApiField("contacter_cert_no")
	private String contacterCertNo;

	/**
	 * 证件类型
	 */
	@ApiField("contacter_cert_type")
	private String contacterCertType;

	/**
	 * 手机号
	 */
	@ApiField("contacter_mobile_no")
	private String contacterMobileNo;

	/**
	 * 联系人姓名
	 */
	@ApiField("contacter_name")
	private String contacterName;

	/**
	 * 优惠金额,单位元,优惠金额=订单总金额-实付金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 门票有效期结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 入园结束时间
	 */
	@ApiField("entry_end_time")
	private String entryEndTime;

	/**
	 * 入园开始时间
	 */
	@ApiField("entry_start_time")
	private String entryStartTime;

	/**
	 * 门票描述信息
	 */
	@ApiField("good_desc")
	private String goodDesc;

	/**
	 * 商品id
	 */
	@ApiField("good_id")
	private String goodId;

	/**
	 * 门票中文描述
	 */
	@ApiField("good_name")
	private String goodName;

	/**
	 * 不可用日期,数组表示,如["2024-08-09 00:00:00","2024-08-11 00:00:00"] 表示2024-08-09，2024-08-11 这2天不可用
	 */
	@ApiListField("invalid_dates")
	@ApiField("string")
	private List<String> invalidDates;

	/**
	 * 一周内不可用日期,1-7表示星期一到星期日
	 */
	@ApiListField("invalid_day_in_week")
	@ApiField("string")
	private List<String> invalidDayInWeek;

	/**
	 * 景区的中文描述
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 门票数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 订单总金额,单位元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单明细信息.存在套票则设置多个订单明细.
	 */
	@ApiListField("order_details")
	@ApiField("ticket_order_detail_info")
	private List<TicketOrderDetailInfo> orderDetails;

	/**
	 * 门票订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 门票有效期开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 门票状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门票类型:山水，人文，乐园，寺庙，博物馆，其他
	 */
	@ApiField("type")
	private String type;

	/**
	 * 门票单价,单位元
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getContacterCertNo() {
		return this.contacterCertNo;
	}
	public void setContacterCertNo(String contacterCertNo) {
		this.contacterCertNo = contacterCertNo;
	}

	public String getContacterCertType() {
		return this.contacterCertType;
	}
	public void setContacterCertType(String contacterCertType) {
		this.contacterCertType = contacterCertType;
	}

	public String getContacterMobileNo() {
		return this.contacterMobileNo;
	}
	public void setContacterMobileNo(String contacterMobileNo) {
		this.contacterMobileNo = contacterMobileNo;
	}

	public String getContacterName() {
		return this.contacterName;
	}
	public void setContacterName(String contacterName) {
		this.contacterName = contacterName;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEntryEndTime() {
		return this.entryEndTime;
	}
	public void setEntryEndTime(String entryEndTime) {
		this.entryEndTime = entryEndTime;
	}

	public String getEntryStartTime() {
		return this.entryStartTime;
	}
	public void setEntryStartTime(String entryStartTime) {
		this.entryStartTime = entryStartTime;
	}

	public String getGoodDesc() {
		return this.goodDesc;
	}
	public void setGoodDesc(String goodDesc) {
		this.goodDesc = goodDesc;
	}

	public String getGoodId() {
		return this.goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public String getGoodName() {
		return this.goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public List<String> getInvalidDates() {
		return this.invalidDates;
	}
	public void setInvalidDates(List<String> invalidDates) {
		this.invalidDates = invalidDates;
	}

	public List<String> getInvalidDayInWeek() {
		return this.invalidDayInWeek;
	}
	public void setInvalidDayInWeek(List<String> invalidDayInWeek) {
		this.invalidDayInWeek = invalidDayInWeek;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public List<TicketOrderDetailInfo> getOrderDetails() {
		return this.orderDetails;
	}
	public void setOrderDetails(List<TicketOrderDetailInfo> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
