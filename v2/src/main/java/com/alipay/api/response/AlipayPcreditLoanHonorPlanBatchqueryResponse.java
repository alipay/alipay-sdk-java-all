package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorRepayPlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.plan.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 16:17:40
 */
public class AlipayPcreditLoanHonorPlanBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2776155638415561191L;

	/** 
	 * 记录列表。result_code=0时必传
	 */
	@ApiListField("records")
	@ApiField("honor_repay_plan_d_t_o")
	private List<HonorRepayPlanDTO> records;

	/** 
	 * 记录总条数。result_code=0时必传
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRecords(List<HonorRepayPlanDTO> records) {
		this.records = records;
	}
	public List<HonorRepayPlanDTO> getRecords( ) {
		return this.records;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
