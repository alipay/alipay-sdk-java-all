package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MultiDataOpenResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.behavior.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 18:36:44
 */
public class AlipayMerchantQipanBehaviorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1745648899493165746L;

	/** 
	 * 人群行为分析数据
	 */
	@ApiListField("multi_data_list")
	@ApiField("multi_data_open_result")
	private List<MultiDataOpenResult> multiDataList;

	public void setMultiDataList(List<MultiDataOpenResult> multiDataList) {
		this.multiDataList = multiDataList;
	}
	public List<MultiDataOpenResult> getMultiDataList( ) {
		return this.multiDataList;
	}

}
