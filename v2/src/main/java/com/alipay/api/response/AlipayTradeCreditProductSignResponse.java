package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ThirdErrorContext;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.product.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:57
 */
public class AlipayTradeCreditProductSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2663372526686194511L;

	/** 
	 * 合约批次号；成功场景下才会返回
	 */
	@ApiField("contract_batch_no")
	private String contractBatchNo;

	/** 
	 * 合约号；成功场景下才会返回
	 */
	@ApiField("contract_no_list")
	private String contractNoList;

	/** 
	 * 第三方错误上下文；只有失败情况下才会返回
	 */
	@ApiField("third_error_context")
	private ThirdErrorContext thirdErrorContext;

	public void setContractBatchNo(String contractBatchNo) {
		this.contractBatchNo = contractBatchNo;
	}
	public String getContractBatchNo( ) {
		return this.contractBatchNo;
	}

	public void setContractNoList(String contractNoList) {
		this.contractNoList = contractNoList;
	}
	public String getContractNoList( ) {
		return this.contractNoList;
	}

	public void setThirdErrorContext(ThirdErrorContext thirdErrorContext) {
		this.thirdErrorContext = thirdErrorContext;
	}
	public ThirdErrorContext getThirdErrorContext( ) {
		return this.thirdErrorContext;
	}

}
