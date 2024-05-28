package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FinanceReceivableResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.asset.issue.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:25:00
 */
public class AnttechBlockchainFinanceAssetIssueQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5399496678225814114L;

	/** 
	 * status=FAILED时，描述发行失败原因的错误码
	 */
	@ApiField("failed_code")
	private String failedCode;

	/** 
	 * status=FAILED时，描述发行失败原因的详细解释
	 */
	@ApiField("failed_desc")
	private String failedDesc;

	/** 
	 * 当资产类型为RECEIVABLE时必选，应收账款发行结果信息
	 */
	@ApiField("receivable_result_info")
	private FinanceReceivableResultInfo receivableResultInfo;

	/** 
	 * resultInfo为SUCCESS时必选。资产发行状态，PROCESSING:进行中，SUCCESS:成功，FAILED:失败
	 */
	@ApiField("status")
	private String status;

	public void setFailedCode(String failedCode) {
		this.failedCode = failedCode;
	}
	public String getFailedCode( ) {
		return this.failedCode;
	}

	public void setFailedDesc(String failedDesc) {
		this.failedDesc = failedDesc;
	}
	public String getFailedDesc( ) {
		return this.failedDesc;
	}

	public void setReceivableResultInfo(FinanceReceivableResultInfo receivableResultInfo) {
		this.receivableResultInfo = receivableResultInfo;
	}
	public FinanceReceivableResultInfo getReceivableResultInfo( ) {
		return this.receivableResultInfo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
