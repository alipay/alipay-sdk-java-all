package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RepayDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repay.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:20:48
 */
public class AlipayPcreditLoanRepayDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5877983666278864991L;

	/** 
	 * 还款流水明细列表
	 */
	@ApiListField("repay_detail_list")
	@ApiField("repay_detail_v_o")
	private List<RepayDetailVO> repayDetailList;

	/** 
	 * 结果总数
	 */
	@ApiField("total")
	private Long total;

	public void setRepayDetailList(List<RepayDetailVO> repayDetailList) {
		this.repayDetailList = repayDetailList;
	}
	public List<RepayDetailVO> getRepayDetailList( ) {
		return this.repayDetailList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
