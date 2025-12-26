package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业涉诉公告内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:03
 */
public class EpLitigationNoticeDataInfo extends AlipayObject {

	private static final long serialVersionUID = 2426213967683672176L;

	/**
	 * 查询命中明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_litigation_notice_info")
	private List<EpLitigationNoticeInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpLitigationNoticeInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpLitigationNoticeInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
