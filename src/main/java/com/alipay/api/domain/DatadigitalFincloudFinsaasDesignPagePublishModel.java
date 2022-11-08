package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas页面发布
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:57:41
 */
public class DatadigitalFincloudFinsaasDesignPagePublishModel extends AlipayObject {

	private static final long serialVersionUID = 6827254499516998276L;

	/**
	 * 修改的dto
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
