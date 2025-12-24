package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OU税务信息查询
 *
 * @author auto create
 * @since 1.0, 2024-03-07 11:06:48
 */
public class AlipayBossFncWallstreetOrgtaxinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4558955971172782334L;

	/**
	 * 组织code
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 税务编号
	 */
	@ApiField("purchaser_tax_no")
	private String purchaserTaxNo;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getPurchaserTaxNo() {
		return this.purchaserTaxNo;
	}
	public void setPurchaserTaxNo(String purchaserTaxNo) {
		this.purchaserTaxNo = purchaserTaxNo;
	}

}
