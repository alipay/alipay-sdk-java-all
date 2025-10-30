package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工商企业背景信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:21
 */
public class ZmepDossierBackgroundDataInfo extends AlipayObject {

	private static final long serialVersionUID = 8236235884931328333L;

	/**
	 * 数据结果
	 */
	@ApiListField("hits")
	@ApiField("zmep_dossier_background_info")
	private List<ZmepDossierBackgroundInfo> hits;

	/**
	 * 结果总条数
	 */
	@ApiField("total")
	private Long total;

	public List<ZmepDossierBackgroundInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<ZmepDossierBackgroundInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
