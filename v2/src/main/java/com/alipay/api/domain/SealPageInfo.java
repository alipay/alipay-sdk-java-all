package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用印按页申请请求信息
 *
 * @author auto create
 * @since 1.0, 2019-12-27 17:47:25
 */
public class SealPageInfo extends AlipayObject {

	private static final long serialVersionUID = 3238761285276815423L;

	/**
	 * 当前页码号
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 当前页码的用印申请信息
	 */
	@ApiField("seal_request_info")
	private SealRequestInfo sealRequestInfo;

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public SealRequestInfo getSealRequestInfo() {
		return this.sealRequestInfo;
	}
	public void setSealRequestInfo(SealRequestInfo sealRequestInfo) {
		this.sealRequestInfo = sealRequestInfo;
	}

}
