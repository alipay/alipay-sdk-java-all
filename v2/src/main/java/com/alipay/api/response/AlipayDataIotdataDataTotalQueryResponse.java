package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.data.total.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataIotdataDataTotalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6527966886174283573L;

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

	public void setAdult(Long adult) {
		this.adult = adult;
	}
	public Long getAdult( ) {
		return this.adult;
	}

	public void setAvgStopTime(String avgStopTime) {
		this.avgStopTime = avgStopTime;
	}
	public String getAvgStopTime( ) {
		return this.avgStopTime;
	}

	public void setBackInterceptionRate(String backInterceptionRate) {
		this.backInterceptionRate = backInterceptionRate;
	}
	public String getBackInterceptionRate( ) {
		return this.backInterceptionRate;
	}

	public void setElder(Long elder) {
		this.elder = elder;
	}
	public Long getElder( ) {
		return this.elder;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	public Long getEndTime( ) {
		return this.endTime;
	}

	public void setFaceInterceptionRate(String faceInterceptionRate) {
		this.faceInterceptionRate = faceInterceptionRate;
	}
	public String getFaceInterceptionRate( ) {
		return this.faceInterceptionRate;
	}

	public void setFemale(Long female) {
		this.female = female;
	}
	public Long getFemale( ) {
		return this.female;
	}

	public void setMale(Long male) {
		this.male = male;
	}
	public Long getMale( ) {
		return this.male;
	}

	public void setNonage(Long nonage) {
		this.nonage = nonage;
	}
	public Long getNonage( ) {
		return this.nonage;
	}

	public void setPersonView(Long personView) {
		this.personView = personView;
	}
	public Long getPersonView( ) {
		return this.personView;
	}

	public void setSideInterceptionRate(String sideInterceptionRate) {
		this.sideInterceptionRate = sideInterceptionRate;
	}
	public String getSideInterceptionRate( ) {
		return this.sideInterceptionRate;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getStartTime( ) {
		return this.startTime;
	}

}
