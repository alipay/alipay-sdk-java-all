package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业信息查询
 *
 * @author auto create
 * @since 1.0, 2025-06-12 14:48:45
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5678626443535969871L;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 如果企业有校验异常,企业信息查询会将校验失败的异常信息返回,校验成功则返回空数组;该参数为true代表更新企业校验信息,为false或者不传该参数只返回校验失败信息
	 */
	@ApiField("update_check_info")
	private Boolean updateCheckInfo;

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public Boolean getUpdateCheckInfo() {
		return this.updateCheckInfo;
	}
	public void setUpdateCheckInfo(Boolean updateCheckInfo) {
		this.updateCheckInfo = updateCheckInfo;
	}

}
