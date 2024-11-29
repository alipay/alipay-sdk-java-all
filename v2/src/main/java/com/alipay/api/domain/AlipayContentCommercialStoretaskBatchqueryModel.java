package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播小店带货任务查询接口
 *
 * @author auto create
 * @since 1.0, 2024-08-22 15:42:33
 */
public class AlipayContentCommercialStoretaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2442293398493959119L;

	/**
	 * 任务结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 分页页码，从1开始，默认值为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，默认值10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝商家pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 任务开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
