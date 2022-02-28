package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用通过名称查询企业
 *
 * @author auto create
 * @since 1.0, 2021-09-18 17:58:13
 */
public class ZhimaCreditEpDossierNameMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6226876796127927634L;

	/**
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 企业类别范围:
ENTERPRISE(企业)，
INDIVIDUAL（个体工商户),
ORGANIZATION(组织机构),
ALL(全部，默认)
	 */
	@ApiField("ep_type_scope")
	private String epTypeScope;

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpTypeScope() {
		return this.epTypeScope;
	}
	public void setEpTypeScope(String epTypeScope) {
		this.epTypeScope = epTypeScope;
	}

}
