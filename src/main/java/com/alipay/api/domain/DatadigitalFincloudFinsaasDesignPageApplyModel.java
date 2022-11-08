package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas页面设计
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:56:39
 */
public class DatadigitalFincloudFinsaasDesignPageApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8541787165811875433L;

	/**
	 * 修改的数据
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
