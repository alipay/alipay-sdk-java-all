package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产发行预申请
 *
 * @author auto create
 * @since 1.0, 2020-04-02 20:40:11
 */
public class AnttechBlockchainFinanceAssetIssueApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7675341558518416523L;

	/**
	 * 资产类型，依赖业务对接时约定的枚举值
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 当asset_type为RECEIVABLE时必填，应收账款信息
	 */
	@ApiField("receivable_info")
	private FinanceReceivableInfo receivableInfo;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public FinanceReceivableInfo getReceivableInfo() {
		return this.receivableInfo;
	}
	public void setReceivableInfo(FinanceReceivableInfo receivableInfo) {
		this.receivableInfo = receivableInfo;
	}

}
