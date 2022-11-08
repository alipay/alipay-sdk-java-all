package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstancePreviewStep;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.instance.preview response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-18 10:21:41
 */
public class AlipayBossBaseProcessInstancePreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 2745551631456677412L;

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
