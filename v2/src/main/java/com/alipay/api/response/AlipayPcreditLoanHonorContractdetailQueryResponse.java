package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorContractDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.contractdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 15:22:39
 */
public class AlipayPcreditLoanHonorContractdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8518815937142888811L;

	/** 
	 * 合同列表
	 */
	@ApiListField("records")
	@ApiField("honor_contract_d_t_o")
	private List<HonorContractDTO> records;

	/** 
	 * 记录总条数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRecords(List<HonorContractDTO> records) {
		this.records = records;
	}
	public List<HonorContractDTO> getRecords( ) {
		return this.records;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
