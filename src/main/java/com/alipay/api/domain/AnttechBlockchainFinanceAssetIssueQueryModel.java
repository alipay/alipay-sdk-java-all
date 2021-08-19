package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产发行结果查询
 *
 * @author auto create
 * @since 1.0, 2019-12-26 10:59:01
 */
public class AnttechBlockchainFinanceAssetIssueQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5253185132276152187L;

	/**
	 * 资产发行提交时传入的内部资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产对应的核心企业信息
	 */
	@ApiField("core_business_info")
	private FinanceMemberInfo coreBusinessInfo;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public FinanceMemberInfo getCoreBusinessInfo() {
		return this.coreBusinessInfo;
	}
	public void setCoreBusinessInfo(FinanceMemberInfo coreBusinessInfo) {
		this.coreBusinessInfo = coreBusinessInfo;
	}

}
