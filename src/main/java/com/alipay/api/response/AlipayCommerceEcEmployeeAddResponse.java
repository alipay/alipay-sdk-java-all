package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:36:37
 */
public class AlipayCommerceEcEmployeeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7493924436223531881L;

	/** 
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/** 
	 * 资金代付签约链接 1.员工未绑支付宝，拉起员工绑定页面 2.员工已绑支付宝，拉起资金签约页面
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId( ) {
		return this.employeeId;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
