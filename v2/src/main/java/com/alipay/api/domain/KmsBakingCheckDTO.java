package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 烘焙数据核对模型
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:47
 */
public class KmsBakingCheckDTO extends AlipayObject {

	private static final long serialVersionUID = 5431298826448141748L;

	/**
	 * 回传结束时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 回传起始时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 回传数量
	 */
	@ApiField("sync_count")
	private String syncCount;

	/**
	 * 回传日期，格式：yyyy-MM-dd
	 */
	@ApiField("sync_time")
	private String syncTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSyncCount() {
		return this.syncCount;
	}
	public void setSyncCount(String syncCount) {
		this.syncCount = syncCount;
	}

	public String getSyncTime() {
		return this.syncTime;
	}
	public void setSyncTime(String syncTime) {
		this.syncTime = syncTime;
	}

}
