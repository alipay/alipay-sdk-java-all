package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BaseLoanApplyVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.loan.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:21:53
 */
public class AlipayPcreditLoanLoanInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5114529155965933845L;

	/** 
	 * 贷款记录列表
	 */
	@ApiListField("base_apply_list")
	@ApiField("base_loan_apply_v_o")
	private List<BaseLoanApplyVO> baseApplyList;

	/** 
	 * 结果总数
	 */
	@ApiField("total")
	private Long total;

	public void setBaseApplyList(List<BaseLoanApplyVO> baseApplyList) {
		this.baseApplyList = baseApplyList;
	}
	public List<BaseLoanApplyVO> getBaseApplyList( ) {
		return this.baseApplyList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
