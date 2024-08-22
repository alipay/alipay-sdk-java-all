package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-21 13:52:08
 */
public class AlipayCommerceEcEmployeeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4476376577639577858L;

	/** 
	 * 企业码生成的员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/** 
	 * 员工开通IOT企业刷脸付的唯一流水号
	 */
	@ApiField("iot_unique_id")
	private String iotUniqueId;

	/** 
	 * 员工签约激活吱口令
	 */
	@ApiField("share_code")
	private String shareCode;

	/** 
	 * 员工签约激活页面链接
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

	public void setShareCode(String shareCode) {
		this.shareCode = shareCode;
	}
	public String getShareCode( ) {
		return this.shareCode;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
