package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑到家业务接入第三方服务平台
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:15
 */
public class AlipayOfflineProviderTestModel extends AlipayObject {

	private static final long serialVersionUID = 2889769624118581549L;

	/**
	 * 查询口碑到家类目编码列表的当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 查询口碑到家类目编码的每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
