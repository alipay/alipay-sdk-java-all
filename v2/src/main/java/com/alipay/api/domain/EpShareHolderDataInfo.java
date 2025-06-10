package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业股东查询
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:03
 */
public class EpShareHolderDataInfo extends AlipayObject {

	private static final long serialVersionUID = 5765745572169324719L;

	/**
	 * 企业股东信息
	 */
	@ApiListField("hits")
	@ApiField("ep_share_holder_info")
	private List<EpShareHolderInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpShareHolderInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpShareHolderInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
