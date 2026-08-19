package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票下载
 *
 * @author auto create
 * @since 1.0, 2026-08-14 20:02:48
 */
public class AlipayTradeSaasInvoiceDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 8548251967832697399L;

	/**
	 * 发票下载类型1=PDF、2=OFD、3=XML
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * saas平台发票单据号
	 */
	@ApiField("saas_invoice_order_no")
	private String saasInvoiceOrderNo;

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getSaasInvoiceOrderNo() {
		return this.saasInvoiceOrderNo;
	}
	public void setSaasInvoiceOrderNo(String saasInvoiceOrderNo) {
		this.saasInvoiceOrderNo = saasInvoiceOrderNo;
	}

}
