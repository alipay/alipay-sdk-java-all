package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询环境列表
 *
 * @author auto create
 * @since 1.0, 2025-02-07 17:07:20
 */
public class AlipayCloudCloudbaseEnvQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7847738398934764983L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
