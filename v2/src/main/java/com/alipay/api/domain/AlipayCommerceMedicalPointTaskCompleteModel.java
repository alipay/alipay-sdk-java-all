package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能量任务完成
 *
 * @author auto create
 * @since 1.0, 2025-09-26 10:38:57
 */
public class AlipayCommerceMedicalPointTaskCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 2851289942933993632L;

	/**
	 * 业务时间，后续各种校验都会以业务时间为准(String类型, 格式为yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 渠道信息chInfo
	 */
	@ApiField("kz_info")
	private String kzInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务号，作幂等字段使用，需使用唯一业务号进行填充
	 */
	@ApiField("out_idem_id")
	private String outIdemId;

	/**
	 * 来源，TIANMAOXIAOYUAN（天猫校园）
	 */
	@ApiField("source")
	private String source;

	/**
	 * 任务完成时的任务ID，用于后续跟事件消息事件码做映射匹配，保证全局唯一。
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getKzInfo() {
		return this.kzInfo;
	}
	public void setKzInfo(String kzInfo) {
		this.kzInfo = kzInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutIdemId() {
		return this.outIdemId;
	}
	public void setOutIdemId(String outIdemId) {
		this.outIdemId = outIdemId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
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
