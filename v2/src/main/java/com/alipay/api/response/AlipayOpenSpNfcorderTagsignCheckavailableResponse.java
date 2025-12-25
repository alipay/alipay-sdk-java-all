package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nfcorder.tagsign.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 16:39:09
 */
public class AlipayOpenSpNfcorderTagsignCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 6181246449829738767L;

	/** 
	 * 唯一签名校验结果，true: uniqueId可用，正常碰请求；false: 签名已经使用或已经过期，非法请求
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
