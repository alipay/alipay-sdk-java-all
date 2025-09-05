package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消金批量预算申请
 *
 * @author auto create
 * @since 1.0, 2023-01-13 14:39:20
 */
public class MyxiaojinFinanceBudgetApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3271819282279622883L;

	/**
	 * 申请参数列表
	 */
	@ApiListField("apply_biz_budget_request_list")
	@ApiField("cfbudmac_apply_biz_budget_request")
	private List<CfbudmacApplyBizBudgetRequest> applyBizBudgetRequestList;

	/**
	 * 幂等字段
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	public List<CfbudmacApplyBizBudgetRequest> getApplyBizBudgetRequestList() {
		return this.applyBizBudgetRequestList;
	}
	public void setApplyBizBudgetRequestList(List<CfbudmacApplyBizBudgetRequest> applyBizBudgetRequestList) {
		this.applyBizBudgetRequestList = applyBizBudgetRequestList;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

}
