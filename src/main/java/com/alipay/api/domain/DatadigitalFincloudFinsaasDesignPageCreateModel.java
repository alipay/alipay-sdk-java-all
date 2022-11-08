package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas页面创建
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:57:45
 */
public class DatadigitalFincloudFinsaasDesignPageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5811678857124327599L;

	/**
	 * 创建页面的信息
	 */
	@ApiField("page_info")
	private PageInfoDTO pageInfo;

	public PageInfoDTO getPageInfo() {
		return this.pageInfo;
	}
	public void setPageInfo(PageInfoDTO pageInfo) {
		this.pageInfo = pageInfo;
	}

}
