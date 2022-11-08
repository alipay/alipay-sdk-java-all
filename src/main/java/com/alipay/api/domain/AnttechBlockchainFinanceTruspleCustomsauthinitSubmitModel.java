package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报关插卡认证初始化
 *
 * @author auto create
 * @since 1.0, 2022-10-13 16:53:44
 */
public class AnttechBlockchainFinanceTruspleCustomsauthinitSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8576787741936866328L;

	/**
	 * 组织机构代码
	 */
	@ApiField("org_code")
	private String orgCode;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

}
