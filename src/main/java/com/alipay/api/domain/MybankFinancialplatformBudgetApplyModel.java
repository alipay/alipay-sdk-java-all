package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 网商批量预算申请
 *
 * @author auto create
 * @since 1.0, 2022-11-15 17:59:17
 */
public class MybankFinancialplatformBudgetApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5878634766642476219L;

	/**
	 * 申请参数列表
	 */
	@ApiListField("apply_biz_budget_request_list")
	@ApiField("bkdfmac_apply_biz_budget_request")
	private List<BkdfmacApplyBizBudgetRequest> applyBizBudgetRequestList;

	/**
	 * 幂等字段
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	public List<BkdfmacApplyBizBudgetRequest> getApplyBizBudgetRequestList() {
		return this.applyBizBudgetRequestList;
	}
	public void setApplyBizBudgetRequestList(List<BkdfmacApplyBizBudgetRequest> applyBizBudgetRequestList) {
		this.applyBizBudgetRequestList = applyBizBudgetRequestList;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

}
