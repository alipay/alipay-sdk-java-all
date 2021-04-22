package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天梭isv绑定VO
 *
 * @author auto create
 * @since 1.0, 2019-08-13 12:56:41
 */
public class TiansuoIsvBindVO extends AlipayObject {

	private static final long serialVersionUID = 6159853778613469718L;

	/**
	 * 间连商户入驻时填写的营业执照号
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 操作类型
bind 绑定
unbind 解绑
	 */
	@ApiField("operation")
	private String operation;

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

}
