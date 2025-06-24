package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业分支机构内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:17:53
 */
public class EpBranchDataInfo extends AlipayObject {

	private static final long serialVersionUID = 6735392875269975951L;

	/**
	 * 查询内容明细
	 */
	@ApiListField("hits")
	@ApiField("ep_branch_detail_info")
	private List<EpBranchDetailInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpBranchDetailInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpBranchDetailInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
