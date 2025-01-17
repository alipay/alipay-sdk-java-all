package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 比赛赛程同步
 *
 * @author auto create
 * @since 1.0, 2023-09-24 17:59:15
 */
public class AlipayCommerceSportsCompetitionScheduleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5197113816977842885L;

	/**
	 * 实际结束时间
	 */
	@ApiField("actual_end_date")
	private Date actualEndDate;

	/**
	 * 实际开始时间
	 */
	@ApiField("actual_start_date")
	private Date actualStartDate;

	/**
	 * 赛程中文名称
	 */
	@ApiField("cn_name")
	private String cnName;

	/**
	 * 赛事编号
	 */
	@ApiField("competition_code")
	private String competitionCode;

	/**
	 * 版本
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 大项
	 */
	@ApiField("discipline")
	private String discipline;

	/**
	 * Men's 100m Backstroke - Heats
	 */
	@ApiField("en_name")
	private String enName;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 小项场次类型
	 */
	@ApiField("event_unit_type")
	private String eventUnitType;

	/**
	 * 热度标签
	 */
	@ApiField("hot_label")
	private String hotLabel;

	/**
	 * 热度值
	 */
	@ApiField("hot_level")
	private Long hotLevel;

	/**
	 * 举办地点code
	 */
	@ApiField("location_code")
	private String locationCode;

	/**
	 * location_name
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 奖牌标识
	 */
	@ApiField("medal_flag")
	private String medalFlag;

	/**
	 * 赛程状态
	 */
	@ApiField("schedule_status")
	private String scheduleStatus;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 比赛编号
	 */
	@ApiField("unit_code")
	private String unitCode;

	/**
	 * 举办场馆code
	 */
	@ApiField("venue_code")
	private String venueCode;

	/**
	 * 举办场馆名称
	 */
	@ApiField("venue_name")
	private String venueName;

	public Date getActualEndDate() {
		return this.actualEndDate;
	}
	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public Date getActualStartDate() {
		return this.actualStartDate;
	}
	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public String getCnName() {
		return this.cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getCompetitionCode() {
		return this.competitionCode;
	}
	public void setCompetitionCode(String competitionCode) {
		this.competitionCode = competitionCode;
	}

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getDiscipline() {
		return this.discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public String getEnName() {
		return this.enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEventUnitType() {
		return this.eventUnitType;
	}
	public void setEventUnitType(String eventUnitType) {
		this.eventUnitType = eventUnitType;
	}

	public String getHotLabel() {
		return this.hotLabel;
	}
	public void setHotLabel(String hotLabel) {
		this.hotLabel = hotLabel;
	}

	public Long getHotLevel() {
		return this.hotLevel;
	}
	public void setHotLevel(Long hotLevel) {
		this.hotLevel = hotLevel;
	}

	public String getLocationCode() {
		return this.locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getMedalFlag() {
		return this.medalFlag;
	}
	public void setMedalFlag(String medalFlag) {
		this.medalFlag = medalFlag;
	}

	public String getScheduleStatus() {
		return this.scheduleStatus;
	}
	public void setScheduleStatus(String scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUnitCode() {
		return this.unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getVenueCode() {
		return this.venueCode;
	}
	public void setVenueCode(String venueCode) {
		this.venueCode = venueCode;
	}

	public String getVenueName() {
		return this.venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

}
