package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝交易号查询抬头接口
 *
 * @author auto create
 * @since 1.0, 2026-09-17 13:40:05
 */
public class AlipayEbppInvoicetitleAlipaytradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5885526662124117938L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

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
