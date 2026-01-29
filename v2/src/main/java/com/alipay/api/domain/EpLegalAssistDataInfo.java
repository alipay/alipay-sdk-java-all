package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业司法协助内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:54
 */
public class EpLegalAssistDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4762254338614381342L;

	/**
	 * 查询内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_legal_assist_info")
	private List<EpLegalAssistInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpLegalAssistInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpLegalAssistInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
