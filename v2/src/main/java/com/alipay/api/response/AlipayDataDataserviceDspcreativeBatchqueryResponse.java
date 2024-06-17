package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DspCreativeAuditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.dspcreative.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-14 14:22:06
 */
public class AlipayDataDataserviceDspcreativeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4865219596239248788L;

	/** 
	 * 创意审核结果列表
	 */
	@ApiListField("creative_audit_result")
	@ApiField("dsp_creative_audit_result")
	private List<DspCreativeAuditResult> creativeAuditResult;

	public void setCreativeAuditResult(List<DspCreativeAuditResult> creativeAuditResult) {
		this.creativeAuditResult = creativeAuditResult;
	}
	public List<DspCreativeAuditResult> getCreativeAuditResult( ) {
		return this.creativeAuditResult;
	}

}
