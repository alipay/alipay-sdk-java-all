package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建多方电子CA签约任务
 *
 * @author auto create
 * @since 1.0, 2023-05-31 13:12:46
 */
public class AlipayBossProdAntCasignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3114484759913288313L;

	/**
	 * 签署任务信息
	 */
	@ApiListField("ant_sign_task_request_list")
	@ApiField("ant_sign_task_request")
	private List<AntSignTaskRequest> antSignTaskRequestList;

	/**
	 * 应用来源
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型 CONTRACT,FILE,OTHER
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务线
	 */
	@ApiField("business_line_code")
	private String businessLineCode;

	/**
	 * 回调地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 签署过期日期间隔，从发起签署开始算起(传递毫秒数，如3天过期：3*24*60*60*1000L)
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 业务场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 签署任务类型 SINGLE_SEAL_CA,MICKLE_SEAL_CA,DIGITAL_SEAL
	 */
	@ApiField("sign_task_type")
	private String signTaskType;

	/**
	 * 版本
	 */
	@ApiField("sign_version")
	private String signVersion;

	/**
	 * 租户信息
	 */
	@ApiField("tenant")
	private String tenant;

	public List<AntSignTaskRequest> getAntSignTaskRequestList() {
		return this.antSignTaskRequestList;
	}
	public void setAntSignTaskRequestList(List<AntSignTaskRequest> antSignTaskRequestList) {
		this.antSignTaskRequestList = antSignTaskRequestList;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBusinessLineCode() {
		return this.businessLineCode;
	}
	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSignTaskType() {
		return this.signTaskType;
	}
	public void setSignTaskType(String signTaskType) {
		this.signTaskType = signTaskType;
	}

	public String getSignVersion() {
		return this.signVersion;
	}
	public void setSignVersion(String signVersion) {
		this.signVersion = signVersion;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
