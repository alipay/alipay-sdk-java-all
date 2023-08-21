package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单业务中，商户的前置费用信息
 *
 * @author auto create
 * @since 1.0, 2022-12-29 14:05:39
 */
public class PreAmountInfoResult extends AlipayObject {

	private static final long serialVersionUID = 8175789768431146838L;

	/**
	 * 前置费用明细列表
	 */
	@ApiListField("pre_amount_list")
	@ApiField("pre_amount_clause_result")
	private List<PreAmountClauseResult> preAmountList;

	/**
	 * 金额
	 */
	@ApiField("total_pre_mount")
	private String totalPreMount;

	public List<PreAmountClauseResult> getPreAmountList() {
		return this.preAmountList;
	}
	public void setPreAmountList(List<PreAmountClauseResult> preAmountList) {
		this.preAmountList = preAmountList;
	}

	public String getTotalPreMount() {
		return this.totalPreMount;
	}
	public void setTotalPreMount(String totalPreMount) {
		this.totalPreMount = totalPreMount;
	}

}
