package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourceAuditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.anchor.resource.audit response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 14:32:41
 */
public class AlipayContentLiveAnchorResourceAuditResponse extends AlipayResponse {

	private static final long serialVersionUID = 8642822758319151979L;

	/** 
	 * 用于全链路排查问题的追踪标识
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * null
	 */
	@ApiListField("reject_item_list")
	@ApiField("resource_audit_result")
	private List<ResourceAuditResult> rejectItemList;

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setRejectItemList(List<ResourceAuditResult> rejectItemList) {
		this.rejectItemList = rejectItemList;
	}
	public List<ResourceAuditResult> getRejectItemList( ) {
		return this.rejectItemList;
	}

}
