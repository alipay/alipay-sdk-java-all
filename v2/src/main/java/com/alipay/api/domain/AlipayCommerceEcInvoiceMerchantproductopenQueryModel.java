package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票产品开通查询
 *
 * @author auto create
 * @since 1.0, 2025-08-11 23:07:28
 */
public class AlipayCommerceEcInvoiceMerchantproductopenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5562368877871833559L;

	/**
	 * 产品开通流水ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 外部产品开通申请ID
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
