package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-15 15:42:57
 */
public class FollowupExecution extends AlipayObject {

	private static final long serialVersionUID = 7366654293521915344L;

	/**
	 * 本次确认的计费分钟数；处理中返回 null，未接通返回 0。
	 */
	@ApiField("billable_minutes")
	private Long billableMinutes;

	/**
	 * 本次外呼执行结果标识，用于记录通话链路的执行事实，不表示接口调用成功或失败；接口处理异常统一通过平台标准错误码表达，具体取值以平台返回为准。
	 */
	@ApiField("call_status")
	private String callStatus;

	/**
	 * 实际外呼明细 ID，仅包含英文字母与数字，不超过 64 位。
	 */
	@ApiField("execution_no")
	private String executionNo;

	/**
	 * 本次拨打发起时间，采用 ISO 8601 格式。
	 */
	@ApiField("occurred_at")
	private String occurredAt;

	/**
	 * ai电话语音转文本内容
	 */
	@ApiField("record_text")
	private String recordText;

	/**
	 * 录音下载地址；已接通且媒体就绪时返回短时效签名地址，否则返回 null。地址过期后可重新调用本接口获取。
	 */
	@ApiField("record_url")
	private String recordUrl;

	/**
	 * 本次通话的结果结构；没有结果时返回空对象。返回值字段以业务线下对齐为准
示例值: {
  "summary": "外呼未接通（NO_ANSWER），按重拨策略安排下次呼叫。",
  "resultValue": "联系不上",
  "connectStatus": "NO_ANSWER",
  "endReason": "CALL_RETRY_SCHEDULED",
  "status": "SCHEDULED"
}
	 */
	@ApiField("result_params")
	private FollowupExecutionResultParams resultParams;

	public Long getBillableMinutes() {
		return this.billableMinutes;
	}
	public void setBillableMinutes(Long billableMinutes) {
		this.billableMinutes = billableMinutes;
	}

	public String getCallStatus() {
		return this.callStatus;
	}
	public void setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}

	public String getExecutionNo() {
		return this.executionNo;
	}
	public void setExecutionNo(String executionNo) {
		this.executionNo = executionNo;
	}

	public String getOccurredAt() {
		return this.occurredAt;
	}
	public void setOccurredAt(String occurredAt) {
		this.occurredAt = occurredAt;
	}

	public String getRecordText() {
		return this.recordText;
	}
	public void setRecordText(String recordText) {
		this.recordText = recordText;
	}

	public String getRecordUrl() {
		return this.recordUrl;
	}
	public void setRecordUrl(String recordUrl) {
		this.recordUrl = recordUrl;
	}

	public FollowupExecutionResultParams getResultParams() {
		return this.resultParams;
	}
	public void setResultParams(FollowupExecutionResultParams resultParams) {
		this.resultParams = resultParams;
	}

}
