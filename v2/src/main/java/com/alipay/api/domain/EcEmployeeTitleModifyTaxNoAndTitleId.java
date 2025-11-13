package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码员工抬头修改：税号/抬头ID
 *
 * @author auto create
 * @since 1.0, 2025-08-15 19:24:25
 */
public class EcEmployeeTitleModifyTaxNoAndTitleId extends AlipayObject {

	private static final long serialVersionUID = 5469746353114466991L;

	/**
	 * 税号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 抬头ID
	 */
	@ApiField("title_id")
	private String titleId;

	public String getTaxRegisterNo() {
		return this.taxRegisterNo;
	}
	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}

	public String getTitleId() {
		return this.titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

}
