package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RightDetailUrlInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.right.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-08 15:22:54
 */
public class AlipayCommerceMedicalRightUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7358628238157375753L;

	/** 
	 * 服务详情链接信息
	 */
	@ApiField("right_detail_url_info")
	private RightDetailUrlInfo rightDetailUrlInfo;

	public void setRightDetailUrlInfo(RightDetailUrlInfo rightDetailUrlInfo) {
		this.rightDetailUrlInfo = rightDetailUrlInfo;
	}
	public RightDetailUrlInfo getRightDetailUrlInfo( ) {
		return this.rightDetailUrlInfo;
	}

}
