package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.assetbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:11
 */
public class AlipayAssetPointVoucherprodAssetbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8113619553243858779L;

	/** 
	 * 单据流水列表
	 */
	@ApiListField("asset_bill_info")
	@ApiField("asset_bill_info")
	private List<AssetBillInfo> assetBillInfo;

	public void setAssetBillInfo(List<AssetBillInfo> assetBillInfo) {
		this.assetBillInfo = assetBillInfo;
	}
	public List<AssetBillInfo> getAssetBillInfo( ) {
		return this.assetBillInfo;
	}

}
