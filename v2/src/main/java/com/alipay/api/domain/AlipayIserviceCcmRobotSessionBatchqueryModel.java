package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人会话列表查询
 *
 * @author auto create
 * @since 1.0, 2025-02-24 21:54:06
 */
public class AlipayIserviceCcmRobotSessionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1374626667161243589L;

	/**
	 * 开始时间戳（单位毫秒）
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 结束时间戳（单位毫秒）
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 聊天窗编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话用户id
	 */
	@ApiField("visitor_id")
	private String visitorId;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

}
