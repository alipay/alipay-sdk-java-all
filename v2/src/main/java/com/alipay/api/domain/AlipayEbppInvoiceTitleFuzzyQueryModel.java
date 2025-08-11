package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抬头模糊查询
 *
 * @author auto create
 * @since 1.0, 2022-03-24 15:31:50
 */
public class AlipayEbppInvoiceTitleFuzzyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7642282656815431632L;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 商户的品牌名称简称,该字段需要接入前向发票管家申请，
m_short_name+sub_m_short_name具有唯一约束
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 支付宝为商户分配的商户门店简称，该字段需要接入前在发票管家申请
如：肯德基-杭州西湖区文一西路店：KFC-HZ-XH001
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
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
