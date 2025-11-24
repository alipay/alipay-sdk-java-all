package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票信息回传接口（新版）
 *
 * @author auto create
 * @since 1.0, 2024-03-01 16:58:49
 */
public class AlipayEbppInvoiceInfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 7581711935774692365L;

	/**
	 * 发票信息列表
	 */
	@ApiListField("invoice_info_list")
	@ApiField("invoice_send_open_model")
	private List<InvoiceSendOpenModel> invoiceInfoList;

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

	public List<InvoiceSendOpenModel> getInvoiceInfoList() {
		return this.invoiceInfoList;
	}
	public void setInvoiceInfoList(List<InvoiceSendOpenModel> invoiceInfoList) {
		this.invoiceInfoList = invoiceInfoList;
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
