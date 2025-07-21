package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业工商变更内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:18:13
 */
public class EpReginfoChangeDataInfo extends AlipayObject {

	private static final long serialVersionUID = 1365977368445274774L;

	/**
	 * 企业工商变更明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_reginfo_change_info")
	private List<EpReginfoChangeInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpReginfoChangeInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpReginfoChangeInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
