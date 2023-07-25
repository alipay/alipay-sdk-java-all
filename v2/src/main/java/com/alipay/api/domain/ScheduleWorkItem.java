package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班结果
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:07:45
 */
public class ScheduleWorkItem extends AlipayObject {

	private static final long serialVersionUID = 1731987975493199341L;

	/**
	 * 该班次总里程
	 */
	@ApiField("all_miles")
	private Long allMiles;

	/**
	 * 该班次总车次数
	 */
	@ApiField("all_trip_cnt")
	private Long allTripCnt;

	/**
	 * 班次序号
	 */
	@ApiField("chain_num")
	private Long chainNum;

	/**
	 * 该班次非营运里程
	 */
	@ApiField("invalid_miles")
	private Long invalidMiles;

	/**
	 * 该班次非营运车次数
	 */
	@ApiField("invalid_trip_cnt")
	private Long invalidTripCnt;

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
	 * 班制编号（0：通班；1：双班，2：三班）
	 */
	@ApiField("shift_id")
	private String shiftId;

	/**
	 * 车次链信息（json格式）
	 */
	@ApiField("trip_chain")
	private String tripChain;

	/**
	 * 该班次营运里程
	 */
	@ApiField("valid_miles")
	private Long validMiles;

	/**
	 * 该班次营运车次数
	 */
	@ApiField("valid_trip_cnt")
	private Long validTripCnt;

	/**
	 * 等待时长	02:10:00
	 */
	@ApiField("wait_time")
	private String waitTime;

	/**
	 * 工作结束时间，如20:30:00
	 */
	@ApiField("work_endtime")
	private String workEndtime;

	/**
	 * 班型编号（0：全天班；1：上午班，2：下午班，3：夜班）
	 */
	@ApiField("work_id")
	private String workId;

	/**
	 * 工作开始时间，如10:00:00
	 */
	@ApiField("work_starttime")
	private String workStarttime;

	/**
	 * 工作时长，如15:10:00
	 */
	@ApiField("work_time")
	private String workTime;

	public Long getAllMiles() {
		return this.allMiles;
	}
	public void setAllMiles(Long allMiles) {
		this.allMiles = allMiles;
	}

	public Long getAllTripCnt() {
		return this.allTripCnt;
	}
	public void setAllTripCnt(Long allTripCnt) {
		this.allTripCnt = allTripCnt;
	}

	public Long getChainNum() {
		return this.chainNum;
	}
	public void setChainNum(Long chainNum) {
		this.chainNum = chainNum;
	}

	public Long getInvalidMiles() {
		return this.invalidMiles;
	}
	public void setInvalidMiles(Long invalidMiles) {
		this.invalidMiles = invalidMiles;
	}

	public Long getInvalidTripCnt() {
		return this.invalidTripCnt;
	}
	public void setInvalidTripCnt(Long invalidTripCnt) {
		this.invalidTripCnt = invalidTripCnt;
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

	public String getShiftId() {
		return this.shiftId;
	}
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}

	public String getTripChain() {
		return this.tripChain;
	}
	public void setTripChain(String tripChain) {
		this.tripChain = tripChain;
	}

	public Long getValidMiles() {
		return this.validMiles;
	}
	public void setValidMiles(Long validMiles) {
		this.validMiles = validMiles;
	}

	public Long getValidTripCnt() {
		return this.validTripCnt;
	}
	public void setValidTripCnt(Long validTripCnt) {
		this.validTripCnt = validTripCnt;
	}

	public String getWaitTime() {
		return this.waitTime;
	}
	public void setWaitTime(String waitTime) {
		this.waitTime = waitTime;
	}

	public String getWorkEndtime() {
		return this.workEndtime;
	}
	public void setWorkEndtime(String workEndtime) {
		this.workEndtime = workEndtime;
	}

	public String getWorkId() {
		return this.workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getWorkStarttime() {
		return this.workStarttime;
	}
	public void setWorkStarttime(String workStarttime) {
		this.workStarttime = workStarttime;
	}

	public String getWorkTime() {
		return this.workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

}
