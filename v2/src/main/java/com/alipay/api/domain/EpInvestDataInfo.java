package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业对外投资内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:46
 */
public class EpInvestDataInfo extends AlipayObject {

	private static final long serialVersionUID = 8198275957252176551L;

	/**
	 * 企业对外投资明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_invest_info")
	private List<EpInvestInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpInvestInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpInvestInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
