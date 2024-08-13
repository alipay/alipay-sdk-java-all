package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 感知数据
 *
 * @author auto create
 * @since 1.0, 2019-01-23 11:53:47
 */
public class SummaryData extends AlipayObject {

	private static final long serialVersionUID = 8521587374216624124L;

	/**
	 * 成年人客流数
	 */
	@ApiField("adult")
	private Long adult;

	/**
	 * 平均截留时间
	 */
	@ApiField("avg_stop_time")
	private String avgStopTime;

	/**
	 * 背面截留率
	 */
	@ApiField("back_interception_rate")
	private String backInterceptionRate;

	/**
	 * 老年人客流数
	 */
	@ApiField("elder")
	private Long elder;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 正面截留率
	 */
	@ApiField("face_interception_rate")
	private String faceInterceptionRate;

	/**
	 * 女性客流数
	 */
	@ApiField("female")
	private Long female;

	/**
	 * 男性客流数
	 */
	@ApiField("male")
	private Long male;

	/**
	 * 未成年客流数
	 */
	@ApiField("nonage")
	private Long nonage;

	/**
	 * 感知客流量
	 */
	@ApiField("person_view")
	private Long personView;

	/**
	 * 侧面截留率
	 */
	@ApiField("side_interception_rate")
	private String sideInterceptionRate;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Long startTime;

	public Long getAdult() {
		return this.adult;
	}
	public void setAdult(Long adult) {
		this.adult = adult;
	}

	public String getAvgStopTime() {
		return this.avgStopTime;
	}
	public void setAvgStopTime(String avgStopTime) {
		this.avgStopTime = avgStopTime;
	}

	public String getBackInterceptionRate() {
		return this.backInterceptionRate;
	}
	public void setBackInterceptionRate(String backInterceptionRate) {
		this.backInterceptionRate = backInterceptionRate;
	}

	public Long getElder() {
		return this.elder;
	}
	public void setElder(Long elder) {
		this.elder = elder;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getFaceInterceptionRate() {
		return this.faceInterceptionRate;
	}
	public void setFaceInterceptionRate(String faceInterceptionRate) {
		this.faceInterceptionRate = faceInterceptionRate;
	}

	public Long getFemale() {
		return this.female;
	}
	public void setFemale(Long female) {
		this.female = female;
	}

	public Long getMale() {
		return this.male;
	}
	public void setMale(Long male) {
		this.male = male;
	}

	public Long getNonage() {
		return this.nonage;
	}
	public void setNonage(Long nonage) {
		this.nonage = nonage;
	}

	public Long getPersonView() {
		return this.personView;
	}
	public void setPersonView(Long personView) {
		this.personView = personView;
	}

	public String getSideInterceptionRate() {
		return this.sideInterceptionRate;
	}
	public void setSideInterceptionRate(String sideInterceptionRate) {
		this.sideInterceptionRate = sideInterceptionRate;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

}
