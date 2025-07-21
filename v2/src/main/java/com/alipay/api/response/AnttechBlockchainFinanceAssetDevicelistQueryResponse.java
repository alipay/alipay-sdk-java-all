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
 * @since 1.0, 2023-08-21 01:43:23
 */
public class AnttechBlockchainFinanceAssetDevicelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8217111231195333556L;

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
