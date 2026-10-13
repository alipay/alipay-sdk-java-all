package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 执行流水查询
 *
 * @author auto create
 * @since 1.0, 2026-10-09 16:27:08
 */
public class AlipayCommerceCareerFollowupExecutionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5449423882712649958L;

	/**
	 * 实际外呼明细 ID。传入时仅查询该任务下的这一条通话明细；不传时返回该任务的全部已结束明细。
	 */
	@ApiField("execution_no")
	private String executionNo;

	/**
	 * 客户业务单号，任务定位键。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getExecutionNo() {
		return this.executionNo;
	}
	public void setExecutionNo(String executionNo) {
		this.executionNo = executionNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
