package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询著作权内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:18:49
 */
public class EpCopyrightDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3418491553177148445L;

	/**
	 * 查询命中明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_copyright_info")
	private List<EpCopyrightInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpCopyrightInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpCopyrightInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
