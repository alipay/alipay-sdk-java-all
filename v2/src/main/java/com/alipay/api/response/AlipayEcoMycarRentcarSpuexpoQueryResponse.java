package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentCarSpuExpoInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.rentcar.spuexpo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 14:52:26
 */
public class AlipayEcoMycarRentcarSpuexpoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1834325994817616452L;

	/** 
	 * 曝光信息
	 */
	@ApiListField("expo_infos")
	@ApiField("rent_car_spu_expo_info")
	private List<RentCarSpuExpoInfo> expoInfos;

	/** 
	 * 曝光信息总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setExpoInfos(List<RentCarSpuExpoInfo> expoInfos) {
		this.expoInfos = expoInfos;
	}
	public List<RentCarSpuExpoInfo> getExpoInfos( ) {
		return this.expoInfos;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
