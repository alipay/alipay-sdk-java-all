package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业股权出质内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:28:14
 */
public class EpEquityPledgeDataInfo extends AlipayObject {

	private static final long serialVersionUID = 8418172758478889977L;

	/**
	 * 企业股权出质明细查询列表
	 */
	@ApiListField("hits")
	@ApiField("ep_equity_pledge_info")
	private List<EpEquityPledgeInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpEquityPledgeInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpEquityPledgeInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
