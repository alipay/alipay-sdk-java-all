package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorContractDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.contractlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 15:07:40
 */
public class AlipayPcreditLoanHonorContractlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6315999936524118455L;

	/** 
	 * 协议曝光咨询ID
	 */
	@ApiField("agreement_consult_serial_no")
	private String agreementConsultSerialNo;

	/** 
	 * 合同列表
	 */
	@ApiListField("records")
	@ApiField("honor_contract_d_t_o")
	private List<HonorContractDTO> records;

	/** 
	 * 协议记录总数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setAgreementConsultSerialNo(String agreementConsultSerialNo) {
		this.agreementConsultSerialNo = agreementConsultSerialNo;
	}
	public String getAgreementConsultSerialNo( ) {
		return this.agreementConsultSerialNo;
	}

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
