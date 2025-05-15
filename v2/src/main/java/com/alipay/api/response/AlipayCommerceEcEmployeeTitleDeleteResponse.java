package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcEmployeeTitleFailed;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.title.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-01 17:17:30
 */
public class AlipayCommerceEcEmployeeTitleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8519534584464819866L;

	/** 
	 * 批量处理抬头的错误信息
	 */
	@ApiField("ec_employee_title_failed_list")
	private EcEmployeeTitleFailed ecEmployeeTitleFailedList;

	public void setEcEmployeeTitleFailedList(EcEmployeeTitleFailed ecEmployeeTitleFailedList) {
		this.ecEmployeeTitleFailedList = ecEmployeeTitleFailedList;
	}
	public EcEmployeeTitleFailed getEcEmployeeTitleFailedList( ) {
		return this.ecEmployeeTitleFailedList;
	}

}
