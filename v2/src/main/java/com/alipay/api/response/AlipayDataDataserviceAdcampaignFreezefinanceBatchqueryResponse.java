package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdSpecialAssetListRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.freezefinance.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 18:02:35
 */
public class AlipayDataDataserviceAdcampaignFreezefinanceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1132895799362851525L;

	/** 
	 * 冻结单信息
	 */
	@ApiListField("data")
	@ApiField("ad_special_asset_list_res")
	private List<AdSpecialAssetListRes> data;

	public void setData(List<AdSpecialAssetListRes> data) {
		this.data = data;
	}
	public List<AdSpecialAssetListRes> getData( ) {
		return this.data;
	}

}
