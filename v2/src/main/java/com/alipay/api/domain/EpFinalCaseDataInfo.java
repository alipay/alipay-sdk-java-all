package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业终本案件内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:19:05
 */
public class EpFinalCaseDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3498955415742967388L;

	/**
	 * 查询命中内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_final_case_info")
	private List<EpFinalCaseInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpFinalCaseInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpFinalCaseInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
