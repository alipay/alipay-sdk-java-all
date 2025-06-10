package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduManagerInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.manager.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:53
 */
public class AlipayCommerceEducateManagerDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7522442146865538455L;

	/** 
	 * 管理员信息
	 */
	@ApiField("manager_info")
	private EduManagerInfo managerInfo;

	public void setManagerInfo(EduManagerInfo managerInfo) {
		this.managerInfo = managerInfo;
	}
	public EduManagerInfo getManagerInfo( ) {
		return this.managerInfo;
	}

}
