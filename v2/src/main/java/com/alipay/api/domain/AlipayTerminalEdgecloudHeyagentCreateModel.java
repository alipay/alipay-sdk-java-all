package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建并启动云渲染服务
 *
 * @author auto create
 * @since 1.0, 2024-10-28 14:52:52
 */
public class AlipayTerminalEdgecloudHeyagentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8439534221882518982L;

	/**
	 * 是否是acr
	 */
	@ApiField("acr")
	private String acr;

	/**
	 * acr业务
	 */
	@ApiField("acr_sub_biz_type")
	private String acrSubBizType;

	/**
	 * 云机器相关
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序ID
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 云机器相关
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 默认不填为在线模式，离线模式必传
	 */
	@ApiField("boot_type")
	private String bootType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 任务超时时间“1200”表示1200秒。在taskInfo中。与consultParams平级
	 */
	@ApiField("task_time_out_thres")
	private String taskTimeOutThres;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * YYzVEX8a/uYDAEZLjpYWwMro 用户设备的唯一标识
	 */
	@ApiField("utdid")
	private String utdid;

	public String getAcr() {
		return this.acr;
	}
	public void setAcr(String acr) {
		this.acr = acr;
	}

	public String getAcrSubBizType() {
		return this.acrSubBizType;
	}
	public void setAcrSubBizType(String acrSubBizType) {
		this.acrSubBizType = acrSubBizType;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBootType() {
		return this.bootType;
	}
	public void setBootType(String bootType) {
		this.bootType = bootType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaskTimeOutThres() {
		return this.taskTimeOutThres;
	}
	public void setTaskTimeOutThres(String taskTimeOutThres) {
		this.taskTimeOutThres = taskTimeOutThres;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUtdid() {
		return this.utdid;
	}
	public void setUtdid(String utdid) {
		this.utdid = utdid;
	}

}
