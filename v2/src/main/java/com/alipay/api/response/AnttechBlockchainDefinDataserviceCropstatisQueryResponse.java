package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CropsStatisticsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.cropstatis.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:01:43
 */
public class AnttechBlockchainDefinDataserviceCropstatisQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8249348252274865579L;

	/** 
	 * 作物统计信息
	 */
	@ApiListField("crop_statistics")
	@ApiField("crops_statistics_info")
	private List<CropsStatisticsInfo> cropStatistics;

	public void setCropStatistics(List<CropsStatisticsInfo> cropStatistics) {
		this.cropStatistics = cropStatistics;
	}
	public List<CropsStatisticsInfo> getCropStatistics( ) {
		return this.cropStatistics;
	}

}
