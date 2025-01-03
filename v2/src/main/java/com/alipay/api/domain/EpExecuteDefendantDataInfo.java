package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业被执行人内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:28:38
 */
public class EpExecuteDefendantDataInfo extends AlipayObject {

	private static final long serialVersionUID = 6313367559148783931L;

	/**
	 * 查询内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_execute_defendant_info")
	private List<EpExecuteDefendantInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpExecuteDefendantInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpExecuteDefendantInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
