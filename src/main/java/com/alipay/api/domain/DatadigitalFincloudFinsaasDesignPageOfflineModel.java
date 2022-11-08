package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas页面下架
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:57:38
 */
public class DatadigitalFincloudFinsaasDesignPageOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 6773697958479567129L;

	/**
	 * 修改的信息
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
