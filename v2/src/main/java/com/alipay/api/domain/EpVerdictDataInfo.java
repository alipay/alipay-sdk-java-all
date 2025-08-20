package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业裁判文书内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:17:33
 */
public class EpVerdictDataInfo extends AlipayObject {

	private static final long serialVersionUID = 4866811871211888858L;

	/**
	 * 查询内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_verdict_info")
	private List<EpVerdictInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpVerdictInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpVerdictInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
