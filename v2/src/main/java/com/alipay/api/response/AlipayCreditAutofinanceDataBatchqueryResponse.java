package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneDataQueryResultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:36:14
 */
public class AlipayCreditAutofinanceDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3845142511629657325L;

	/** 
	 * 订单数据查询的返回值。通过列表方式批量返回机构的订单查询数据。通过系统控制返回的数据中不包含客户的敏感信息。
	 */
	@ApiListField("result_data")
	@ApiField("scene_data_query_result_detail")
	private List<SceneDataQueryResultDetail> resultData;

	public void setResultData(List<SceneDataQueryResultDetail> resultData) {
		this.resultData = resultData;
	}
	public List<SceneDataQueryResultDetail> getResultData( ) {
		return this.resultData;
	}

}
