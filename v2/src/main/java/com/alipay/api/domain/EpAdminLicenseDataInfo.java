package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业行政许可内容
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:38
 */
public class EpAdminLicenseDataInfo extends AlipayObject {

	private static final long serialVersionUID = 5656471536483187536L;

	/**
	 * 查询企业行政许可内容明细
	 */
	@ApiListField("hits")
	@ApiField("ep_admin_license_info")
	private List<EpAdminLicenseInfo> hits;

	/**
	 * 命中记录总数
	 */
	@ApiField("total")
	private Long total;

	public List<EpAdminLicenseInfo> getHits() {
		return this.hits;
	}
	public void setHits(List<EpAdminLicenseInfo> hits) {
		this.hits = hits;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
