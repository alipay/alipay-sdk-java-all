package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业失信被执行人内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:47
 */
public class EpDishonestDefendantDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3429633465144259413L;

	/**
	 * 查询内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_dishonest_defendant_info")
	private List<EpDishonestDefendantInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpDishonestDefendantInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpDishonestDefendantInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
