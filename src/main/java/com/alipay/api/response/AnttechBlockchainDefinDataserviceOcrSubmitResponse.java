package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.ocr.submit response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-11 19:51:26
 */
public class AnttechBlockchainDefinDataserviceOcrSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1786298192755434693L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private BizResult bizResult;

	public void setBizResult(BizResult bizResult) {
		this.bizResult = bizResult;
	}
	public BizResult getBizResult( ) {
		return this.bizResult;
	}

}
