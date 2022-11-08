package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文体运动任务完成的事件消息发送
 *
 * @author auto create
 * @since 1.0, 2022-07-04 16:01:26
 */
public class AlipayCommerceSportsUsertaskCompletedSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6265549144671818936L;

	/**
	 * 非必填,用户在支付宝APP或服务商小程序选择的城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 用户完成任务的北京时间。
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("completed_time")
	private String completedTime;

	/**
	 * 服务商自己的业务号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务ID，由支付宝前期分配给服务商
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCompletedTime() {
		return this.completedTime;
	}
	public void setCompletedTime(String completedTime) {
		this.completedTime = completedTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
