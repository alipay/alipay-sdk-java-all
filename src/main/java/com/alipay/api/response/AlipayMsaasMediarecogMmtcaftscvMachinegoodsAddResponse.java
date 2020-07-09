package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RegionState;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.machinegoods.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-19 21:25:01
 */
public class AlipayMsaasMediarecogMmtcaftscvMachinegoodsAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6485713527942752674L;

	/** 
	 * 柜内区域状态
	 */
	@ApiListField("regions")
	@ApiField("region_state")
	private List<RegionState> regions;

	public void setRegions(List<RegionState> regions) {
		this.regions = regions;
	}
	public List<RegionState> getRegions( ) {
		return this.regions;
	}

}
