package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.bizfee.aftech.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:20
 */
public class AlipayOpenOperationBizfeeAftechConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6526229545399425173L;

	/** 
	 * 收费项计价结果列表（List<POJO>的JSON对象）
POJO中包含feeItemCode收费项编码、eventCode事件码、price计价结果金额、highPrecisionPrice高精度计价结果金额、currency币种、settleType结算类型。
	 */
	@ApiField("consult_details")
	private String consultDetails;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setConsultDetails(String consultDetails) {
		this.consultDetails = consultDetails;
	}
	public String getConsultDetails( ) {
		return this.consultDetails;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
