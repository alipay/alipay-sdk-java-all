package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据集
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:17:43
 */
public class EpCoInvestDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4681761717415576198L;

	/**
	 * null
	 */
	@ApiListField("hits")
	@ApiField("ep_co_invest_info")
	private List<EpCoInvestInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpCoInvestInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpCoInvestInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
