package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVAmountInfoDTO;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.amount.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:03:55
 */
public class AlipayOverseasOpenAmountPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3478342782929633868L;

	/** 
	 * 缴费金额信息
	 */
	@ApiField("amount_info")
	private TuitionISVAmountInfoDTO amountInfo;

	/** 
	 * 外部参考号
	 */
	@ApiField("reference_id")
	private String referenceId;

	/** 
	 * 金额试算结果
	 */
	@ApiField("result")
	private TuitionISVResult result;

	public void setAmountInfo(TuitionISVAmountInfoDTO amountInfo) {
		this.amountInfo = amountInfo;
	}
	public TuitionISVAmountInfoDTO getAmountInfo( ) {
		return this.amountInfo;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getReferenceId( ) {
		return this.referenceId;
	}

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

}
