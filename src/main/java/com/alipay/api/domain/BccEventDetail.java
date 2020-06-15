package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bc约定事件详情模型
 *
 * @author auto create
 * @since 1.0, 2020-03-05 19:31:45
 */
public class BccEventDetail extends AlipayObject {

	private static final long serialVersionUID = 4155925513825318583L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 事件结果标识:true/false
	 */
	@ApiField("complete_tag")
	private Boolean completeTag;

	/**
	 * 合约单号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 事件内容
	 */
	@ApiField("event_conent")
	private String eventConent;

	/**
	 * 事件发生日期，如打卡日期
	 */
	@ApiField("event_day")
	private String eventDay;

	/**
	 * 事件类型:用来记录事件类型，如钉钉打卡
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 记录系统创建时间
	 */
	@ApiField("gm_create")
	private String gmCreate;

	/**
	 * 应约主体id
	 */
	@ApiField("sign_principal_id")
	private String signPrincipalId;

	/**
	 * 芝麻roleId
	 */
	@ApiField("zm_role_id")
	private String zmRoleId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Boolean getCompleteTag() {
		return this.completeTag;
	}
	public void setCompleteTag(Boolean completeTag) {
		this.completeTag = completeTag;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getEventConent() {
		return this.eventConent;
	}
	public void setEventConent(String eventConent) {
		this.eventConent = eventConent;
	}

	public String getEventDay() {
		return this.eventDay;
	}
	public void setEventDay(String eventDay) {
		this.eventDay = eventDay;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getGmCreate() {
		return this.gmCreate;
	}
	public void setGmCreate(String gmCreate) {
		this.gmCreate = gmCreate;
	}

	public String getSignPrincipalId() {
		return this.signPrincipalId;
	}
	public void setSignPrincipalId(String signPrincipalId) {
		this.signPrincipalId = signPrincipalId;
	}

	public String getZmRoleId() {
		return this.zmRoleId;
	}
	public void setZmRoleId(String zmRoleId) {
		this.zmRoleId = zmRoleId;
	}

}
