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
 * @since 1.0, 2022-10-14 10:06:56
 */
public class AnttechBlockchainDefinDataserviceRegioninfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4163889149232987938L;

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
