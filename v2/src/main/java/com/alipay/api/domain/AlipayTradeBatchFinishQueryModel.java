package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批次预分账或预结算完结的批查询接口
 *
 * @author auto create
 * @since 1.0, 2024-04-17 17:00:27
 */
public class AlipayTradeBatchFinishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8519834939563812639L;

	/**
	 * 关账的汇总信息查询基础模型，其中batch_id非空
	 */
	@ApiListField("query_info_list")
	@ApiField("batch_finish_query_info")
	private List<BatchFinishQueryInfo> queryInfoList;

	public List<BatchFinishQueryInfo> getQueryInfoList() {
		return this.queryInfoList;
	}
	public void setQueryInfoList(List<BatchFinishQueryInfo> queryInfoList) {
		this.queryInfoList = queryInfoList;
	}

}
