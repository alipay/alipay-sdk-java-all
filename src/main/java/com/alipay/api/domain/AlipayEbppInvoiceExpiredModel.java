package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 失效蓝票接口
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:03:07
 */
public class AlipayEbppInvoiceExpiredModel extends AlipayObject {

	private static final long serialVersionUID = 4658967342167167818L;

	/**
	 * 原始蓝票发票代码
	 */
	@ApiField("blue_invoice_code")
	private String blueInvoiceCode;

	/**
	 * 原始蓝票的发票号码
	 */
	@ApiField("blue_invoice_no")
	private String blueInvoiceNo;

	/**
	 * 商户简称
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 外部交易流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBlueInvoiceCode() {
		return this.blueInvoiceCode;
	}
	public void setBlueInvoiceCode(String blueInvoiceCode) {
		this.blueInvoiceCode = blueInvoiceCode;
	}

	public String getBlueInvoiceNo() {
		return this.blueInvoiceNo;
	}
	public void setBlueInvoiceNo(String blueInvoiceNo) {
		this.blueInvoiceNo = blueInvoiceNo;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
