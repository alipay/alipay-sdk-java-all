package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产登记注册通用申请接口
 *
 * @author auto create
 * @since 1.0, 2020-07-24 16:10:42
 */
public class AnttechBlockchainFinanceAssetRegisterApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7547247887224979777L;

	/**
	 * 资产详情，不同资产类型格式不同。
	 */
	@ApiField("asset_info")
	private String assetInfo;

	/**
	 * 资产类型，依赖业务对接时约定的枚举值
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 外部资产编号
	 */
	@ApiField("out_asset_id")
	private String outAssetId;

	public String getAssetInfo() {
		return this.assetInfo;
	}
	public void setAssetInfo(String assetInfo) {
		this.assetInfo = assetInfo;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getOutAssetId() {
		return this.outAssetId;
	}
	public void setOutAssetId(String outAssetId) {
		this.outAssetId = outAssetId;
	}

}
