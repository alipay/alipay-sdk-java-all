package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.background.interface.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:20
 */
public class AlipaySecurityRiskBackgroundInterfaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1597381147445283626L;

	/** 
	 * 背景详细信息：查询到的人物背景信息，包括学历信息、是否涉及诉讼、商业冲突等。
	 */
	@ApiField("detail_info")
	private String detailInfo;

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}
	public String getDetailInfo( ) {
		return this.detailInfo;
	}

}
