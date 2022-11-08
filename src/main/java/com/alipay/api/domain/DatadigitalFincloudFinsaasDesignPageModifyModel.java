package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas编辑页面
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:57:00
 */
public class DatadigitalFincloudFinsaasDesignPageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6217829425485222131L;

	/**
	 * 更新的页面详情
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
