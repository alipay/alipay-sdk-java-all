package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工商资质证照信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:20
 */
public class ZmepCertificateDataInfo extends AlipayObject {

	private static final long serialVersionUID = 8479371493276757145L;

	/**
	 * 命中数据结果
	 */
	@ApiListField("hits")
	@ApiField("zmep_certificate_info")
	private List<ZmepCertificateInfo> hits;

	/**
	 * 记录条数
	 */
	@ApiField("total")
	private Long total;

	public List<ZmepCertificateInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<ZmepCertificateInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
