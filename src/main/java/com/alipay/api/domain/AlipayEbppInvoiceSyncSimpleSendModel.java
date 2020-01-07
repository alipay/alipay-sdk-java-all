package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简单模式发票回传接口
 *
 * @author auto create
 * @since 1.0, 2019-09-17 09:54:40
 */
public class AlipayEbppInvoiceSyncSimpleSendModel extends AlipayObject {

	private static final long serialVersionUID = 5774349745259825661L;

	/**
	 * 回传的发票信息
	 */
	@ApiField("invoice_info")
	private InvoicePDFSynModel invoiceInfo;

	/**
	 * 开票商户品牌简称，与商户入驻时的品牌简称保持一致。
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 开票商户门店简称，与商户入驻时的门店简称保持一致。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public InvoicePDFSynModel getInvoiceInfo() {
		return this.invoiceInfo;
	}
	public void setInvoiceInfo(InvoicePDFSynModel invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
