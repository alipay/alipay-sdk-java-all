package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:07:45
 */
public class ScheduleWorkStatItem extends AlipayObject {

	private static final long serialVersionUID = 2449869862442927764L;

	/**
	 * 总里程统计指标	{sum:2500,mean:130,max:180,min:60,std:40.2}
	 */
	@ApiField("all_miles_sts")
	private String allMilesSts;

	/**
	 * 总车次数统计指标 {sum:250,mean:13,max:18,min:6,std:4.02}
	 */
	@ApiField("all_trip_sts")
	private String allTripSts;

	/**
	 * 下行总班次数
	 */
	@ApiField("down_chain_cnt")
	private Long downChainCnt;

	/**
	 * 非营运里程统计指标	{“1”:220,“2”:50,“3”:120,“4”:50,”5”:0} Key为排班计划中的发车类型
	 */
	@ApiField("invalid_miles_sts")
	private String invalidMilesSts;

	/**
	 * 非营运车次数统计指标 {“1”:22,“2”:5,“3”:12,“4”:5,”5”:0} Key为排班计划中的发车类型
	 */
	@ApiField("invalid_trip_sts")
	private String invalidTripSts;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 优化目标，0：班次最少；1：工作时长最短；2：等待时间最少；3：工作时长最均匀
	 */
	@ApiField("opt_type")
	private Long optType;

	/**
	 * 上行总班次数
	 */
	@ApiField("up_chain_cnt")
	private Long upChainCnt;

	/**
	 * 营运里程统计指标	{sum:2300,mean:110,max:150,min:40,std:30.2}
	 */
	@ApiField("valid_miles_sts")
	private String validMilesSts;

	/**
	 * 营运车次数统计指标 {sum:230,mean:11,max:15,min:4,std:3.02}
	 */
	@ApiField("valid_trip_sts")
	private String validTripSts;

	/**
	 * 等待时长统计指标(Json)	{sum:55:10:00,mean:02:10:00,max:06:10:00,min:00:50:00,std:01:01:00}'
	 */
	@ApiField("wait_time_sts")
	private String waitTimeSts;

	/**
	 * 工作时长统计指标(Json)	{sum:246:03:00,mean:10:10:00,max:17:10:00,min:06:50:00,std:02:01:00}
	 */
	@ApiField("work_time_sts")
	private String workTimeSts;

	public String getAllMilesSts() {
		return this.allMilesSts;
	}
	public void setAllMilesSts(String allMilesSts) {
		this.allMilesSts = allMilesSts;
	}

	public String getAllTripSts() {
		return this.allTripSts;
	}
	public void setAllTripSts(String allTripSts) {
		this.allTripSts = allTripSts;
	}

	public Long getDownChainCnt() {
		return this.downChainCnt;
	}
	public void setDownChainCnt(Long downChainCnt) {
		this.downChainCnt = downChainCnt;
	}

	public String getInvalidMilesSts() {
		return this.invalidMilesSts;
	}
	public void setInvalidMilesSts(String invalidMilesSts) {
		this.invalidMilesSts = invalidMilesSts;
	}

	public String getInvalidTripSts() {
		return this.invalidTripSts;
	}
	public void setInvalidTripSts(String invalidTripSts) {
		this.invalidTripSts = invalidTripSts;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public Long getOptType() {
		return this.optType;
	}
	public void setOptType(Long optType) {
		this.optType = optType;
	}

	public Long getUpChainCnt() {
		return this.upChainCnt;
	}
	public void setUpChainCnt(Long upChainCnt) {
		this.upChainCnt = upChainCnt;
	}

	public String getValidMilesSts() {
		return this.validMilesSts;
	}
	public void setValidMilesSts(String validMilesSts) {
		this.validMilesSts = validMilesSts;
	}

	public String getValidTripSts() {
		return this.validTripSts;
	}
	public void setValidTripSts(String validTripSts) {
		this.validTripSts = validTripSts;
	}

	public String getWaitTimeSts() {
		return this.waitTimeSts;
	}
	public void setWaitTimeSts(String waitTimeSts) {
		this.waitTimeSts = waitTimeSts;
	}

	public String getWorkTimeSts() {
		return this.workTimeSts;
	}
	public void setWorkTimeSts(String workTimeSts) {
		this.workTimeSts = workTimeSts;
	}

}
