package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.archive.ecg.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 16:22:49
 */
public class AlipayCommerceMedicalArchiveEcgSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5768684238616982854L;

	/** 
	 * 保存失败的报告数量
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 保存成功的报告数量
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
