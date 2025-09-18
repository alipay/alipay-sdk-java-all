package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorRepayRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.repay.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 16:12:38
 */
public class AlipayPcreditLoanHonorRepayBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7384739466327724537L;

	/** 
	 * 还款记录列表。result_code=0时必填
	 */
	@ApiListField("records")
	@ApiField("honor_repay_record_d_t_o")
	private List<HonorRepayRecordDTO> records;

	/** 
	 * 记录总条数。result_code=0时必填
	 */
	@ApiField("total_num")
	private String totalNum;

	public void setRecords(List<HonorRepayRecordDTO> records) {
		this.records = records;
	}
	public List<HonorRepayRecordDTO> getRecords( ) {
		return this.records;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getTotalNum( ) {
		return this.totalNum;
	}

}
