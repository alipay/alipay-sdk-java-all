package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MallPayGroupApplyRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.mall.applyrule.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:37:49
 */
public class AlipayCommerceMallApplyruleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3862393536125938914L;

	/** 
	 * 规则列表
	 */
	@ApiListField("apply_rules")
	@ApiField("mall_pay_group_apply_rule")
	private List<MallPayGroupApplyRule> applyRules;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页条数 和入参保持一致
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总规则数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setApplyRules(List<MallPayGroupApplyRule> applyRules) {
		this.applyRules = applyRules;
	}
	public List<MallPayGroupApplyRule> getApplyRules( ) {
		return this.applyRules;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
