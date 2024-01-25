package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询绑定的小程序列表信息
 *
 * @author auto create
 * @since 1.0, 2023-10-16 19:23:51
 */
public class AlipayOpenMiniAmpeBindedminiappBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2768696767774261597L;

	/**
	 * 移动应用ID，必填
	 */
	@ApiField("mobile_app_id")
	private String mobileAppId;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 单页查询数量，最大不超过100
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getMobileAppId() {
		return this.mobileAppId;
	}
	public void setMobileAppId(String mobileAppId) {
		this.mobileAppId = mobileAppId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
