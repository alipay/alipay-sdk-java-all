package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReplyRecord;
import com.alipay.api.domain.AuditEvidenceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.violation.violationdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-17 15:17:02
 */
public class AlipayOpenViolationViolationdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5514357269561741739L;

	/** 
	 * 申诉截止日期。
即商户可进行申诉的截止日期，若超过该时间未申诉或申诉不通过，平台不提供申诉机会，维持原处罚结果；若该时间内完成申诉且申诉通过，平台将撤销对商户的处罚
	 */
	@ApiField("appeal_dead_line")
	private String appealDeadLine;

	/** 
	 * 商家申诉记录
	 */
	@ApiListField("appeal_reply_records")
	@ApiField("reply_record")
	private List<ReplyRecord> appealReplyRecords;

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
	@ApiListField("punish_action")
	@ApiField("string")
	private List<String> punishAction;

	/** 
	 * 截止整改时间。即商户可进行整改的截止日期，若超过该时间未整改或整改不通过，平台将对商户进行处罚，若该时间内完成整改且整改通过，平台对商户不处罚
	 */
	@ApiField("rectify_dead_line")
	private String rectifyDeadLine;

	/** 
	 * 商家整改记录
	 */
	@ApiListField("rectify_reply_records")
	@ApiField("reply_record")
	private List<ReplyRecord> rectifyReplyRecords;

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
	 * 剩余申诉次数。
即在申诉截止日期内，平台允许商家申诉的次数，当商户提交申诉但申诉未通过时，剩余申诉次数减1，当整改次数为0，不管是否在整改截止日期内，平台将对商户进行处罚
	 */
	@ApiField("surplus_appeal_cnt")
	private String surplusAppealCnt;

	/** 
	 * 剩余整改次数。即在整改截止日期内，平台允许商家整改的次数，当商户提交整改但整改未通过时，剩余整改次数减1，当整改次数为0，不管是否在整改截止日期内，平台将对商户进行处罚
	 */
	@ApiField("surplus_rectify_cnt")
	private String surplusRectifyCnt;

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
	 * 平台判定商家违规凭证
	 */
	@ApiListField("violation_evidence")
	@ApiField("audit_evidence_info")
	private List<AuditEvidenceInfo> violationEvidence;

	/** 
	 * 违规原因
	 */
	@ApiField("violation_reason")
	private String violationReason;

	/** 
	 * 支付宝侧生成的违规记录唯一标识
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

	public void setAppealDeadLine(String appealDeadLine) {
		this.appealDeadLine = appealDeadLine;
	}
	public String getAppealDeadLine( ) {
		return this.appealDeadLine;
	}

	public void setAppealReplyRecords(List<ReplyRecord> appealReplyRecords) {
		this.appealReplyRecords = appealReplyRecords;
	}
	public List<ReplyRecord> getAppealReplyRecords( ) {
		return this.appealReplyRecords;
	}

	public void setCanAppeal(Boolean canAppeal) {
		this.canAppeal = canAppeal;
	}
	public Boolean getCanAppeal( ) {
		return this.canAppeal;
	}

	public void setCanRectify(Boolean canRectify) {
		this.canRectify = canRectify;
	}
	public Boolean getCanRectify( ) {
		return this.canRectify;
	}

	public void setPunishAction(List<String> punishAction) {
		this.punishAction = punishAction;
	}
	public List<String> getPunishAction( ) {
		return this.punishAction;
	}

	public void setRectifyDeadLine(String rectifyDeadLine) {
		this.rectifyDeadLine = rectifyDeadLine;
	}
	public String getRectifyDeadLine( ) {
		return this.rectifyDeadLine;
	}

	public void setRectifyReplyRecords(List<ReplyRecord> rectifyReplyRecords) {
		this.rectifyReplyRecords = rectifyReplyRecords;
	}
	public List<ReplyRecord> getRectifyReplyRecords( ) {
		return this.rectifyReplyRecords;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSurplusAppealCnt(String surplusAppealCnt) {
		this.surplusAppealCnt = surplusAppealCnt;
	}
	public String getSurplusAppealCnt( ) {
		return this.surplusAppealCnt;
	}

	public void setSurplusRectifyCnt(String surplusRectifyCnt) {
		this.surplusRectifyCnt = surplusRectifyCnt;
	}
	public String getSurplusRectifyCnt( ) {
		return this.surplusRectifyCnt;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getTargetId( ) {
		return this.targetId;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	public String getTargetName( ) {
		return this.targetName;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
	public String getTargetType( ) {
		return this.targetType;
	}

	public void setViolationEvidence(List<AuditEvidenceInfo> violationEvidence) {
		this.violationEvidence = violationEvidence;
	}
	public List<AuditEvidenceInfo> getViolationEvidence( ) {
		return this.violationEvidence;
	}

	public void setViolationReason(String violationReason) {
		this.violationReason = violationReason;
	}
	public String getViolationReason( ) {
		return this.violationReason;
	}

	public void setViolationRecordId(String violationRecordId) {
		this.violationRecordId = violationRecordId;
	}
	public String getViolationRecordId( ) {
		return this.violationRecordId;
	}

	public void setViolationTime(String violationTime) {
		this.violationTime = violationTime;
	}
	public String getViolationTime( ) {
		return this.violationTime;
	}

	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}
	public String getViolationType( ) {
		return this.violationType;
	}

}
