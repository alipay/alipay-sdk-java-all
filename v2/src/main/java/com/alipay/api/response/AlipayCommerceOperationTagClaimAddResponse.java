package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.tag.claim.add response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-12 15:04:04
 */
public class AlipayCommerceOperationTagClaimAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7199551316577782733L;

	/** 
	 * 实际添加的点餐线圈成功数量，如果为0表示无可添加的线圈
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
