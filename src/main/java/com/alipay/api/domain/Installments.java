package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账期id
 *
 * @author auto create
 * @since 1.0, 2016-09-13 22:47:25
 */
public class Installments extends AlipayObject {

	private static final long serialVersionUID = 5563276332125351199L;

	/**
	 * 账期状态
	 */
	@ApiField("id")
	private String id;

	/**
	 * 账期描述，逾期天数或状态文字
	 */
	@ApiField("installment_desc")
	private String installmentDesc;

	/**
	 * 账期状态
	 */
	@ApiField("installment_status")
	private String installmentStatus;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInstallmentDesc() {
		return this.installmentDesc;
	}
	public void setInstallmentDesc(String installmentDesc) {
		this.installmentDesc = installmentDesc;
	}

	public String getInstallmentStatus() {
		return this.installmentStatus;
	}
	public void setInstallmentStatus(String installmentStatus) {
		this.installmentStatus = installmentStatus;
	}

}
