package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信息出库接口
 *
 * @author auto create
 * @since 1.0, 2025-06-16 16:38:06
 */
public class AlipayCommerceTransportTourAssetDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6733684763182291111L;

	/**
	 * 用户资产出库实体类集合
	 */
	@ApiListField("asset_out_put_list")
	@ApiField("asset_out_put_request")
	private List<AssetOutPutRequest> assetOutPutList;

	public List<AssetOutPutRequest> getAssetOutPutList() {
		return this.assetOutPutList;
	}
	public void setAssetOutPutList(List<AssetOutPutRequest> assetOutPutList) {
		this.assetOutPutList = assetOutPutList;
	}

}
