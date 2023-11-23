package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportsplay.gobill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-27 14:16:49
 */
public class AlipayUserSportsplayGobillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3223157212436497495L;

	/** 
	 * Go业务时间 时间戳
	 */
	@ApiField("biz_time")
	private Long bizTime;

	/** 
	 * 是否完成当前路线
	 */
	@ApiField("complete")
	private Boolean complete;

	/** 
	 * 当前路线已前进步数
	 */
	@ApiField("forward_step_count")
	private Long forwardStepCount;

	/** 
	 * Go流水记录id
	 */
	@ApiField("go_bill_id")
	private String goBillId;

	/** 
	 * Go使用的步数
	 */
	@ApiField("go_step_count")
	private Long goStepCount;

	/** 
	 * 路线id
	 */
	@ApiField("path_id")
	private String pathId;

	/** 
	 * 路线名称
	 */
	@ApiField("path_name")
	private String pathName;

	/** 
	 * 路线参与记录id
	 */
	@ApiField("path_record_id")
	private String pathRecordId;

	public void setBizTime(Long bizTime) {
		this.bizTime = bizTime;
	}
	public Long getBizTime( ) {
		return this.bizTime;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
	public Boolean getComplete( ) {
		return this.complete;
	}

	public void setForwardStepCount(Long forwardStepCount) {
		this.forwardStepCount = forwardStepCount;
	}
	public Long getForwardStepCount( ) {
		return this.forwardStepCount;
	}

	public void setGoBillId(String goBillId) {
		this.goBillId = goBillId;
	}
	public String getGoBillId( ) {
		return this.goBillId;
	}

	public void setGoStepCount(Long goStepCount) {
		this.goStepCount = goStepCount;
	}
	public Long getGoStepCount( ) {
		return this.goStepCount;
	}

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}
	public String getPathId( ) {
		return this.pathId;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	public String getPathName( ) {
		return this.pathName;
	}

	public void setPathRecordId(String pathRecordId) {
		this.pathRecordId = pathRecordId;
	}
	public String getPathRecordId( ) {
		return this.pathRecordId;
	}

}
