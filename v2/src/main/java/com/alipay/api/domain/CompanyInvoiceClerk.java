package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票员信息
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:55
 */
public class CompanyInvoiceClerk extends AlipayObject {

	private static final long serialVersionUID = 6584852893596114368L;

	/**
	 * 开票员证件号码
	 */
	@ApiField("clerk_cert_no")
	private String clerkCertNo;

	/**
	 * 开票员姓名
	 */
	@ApiField("clerk_name")
	private String clerkName;

	/**
	 * 开票员身份标识
	 */
	@ApiField("clerk_no")
	private String clerkNo;

	public String getClerkCertNo() {
		return this.clerkCertNo;
	}
	public void setClerkCertNo(String clerkCertNo) {
		this.clerkCertNo = clerkCertNo;
	}

	public String getClerkName() {
		return this.clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getClerkNo() {
		return this.clerkNo;
	}
	public void setClerkNo(String clerkNo) {
		this.clerkNo = clerkNo;
	}

}
