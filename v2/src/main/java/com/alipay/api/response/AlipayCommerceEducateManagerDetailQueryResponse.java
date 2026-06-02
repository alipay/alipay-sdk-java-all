package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduManagerInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.manager.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-25 20:52:44
 */
public class AlipayCommerceEducateManagerDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4142632465511556367L;

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
