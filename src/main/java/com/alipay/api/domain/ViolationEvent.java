package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违规记录
 *
 * @author auto create
 * @since 1.0, 2022-06-10 17:42:56
 */
public class ViolationEvent extends AlipayObject {

	private static final long serialVersionUID = 1842522858716367952L;

	/**
	 * 商家是否可以申诉
	 */
	@ApiField("can_appeal")
	private Boolean canAppeal;

	/**
	 * 商家是否可以整改
	 */
	@ApiField("can_rectify")
	private Boolean canRectify;

	/**
	 * 处罚动作及有效期
	 */
	@ApiField("punish_action")
	private String punishAction;

	/**
	 * 违规工单状态枚举：
PUNISH_DONE：处罚生效中
PUNISH_APPEAL_REVOKED：处罚已撤销
PUNISH_INVALID_REVOKED：处罚已到期
WAITING_RECTIFY：待整改 
RECTIFY_AUDITOR_PROCESSING：整改审核中
RECTIFY_REJECTED：整改不通过
RECTIFY_PASSED：整改通过
RECTIFY_TIMEOUT ：整改已超时
	 */
	@ApiField("status")
	private String status;

	/**
	 * 违规对象ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 违规对象名称
	 */
	@ApiField("target_name")
	private String targetName;

	/**
	 * 违规对象类型
小程序ID:APPID 
生活号ID:PUBLICID
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 违规记录ID
	 */
	@ApiField("violation_record_id")
	private String violationRecordId;

	/**
	 * 违规时间
	 */
	@ApiField("violation_time")
	private String violationTime;

	/**
	 * 即平台依据平台规范/规则，判定商户的违规类型
	 */
	@ApiField("violation_type")
	private String violationType;

	public Boolean getCanAppeal() {
		return this.canAppeal;
	}
	public void setCanAppeal(Boolean canAppeal) {
		this.canAppeal = canAppeal;
	}

	public Boolean getCanRectify() {
		return this.canRectify;
	}
	public void setCanRectify(Boolean canRectify) {
		this.canRectify = canRectify;
	}

	public String getPunishAction() {
		return this.punishAction;
	}
	public void setPunishAction(String punishAction) {
		this.punishAction = punishAction;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetName() {
		return this.targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getViolationRecordId() {
		return this.violationRecordId;
	}
	public void setViolationRecordId(String violationRecordId) {
		this.violationRecordId = violationRecordId;
	}

	public String getViolationTime() {
		return this.violationTime;
	}
	public void setViolationTime(String violationTime) {
		this.violationTime = violationTime;
	}

	public String getViolationType() {
		return this.violationType;
	}
	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}

}
