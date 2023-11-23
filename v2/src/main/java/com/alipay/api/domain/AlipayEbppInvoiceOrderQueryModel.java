package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据外部订单号查询发票信息
 *
 * @author auto create
 * @since 1.0, 2020-08-29 14:30:33
 */
public class AlipayEbppInvoiceOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1716149135725516279L;

	/**
	 * 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。 如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 开票申请时所传入订单号，不限于支付宝体内交易订单号。如：20200520110046966071
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。 如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003 要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
