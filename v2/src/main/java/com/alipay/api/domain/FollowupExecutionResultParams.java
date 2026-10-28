package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本次通话的结果结构；没有结果时返回空对象。返回值字段以业务线下对齐为准
示例值: {
  "summary": "外呼未接通（NO_ANSWER），按重拨策略安排下次呼叫。",
  "resultValue": "联系不上",
  "connectStatus": "NO_ANSWER",
  "endReason": "CALL_RETRY_SCHEDULED",
  "status": "SCHEDULED"
}
 *
 * @author auto create
 * @since 1.0, 2026-10-15 15:42:57
 */
public class FollowupExecutionResultParams extends AlipayObject {

	private static final long serialVersionUID = 5765717955958327572L;

	/**
	 * 具体见产品线下定义的字段 当前字段已废弃(线下实际字段产品线下提供)
	 */
	@ApiField("params_data")
	@Deprecated
	private String paramsData;

	public String getParamsData() {
		return this.paramsData;
	}
	public void setParamsData(String paramsData) {
		this.paramsData = paramsData;
	}

}
