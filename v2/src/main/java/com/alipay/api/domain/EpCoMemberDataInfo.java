package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结果集
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:17:43
 */
public class EpCoMemberDataInfo extends AlipayObject {

	private static final long serialVersionUID = 5566325727233312396L;

	/**
	 * null
	 */
	@ApiListField("hits")
	@ApiField("ep_co_member_info")
	private List<EpCoMemberInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpCoMemberInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpCoMemberInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
