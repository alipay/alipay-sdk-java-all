package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询营销展区
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class AlipayCommerceEcMarketRegionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8783762735671384378L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * DINGDING_SIGN_PAGE（钉钉员企签约页）
DINGDING_BENEFIT_PAGE（钉钉权益列表页）
	 */
	@ApiField("region_position")
	private String regionPosition;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getRegionPosition() {
		return this.regionPosition;
	}
	public void setRegionPosition(String regionPosition) {
		this.regionPosition = regionPosition;
	}

}
