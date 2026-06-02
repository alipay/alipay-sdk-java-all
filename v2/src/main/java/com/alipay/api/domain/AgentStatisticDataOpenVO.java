package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据结果
 *
 * @author auto create
 * @since 1.0, 2026-05-22 17:12:50
 */
public class AgentStatisticDataOpenVO extends AlipayObject {

	private static final long serialVersionUID = 4826747786939836499L;

	/**
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("agent_statistic_data_item_open_v_o")
	private List<AgentStatisticDataItemOpenVO> dataList;

	public List<AgentStatisticDataItemOpenVO> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<AgentStatisticDataItemOpenVO> dataList) {
		this.dataList = dataList;
	}

}
