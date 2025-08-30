package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业限制高消费内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:24:35
 */
public class EpConsumeRestrictionDataInfo extends AlipayObject {

	private static final long serialVersionUID = 8123879819919675455L;

	/**
	 * 查询命中明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_consume_restriction_info")
	private List<EpConsumeRestrictionInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpConsumeRestrictionInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpConsumeRestrictionInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
