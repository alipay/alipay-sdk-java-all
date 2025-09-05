package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业业务竞争内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:18:31
 */
public class EpBusinessCompetitionDataInfo extends AlipayObject {

	private static final long serialVersionUID = 8325719629186121379L;

	/**
	 * 查询命中明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_business_competition_info")
	private List<EpBusinessCompetitionInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpBusinessCompetitionInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpBusinessCompetitionInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
