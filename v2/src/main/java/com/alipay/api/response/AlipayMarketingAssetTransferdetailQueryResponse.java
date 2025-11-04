package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetTransferDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.asset.transferdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-26 13:52:29
 */
public class AlipayMarketingAssetTransferdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3793392649938113629L;

	/** 
	 * [{}]
	 */
	@ApiListField("details")
	@ApiField("asset_transfer_detail_d_t_o")
	private List<AssetTransferDetailDTO> details;

	public void setDetails(List<AssetTransferDetailDTO> details) {
		this.details = details;
	}
	public List<AssetTransferDetailDTO> getDetails( ) {
		return this.details;
	}

}
