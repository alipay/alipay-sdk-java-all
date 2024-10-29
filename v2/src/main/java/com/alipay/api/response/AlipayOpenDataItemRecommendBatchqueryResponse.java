package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.item.recommend.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:29:39
 */
public class AlipayOpenDataItemRecommendBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2868348298859563113L;

	/** 
	 * 推荐结果
	 */
	@ApiListField("result_obj")
	@ApiField("rec_result_info")
	private List<RecResultInfo> resultObj;

	public void setResultObj(List<RecResultInfo> resultObj) {
		this.resultObj = resultObj;
	}
	public List<RecResultInfo> getResultObj( ) {
		return this.resultObj;
	}

}
