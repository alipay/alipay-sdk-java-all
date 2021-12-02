package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据外部订单号查询开票状态
 *
 * @author auto create
 * @since 1.0, 2020-08-29 14:47:50
 */
public class AlipayEbppInvoiceApplystatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2631715877249358338L;

	/**
	 * 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。 如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 待查询订单开票状态列表，各订单号间通过英文逗号分割，不限于支付宝体内交易订单号。如：20200520110046966071,20200520110046966072,20200520110046966073
	 */
	@ApiListField("order_no_list")
	@ApiField("string")
	private List<String> orderNoList;

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

	public List<String> getOrderNoList() {
		return this.orderNoList;
	}
	public void setOrderNoList(List<String> orderNoList) {
		this.orderNoList = orderNoList;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
