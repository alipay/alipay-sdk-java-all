package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adconversion.conversiontype.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 11:42:26
 */
public class AlipayDataDataserviceAdconversionConversiontypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5494617336917685361L;

	/** 
	 * 资产基础信息列表
	 */
	@ApiListField("asset_detail_list")
	@ApiField("asset_detail")
	private List<AssetDetail> assetDetailList;

	public void setAssetDetailList(List<AssetDetail> assetDetailList) {
		this.assetDetailList = assetDetailList;
	}
	public List<AssetDetail> getAssetDetailList( ) {
		return this.assetDetailList;
	}

}
