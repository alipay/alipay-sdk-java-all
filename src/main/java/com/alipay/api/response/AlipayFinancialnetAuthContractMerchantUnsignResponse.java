package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.contract.merchant.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-11 14:51:26
 */
public class AlipayFinancialnetAuthContractMerchantUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3165438676634928426L;

	/** 
	 * 合约批次号列表
	 */
	@ApiListField("contract_batch_no_list")
	@ApiField("string")
	private List<String> contractBatchNoList;

	/** 
	 * 合约号列表
	 */
	@ApiListField("contract_no_list")
	@ApiField("string")
	private List<String> contractNoList;

	public void setContractBatchNoList(List<String> contractBatchNoList) {
		this.contractBatchNoList = contractBatchNoList;
	}
	public List<String> getContractBatchNoList( ) {
		return this.contractBatchNoList;
	}

	public void setContractNoList(List<String> contractNoList) {
		this.contractNoList = contractNoList;
	}
	public List<String> getContractNoList( ) {
		return this.contractNoList;
	}

}
