package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业商标查询内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 11:28:16
 */
public class EpTrademarkDataInfo extends AlipayObject {

	private static final long serialVersionUID = 2547984868978312266L;

	/**
	 * 查询命中明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_trademark_info")
	private List<EpTrademarkInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpTrademarkInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpTrademarkInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
