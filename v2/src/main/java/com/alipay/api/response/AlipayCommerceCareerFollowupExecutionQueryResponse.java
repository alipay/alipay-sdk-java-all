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
 * @since 1.0, 2026-10-15 15:42:57
 */
public class AlipayCommerceCareerFollowupExecutionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2123521588216216777L;

	/** 
	 * 终态描述：status=ENDED 时必填(恒有值,回告仅随终态推送)。取值 ENDED=自然完成 / TIMEOUT=超时 / CANCELLED=客户取消(预留,当前抑制不推送) / REJECTED=执行域拒收。与 status/executionNo 正交。
	 */
	@ApiField("ended_type")
	private String endedType;

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
	 * 原样回传三方业务单号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 跟进任务状态
	 */
	@ApiField("status")
	private String status;

	public void setEndedType(String endedType) {
		this.endedType = endedType;
	}
	public String getEndedType( ) {
		return this.endedType;
	}

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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
