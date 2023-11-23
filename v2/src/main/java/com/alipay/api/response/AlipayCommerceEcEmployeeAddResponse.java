package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-30 15:06:48
 */
public class AlipayCommerceEcEmployeeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6765876337815165841L;

	/** 
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/** 
	 * IOT开通刷脸支持唯一操作流水号，此处透出用于外部服务商通过该unique_id便捷调用IOT侧接口
	 */
	@ApiField("iot_unique_id")
	private String iotUniqueId;

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

	public void setIotUniqueId(String iotUniqueId) {
		this.iotUniqueId = iotUniqueId;
	}
	public String getIotUniqueId( ) {
		return this.iotUniqueId;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
