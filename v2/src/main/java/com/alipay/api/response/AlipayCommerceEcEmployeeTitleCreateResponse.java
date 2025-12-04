package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcEmployeeTitleFailed;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.title.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:02:35
 */
public class AlipayCommerceEcEmployeeTitleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5829556733312298196L;

	/** 
	 * 抬头失败信息，用来返回批量处理的每一个抬头错误信息
	 */
	@ApiField("title_failed_list")
	private EcEmployeeTitleFailed titleFailedList;

	public void setTitleFailedList(EcEmployeeTitleFailed titleFailedList) {
		this.titleFailedList = titleFailedList;
	}
	public EcEmployeeTitleFailed getTitleFailedList( ) {
		return this.titleFailedList;
	}

}
