package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antsports.currentpath.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:46:45
 */
public class AlipaySocialAntsportsCurrentpathQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2221762829727149829L;

	/** 
	 * 运动数据今日已消费步数
	 */
	@ApiField("exercise_consume_step_count")
	private Long exerciseConsumeStepCount;

	/** 
	 * 运动数据今日行走步数
	 */
	@ApiField("exercise_produce_step_count")
	private Long exerciseProduceStepCount;

	/** 
	 * 用户路线参当前路线已走步数
	 */
	@ApiField("forward_step_count")
	private Long forwardStepCount;

	/** 
	 * 最小起go步数
	 */
	@ApiField("min_go_steps")
	private Long minGoSteps;

	/** 
	 * 下一个路线ID
	 */
	@ApiField("next_unlock_path_id")
	private String nextUnlockPathId;

	/** 
	 * 路线完成状态
	 */
	@ApiField("path_complete_status")
	private String pathCompleteStatus;

	/** 
	 * 路线ID
	 */
	@ApiField("path_id")
	private String pathId;

	/** 
	 * 路线加入状态
	 */
	@ApiField("path_join_status")
	private String pathJoinStatus;

	/** 
	 * 路线名称
	 */
	@ApiField("path_name")
	private String pathName;

	/** 
	 * 加入路线的流水
	 */
	@ApiField("path_record_id")
	private String pathRecordId;

	/** 
	 * 当前行走的路线场景
	 */
	@ApiField("path_scene")
	private String pathScene;

	/** 
	 * 路线归属站点编码
	 */
	@ApiField("path_station_code")
	private String pathStationCode;

	/** 
	 * 路线归属站点名称
	 */
	@ApiField("path_station_name")
	private String pathStationName;

	public void setExerciseConsumeStepCount(Long exerciseConsumeStepCount) {
		this.exerciseConsumeStepCount = exerciseConsumeStepCount;
	}
	public Long getExerciseConsumeStepCount( ) {
		return this.exerciseConsumeStepCount;
	}

	public void setExerciseProduceStepCount(Long exerciseProduceStepCount) {
		this.exerciseProduceStepCount = exerciseProduceStepCount;
	}
	public Long getExerciseProduceStepCount( ) {
		return this.exerciseProduceStepCount;
	}

	public void setForwardStepCount(Long forwardStepCount) {
		this.forwardStepCount = forwardStepCount;
	}
	public Long getForwardStepCount( ) {
		return this.forwardStepCount;
	}

	public void setMinGoSteps(Long minGoSteps) {
		this.minGoSteps = minGoSteps;
	}
	public Long getMinGoSteps( ) {
		return this.minGoSteps;
	}

	public void setNextUnlockPathId(String nextUnlockPathId) {
		this.nextUnlockPathId = nextUnlockPathId;
	}
	public String getNextUnlockPathId( ) {
		return this.nextUnlockPathId;
	}

	public void setPathCompleteStatus(String pathCompleteStatus) {
		this.pathCompleteStatus = pathCompleteStatus;
	}
	public String getPathCompleteStatus( ) {
		return this.pathCompleteStatus;
	}

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}
	public String getPathId( ) {
		return this.pathId;
	}

	public void setPathJoinStatus(String pathJoinStatus) {
		this.pathJoinStatus = pathJoinStatus;
	}
	public String getPathJoinStatus( ) {
		return this.pathJoinStatus;
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

	public void setPathScene(String pathScene) {
		this.pathScene = pathScene;
	}
	public String getPathScene( ) {
		return this.pathScene;
	}

	public void setPathStationCode(String pathStationCode) {
		this.pathStationCode = pathStationCode;
	}
	public String getPathStationCode( ) {
		return this.pathStationCode;
	}

	public void setPathStationName(String pathStationName) {
		this.pathStationName = pathStationName;
	}
	public String getPathStationName( ) {
		return this.pathStationName;
	}

}
