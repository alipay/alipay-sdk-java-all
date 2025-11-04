package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业经营异常内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:19
 */
public class EpOperationAbnormalDataInfo extends AlipayObject {

	private static final long serialVersionUID = 7216543632789245331L;

	/**
	 * 查询内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_operation_abnormal_info")
	private List<EpOperationAbnormalInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpOperationAbnormalInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpOperationAbnormalInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
