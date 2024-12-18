package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热门事件榜单
 *
 * @author auto create
 * @since 1.0, 2019-03-18 11:17:07
 */
public class AntfortuneContentCommunityHoteventListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4591777642531133282L;

	/**
	 * 某天的热门事件
	 */
	@ApiField("date")
	private String date;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 热门事件榜单的topn数量
	 */
	@ApiField("topn_count")
	private Long topnCount;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Long getTopnCount() {
		return this.topnCount;
	}
	public void setTopnCount(Long topnCount) {
		this.topnCount = topnCount;
	}

}
