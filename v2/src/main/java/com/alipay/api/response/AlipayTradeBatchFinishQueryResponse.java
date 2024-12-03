package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchFinishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.finish.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-17 17:02:00
 */
public class AlipayTradeBatchFinishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2693815426652111215L;

	/** 
	 * 关账汇总的查询返回列表，单个关账查询结果的处理规则如下：如查询不存在，则不返回；如单个查询异常，也会过滤不返回；
	 */
	@ApiListField("batch_list")
	@ApiField("batch_finish_info")
	private List<BatchFinishInfo> batchList;

	public void setBatchList(List<BatchFinishInfo> batchList) {
		this.batchList = batchList;
	}
	public List<BatchFinishInfo> getBatchList( ) {
		return this.batchList;
	}

}
