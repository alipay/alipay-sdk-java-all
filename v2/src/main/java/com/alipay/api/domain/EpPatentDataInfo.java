package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业专利内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 11:27:45
 */
public class EpPatentDataInfo extends AlipayObject {

	private static final long serialVersionUID = 1422587482856447929L;

	/**
	 * 查询命中明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_patent_info")
	private List<EpPatentInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpPatentInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpPatentInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
