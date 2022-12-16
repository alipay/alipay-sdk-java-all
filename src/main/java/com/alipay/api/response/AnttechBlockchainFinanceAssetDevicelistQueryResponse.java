package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetDeviceRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.asset.devicelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:19:08
 */
public class AnttechBlockchainFinanceAssetDevicelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4612722624248213319L;

	/** 
	 * 查询的设备信息列表，为空表示未查询到结果。
	 */
	@ApiListField("device_list")
	@ApiField("asset_device_relation")
	private List<AssetDeviceRelation> deviceList;

	public void setDeviceList(List<AssetDeviceRelation> deviceList) {
		this.deviceList = deviceList;
	}
	public List<AssetDeviceRelation> getDeviceList( ) {
		return this.deviceList;
	}

}
