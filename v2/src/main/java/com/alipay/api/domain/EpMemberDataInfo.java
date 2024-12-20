package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业成员查询内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:09
 */
public class EpMemberDataInfo extends AlipayObject {

	private static final long serialVersionUID = 1827625567677228257L;

	/**
	 * 企业成员列表
	 */
	@ApiListField("hits")
	@ApiField("ep_member_info")
	private List<EpMemberInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpMemberInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpMemberInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
