package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.ocr.submit response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-12 11:14:11
 */
public class AnttechBlockchainDefinDataserviceOcrSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7324276735499526273L;

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
