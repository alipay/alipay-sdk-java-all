package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业码账单开票结果
 *
 * @author auto create
 * @since 1.0, 2026-02-28 15:27:43
 */
public class AlipayCommerceEcInvoiceresultConsumeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6342965676982133714L;

	/**
	 * 企业id，可通过查询入驻企业码企业详情获取
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 开票申请id，发起开票申请后返回的申请id
	 */
	@ApiField("invoice_apply_id")
	private String invoiceApplyId;

	/**
	 * 外部开票申请id，调用方自定义生成，且保证唯一
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInvoiceApplyId() {
		return this.invoiceApplyId;
	}
	public void setInvoiceApplyId(String invoiceApplyId) {
		this.invoiceApplyId = invoiceApplyId;
	}

	public String getOuterApplyId() {
		return this.outerApplyId;
	}
	public void setOuterApplyId(String outerApplyId) {
		this.outerApplyId = outerApplyId;
	}

}
