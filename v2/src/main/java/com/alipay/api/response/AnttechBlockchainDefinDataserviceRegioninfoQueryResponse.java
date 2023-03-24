package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgriRegionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.regioninfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:56:42
 */
public class AnttechBlockchainDefinDataserviceRegioninfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1352238876741586378L;

	/** 
	 * 区域信息列表
	 */
	@ApiListField("region_list")
	@ApiField("agri_region_info")
	private List<AgriRegionInfo> regionList;

	public void setRegionList(List<AgriRegionInfo> regionList) {
		this.regionList = regionList;
	}
	public List<AgriRegionInfo> getRegionList( ) {
		return this.regionList;
	}

}
