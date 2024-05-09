package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstancePreviewStep;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.instance.preview response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:12:49
 */
public class AlipayBossBaseProcessInstancePreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 5356495684788831253L;

	/** 
	 * 预演返回结果
	 */
	@ApiField("preview_step")
	private BPOpenApiInstancePreviewStep previewStep;

	public void setPreviewStep(BPOpenApiInstancePreviewStep previewStep) {
		this.previewStep = previewStep;
	}
	public BPOpenApiInstancePreviewStep getPreviewStep( ) {
		return this.previewStep;
	}

}
