package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简单模式发票回传接口
 *
 * @author auto create
 * @since 1.0, 2021-06-17 15:29:23
 */
public class AlipayEbppInvoiceSyncSimpleSendModel extends AlipayObject {

	private static final long serialVersionUID = 7393182683664261341L;

	/**
	 * 回传的发票信息
	 */
	@ApiField("invoice_info")
	private InvoicePDFSynModel invoiceInfo;

	/**
	 * 开票商户品牌简称，与商户入驻时的品牌简称保持一致。详情参见 <a href="https://opendocs.alipay.com/open/10691/welcome-to-lark">电子发票</a>
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
