package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工商企业评价记录信息列表
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:24
 */
public class ZmEpBondRatingDataInfo extends AlipayObject {

	private static final long serialVersionUID = 5486228844539788947L;

	/**
	 * 债券发行列表
	 */
	@ApiListField("hits")
	@ApiField("zm_ep_bond_rating_info")
	private List<ZmEpBondRatingInfo> hits;

	/**
	 * 记录总条数
	 */
	@ApiField("total")
	private Long total;

	public List<ZmEpBondRatingInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<ZmEpBondRatingInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
