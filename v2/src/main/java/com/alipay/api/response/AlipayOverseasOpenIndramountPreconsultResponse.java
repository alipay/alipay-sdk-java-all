package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVAmountInfoDTO;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indramount.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:21:57
 */
public class AlipayOverseasOpenIndramountPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6532389758183526865L;

	/** 
	 * 金额信息
	 */
	@ApiField("amount_info")
	private IndrISVAmountInfoDTO amountInfo;

	/** 
	 * 金额试算结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setAmountInfo(IndrISVAmountInfoDTO amountInfo) {
		this.amountInfo = amountInfo;
	}
	public IndrISVAmountInfoDTO getAmountInfo( ) {
		return this.amountInfo;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
