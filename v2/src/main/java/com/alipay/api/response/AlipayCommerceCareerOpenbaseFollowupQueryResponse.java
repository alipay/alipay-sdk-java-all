package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.career.openbase.followup.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 10:17:57
 */
public class AlipayCommerceCareerOpenbaseFollowupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8414986212114948933L;

	/** 
	 * 终态分类：status=ENDED 时必填(恒有值,回告仅随终态推送)。取值 ENDED=自然完成 / TIMEOUT=超时 / CANCELLED=客户取消(预留,当前抑制不推送) / REJECTED=执行域拒收。与
  status/executionNo 正交。
	 */
	@ApiField("ended_type")
	private String endedType;

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

	/** 
	 * 任务实际关联的跟进方案标识。
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 跟进任务的状态
	 */
	@ApiField("status")
	private String status;

	public void setEndedType(String endedType) {
		this.endedType = endedType;
	}
	public String getEndedType( ) {
		return this.endedType;
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

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
