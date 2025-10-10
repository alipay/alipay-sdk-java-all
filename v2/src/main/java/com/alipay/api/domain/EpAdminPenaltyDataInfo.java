package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业行政处罚内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:16:44
 */
public class EpAdminPenaltyDataInfo extends AlipayObject {

	private static final long serialVersionUID = 7114784326638156178L;

	/**
	 * 查询企业行政处罚明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_admin_penalty_info")
	private List<EpAdminPenaltyInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpAdminPenaltyInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpAdminPenaltyInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
