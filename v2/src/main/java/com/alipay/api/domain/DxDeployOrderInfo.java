package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据决策服务部署单批量查询结果
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:55:02
 */
public class DxDeployOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 5122541756362574794L;

	/**
	 * 决策服务自定义名字空间字段
	 */
	@ApiField("biz_ns")
	private String bizNs;

	/**
	 * 部署事件类型,枚举值如下:
ONLINE,OFFLINE,UPDATE,VERIFY
	 */
	@ApiField("deploy_event_type")
	private String deployEventType;

	/**
	 * 部署对象类型，共有4个类型:DECISION_RULE(决策规则),DECISION_ROUTER(决策分流规则),DECISION_ROUTER_PERCENT(决策策略分流百分比),DATA_SOURCE(数据源)
	 */
	@ApiField("deploy_object_type")
	private String deployObjectType;

	/**
	 * 部署单内容
	 */
	@ApiField("deploy_payload")
	private String deployPayload;

	/**
	 * 部署单业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 部署的分组名
	 */
	@ApiField("group")
	private String group;

	/**
	 * 重试的记录id
	 */
	@ApiField("pre_record_id")
	private String preRecordId;

	/**
	 * 记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 是否为重试部署单
	 */
	@ApiField("retry")
	private Boolean retry;

	public String getBizNs() {
		return this.bizNs;
	}
	public void setBizNs(String bizNs) {
		this.bizNs = bizNs;
	}

	public String getDeployEventType() {
		return this.deployEventType;
	}
	public void setDeployEventType(String deployEventType) {
		this.deployEventType = deployEventType;
	}

	public String getDeployObjectType() {
		return this.deployObjectType;
	}
	public void setDeployObjectType(String deployObjectType) {
		this.deployObjectType = deployObjectType;
	}

	public String getDeployPayload() {
		return this.deployPayload;
	}
	public void setDeployPayload(String deployPayload) {
		this.deployPayload = deployPayload;
	}

	public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}
	public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public String getPreRecordId() {
		return this.preRecordId;
	}
	public void setPreRecordId(String preRecordId) {
		this.preRecordId = preRecordId;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public Boolean getRetry() {
		return this.retry;
	}
	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

}
