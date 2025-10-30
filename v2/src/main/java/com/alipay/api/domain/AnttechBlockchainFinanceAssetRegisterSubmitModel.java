package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产登记注册通用提交接口
 *
 * @author auto create
 * @since 1.0, 2020-07-24 17:05:29
 */
public class AnttechBlockchainFinanceAssetRegisterSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5737865718136198771L;

	/**
	 * 资产发现中心内部资产编号，通过apply返回
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型，同apply，为直观，submit也必传。
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 资产发行申请后，后续操作提交。
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 提交的数据，根据operate不同而不同
	 */
	@ApiField("submit_data")
	private String submitData;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getSubmitData() {
		return this.submitData;
	}
	public void setSubmitData(String submitData) {
		this.submitData = submitData;
	}

}
