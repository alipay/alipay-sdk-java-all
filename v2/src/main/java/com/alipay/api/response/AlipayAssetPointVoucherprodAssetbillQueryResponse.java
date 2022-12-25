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
 * @since 1.0, 2022-12-08 09:35:32
 */
public class AlipayAssetPointVoucherprodAssetbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3591254143462582737L;

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
