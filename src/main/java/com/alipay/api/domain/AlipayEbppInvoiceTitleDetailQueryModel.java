package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抬头详情查询
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:49:31
 */
public class AlipayEbppInvoiceTitleDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6886381966278469411L;

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
