package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业ICP备案内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:32
 */
public class EpICPRegistrationDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3514289729325281982L;

	/**
	 * 查询命中内容明细列表
	 */
	@ApiListField("hits")
	@ApiField("ep_i_c_p_registration_info")
	private List<EpICPRegistrationInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpICPRegistrationInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpICPRegistrationInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
