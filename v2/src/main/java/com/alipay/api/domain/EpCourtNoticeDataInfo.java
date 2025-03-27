package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业开庭公告内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:27
 */
public class EpCourtNoticeDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3657882552732229858L;

	/**
	 * 查询内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_court_notice_info")
	private List<EpCourtNoticeInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpCourtNoticeInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpCourtNoticeInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
