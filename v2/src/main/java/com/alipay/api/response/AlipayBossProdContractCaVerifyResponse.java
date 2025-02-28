package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PdfCertificateResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.ca.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-14 18:17:07
 */
public class AlipayBossProdContractCaVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476325862334722592L;

	/** 
	 * 结果
	 */
	@ApiListField("result_data")
	@ApiField("pdf_certificate_result")
	private List<PdfCertificateResult> resultData;

	/** 
	 * traceId编码
	 */
	@ApiField("result_trace_id")
	private String resultTraceId;

	public void setResultData(List<PdfCertificateResult> resultData) {
		this.resultData = resultData;
	}
	public List<PdfCertificateResult> getResultData( ) {
		return this.resultData;
	}

	public void setResultTraceId(String resultTraceId) {
		this.resultTraceId = resultTraceId;
	}
	public String getResultTraceId( ) {
		return this.resultTraceId;
	}

}
