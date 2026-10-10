package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FollowupExecution;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.career.followup.execution.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 16:27:08
 */
public class AlipayCommerceCareerFollowupExecutionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5566349145541773562L;

	/** 
	 * null
	 */
	@ApiListField("executions")
	@ApiField("followup_execution")
	private List<FollowupExecution> executions;

	/** 
	 * 平台任务号（18 位纯数字，按字符串处理，勿解析内部结构）；用于回告与计费对账。查询、取消以 outBizNo 定位。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 原样回传客户业务单号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setExecutions(List<FollowupExecution> executions) {
		this.executions = executions;
	}
	public List<FollowupExecution> getExecutions( ) {
		return this.executions;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
