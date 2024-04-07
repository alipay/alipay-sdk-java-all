package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票同步
 *
 * @author auto create
 * @since 1.0, 2023-09-14 20:35:46
 */
public class AlipayCommerceSportsTicketSendModel extends AlipayObject {

	private static final long serialVersionUID = 6247519478935594764L;

	/**
	 * 外部业务号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 场馆所属城市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 运动项目分项
	 */
	@ApiField("discipline")
	private String discipline;

	/**
	 * 英文运动项目分项
	 */
	@ApiField("discipline_en")
	private String disciplineEn;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 同步时间
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 开赛时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	/**
	 * 赛事场馆id
	 */
	@ApiField("venue_id")
	private String venueId;

	/**
	 * 观赛地点
	 */
	@ApiField("venue_name")
	private String venueName;

	/**
	 * 英文观赛地点
	 */
	@ApiField("venue_name_en")
	private String venueNameEn;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDiscipline() {
		return this.discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public String getDisciplineEn() {
		return this.disciplineEn;
	}
	public void setDisciplineEn(String disciplineEn) {
		this.disciplineEn = disciplineEn;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

	public String getVenueId() {
		return this.venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return this.venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getVenueNameEn() {
		return this.venueNameEn;
	}
	public void setVenueNameEn(String venueNameEn) {
		this.venueNameEn = venueNameEn;
	}

}
