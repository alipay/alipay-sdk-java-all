package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门票信息
 *
 * @author auto create
 * @since 1.0, 2022-10-26 16:04:49
 */
public class ScenicTicketInfo extends AlipayObject {

	private static final long serialVersionUID = 2892149269941472434L;

	/**
	 * 自动检票时间
	 */
	@ApiField("auto_check_time")
	private Date autoCheckTime;

	/**
	 * 检票时间
	 */
	@ApiField("check_time")
	private Date checkTime;

	/**
	 * 完结时间
	 */
	@ApiField("close_time")
	private Date closeTime;

	/**
	 * IDENTITY_CARD_ONLY：凭身份证入园，
QR_CODE_ONLY：凭二维码入园，
IDENTITY_CARD_AND_QR_CODE：凭二维码或身份证入园
	 */
	@ApiField("enter_way")
	private String enterWay;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/**
	 * 具体不可用的日期， 长度最大为100
	 */
	@ApiListField("invalid_dates")
	@ApiField("date")
	private List<Date> invalidDates;

	/**
	 * 表示一周内什么时间不可用。示例中表示周六、周日不可用。
	 */
	@ApiField("invalid_day_in_week")
	private String invalidDayInWeek;

	/**
	 * 图片链接
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 门票单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 门票状态
INIT("INIT","初始化")
TICKET_RUNNING("TICKET_RUNNING",出票中)
TICKET_SUCCESS(TICKET_SUCCESS,出票成功)
TICKET_FAILURE("TICKET_FAILURE",出票失败)
TO_USE("TO_USE",待核销)
USED("USED",已核销)
CLOSED("CLOSED",已完结)
REFUND_RUNNING("REFUND_RUNNING",待退票)
REFUND_SUCCESS("REFUND_SUCCESS",已退票)
REFUND_FAILURE("REFUND_FAILURE",退票失败)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 票据数量，若一个实例表示一个门票，ticket_count = 1,
若为聚合门票, ticket_count = n;
	 */
	@ApiField("ticket_count")
	private Long ticketCount;

	/**
	 * 更新商品信息时候返回的商品id
	 */
	@ApiField("ticket_goods_id")
	private String ticketGoodsId;

	/**
	 * 票据小程序链接
	 */
	@ApiField("ticket_link")
	private String ticketLink;

	/**
	 * 门票名称
	 */
	@ApiField("ticket_name")
	private String ticketName;

	/**
	 * 单据号，确保同一笔订单下单据号唯一
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 门票规格
成人票、全价票
	 */
	@ApiField("ticket_specs")
	private String ticketSpecs;

	/**
	 * 门票类型
NORMAL("NORMAL","普通"),
GROUP("GROUP","套票"),
PERIOD("PERIOD","时段票"),
REGION("REGION","区域票")
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 票凭证code
	 */
	@ApiField("ticket_use_code")
	private String ticketUseCode;

	/**
	 * 购票凭证图片流的base64编码
	 */
	@ApiField("ticket_use_pic")
	private String ticketUsePic;

	/**
	 * 使用结束日期
	 */
	@ApiField("use_end_date")
	private Date useEndDate;

	/**
	 * 入园结束时间
	 */
	@ApiField("use_end_time")
	private String useEndTime;

	/**
	 * 使用开始日期
	 */
	@ApiField("use_start_date")
	private Date useStartDate;

	/**
	 * 入园开始时间
	 */
	@ApiField("use_start_time")
	private String useStartTime;

	public Date getAutoCheckTime() {
		return this.autoCheckTime;
	}
	public void setAutoCheckTime(Date autoCheckTime) {
		this.autoCheckTime = autoCheckTime;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public Date getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	public String getEnterWay() {
		return this.enterWay;
	}
	public void setEnterWay(String enterWay) {
		this.enterWay = enterWay;
	}

	public List<ScenicExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ScenicExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public List<Date> getInvalidDates() {
		return this.invalidDates;
	}
	public void setInvalidDates(List<Date> invalidDates) {
		this.invalidDates = invalidDates;
	}

	public String getInvalidDayInWeek() {
		return this.invalidDayInWeek;
	}
	public void setInvalidDayInWeek(String invalidDayInWeek) {
		this.invalidDayInWeek = invalidDayInWeek;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTicketCount() {
		return this.ticketCount;
	}
	public void setTicketCount(Long ticketCount) {
		this.ticketCount = ticketCount;
	}

	public String getTicketGoodsId() {
		return this.ticketGoodsId;
	}
	public void setTicketGoodsId(String ticketGoodsId) {
		this.ticketGoodsId = ticketGoodsId;
	}

	public String getTicketLink() {
		return this.ticketLink;
	}
	public void setTicketLink(String ticketLink) {
		this.ticketLink = ticketLink;
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

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getTicketUseCode() {
		return this.ticketUseCode;
	}
	public void setTicketUseCode(String ticketUseCode) {
		this.ticketUseCode = ticketUseCode;
	}

	public String getTicketUsePic() {
		return this.ticketUsePic;
	}
	public void setTicketUsePic(String ticketUsePic) {
		this.ticketUsePic = ticketUsePic;
	}

	public Date getUseEndDate() {
		return this.useEndDate;
	}
	public void setUseEndDate(Date useEndDate) {
		this.useEndDate = useEndDate;
	}

	public String getUseEndTime() {
		return this.useEndTime;
	}
	public void setUseEndTime(String useEndTime) {
		this.useEndTime = useEndTime;
	}

	public Date getUseStartDate() {
		return this.useStartDate;
	}
	public void setUseStartDate(Date useStartDate) {
		this.useStartDate = useStartDate;
	}

	public String getUseStartTime() {
		return this.useStartTime;
	}
	public void setUseStartTime(String useStartTime) {
		this.useStartTime = useStartTime;
	}

}
