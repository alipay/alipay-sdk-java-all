package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专享价组织解约接口
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:13:04
 */
public class AlipayFundIdentitypayOrganizationUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 1862272761138696898L;

	/**
	 * 解约场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部组织id(全局唯一)
	 */
	@ApiField("out_org_id")
	private String outOrgId;

	/**
	 * 外部组织名称
	 */
	@ApiField("out_org_name")
	private String outOrgName;

	/**
	 * 解约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutOrgId() {
		return this.outOrgId;
	}
	public void setOutOrgId(String outOrgId) {
		this.outOrgId = outOrgId;
	}

	public String getOutOrgName() {
		return this.outOrgName;
	}
	public void setOutOrgName(String outOrgName) {
		this.outOrgName = outOrgName;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

}
