package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PortraitDataVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.insight.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:40:47
 */
public class AlipayMerchantQipanInsightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6184673377433564766L;

	/** 
	 * 人群洞察分析数据
	 */
	@ApiListField("portrait_data_list")
	@ApiField("portrait_data_v_o")
	private List<PortraitDataVO> portraitDataList;

	public void setPortraitDataList(List<PortraitDataVO> portraitDataList) {
		this.portraitDataList = portraitDataList;
	}
	public List<PortraitDataVO> getPortraitDataList( ) {
		return this.portraitDataList;
	}

}
