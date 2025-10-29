package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ats消金批量预算申请
 *
 * @author auto create
 * @since 1.0, 2023-04-11 09:43:05
 */
public class MyxiaojinFinanceAtsbudgetApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4631113691647646991L;

	/**
	 * 申请参数列表
	 */
	@ApiListField("apply_biz_budget_request_list")
	@ApiField("apply_biz_budget_request")
	private List<ApplyBizBudgetRequest> applyBizBudgetRequestList;

	/**
	 * 幂等字段
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	public List<ApplyBizBudgetRequest> getApplyBizBudgetRequestList() {
		return this.applyBizBudgetRequestList;
	}
	public void setApplyBizBudgetRequestList(List<ApplyBizBudgetRequest> applyBizBudgetRequestList) {
		this.applyBizBudgetRequestList = applyBizBudgetRequestList;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

}
