package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝交易号回传发票接口
 *
 * @author auto create
 * @since 1.0, 2026-09-17 13:38:06
 */
public class AlipayEbppInvoiceAlipaytradeSendModel extends AlipayObject {

	private static final long serialVersionUID = 6445479637682829896L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 发票信息列表
	 */
	@ApiListField("invoice_info_list")
	@ApiField("invoice_send_open_by_alipay_trade_no")
	private List<InvoiceSendOpenByAlipayTradeNo> invoiceInfoList;

	/**
	 * 开票商户品牌简称
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 开票商户门店简称
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public List<InvoiceSendOpenByAlipayTradeNo> getInvoiceInfoList() {
		return this.invoiceInfoList;
	}
	public void setInvoiceInfoList(List<InvoiceSendOpenByAlipayTradeNo> invoiceInfoList) {
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
