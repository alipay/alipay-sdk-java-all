package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询已关联指定APP的账号列表
 *
 * @author auto create
 * @since 1.0, 2022-07-13 16:57:48
 */
public class AntMerchantExpandApprecommendAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4777666617964964262L;

	/**
	 * 已关联小程序的app_id
	 */
	@ApiField("app_no")
	private String appNo;

	/**
	 * 页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 单页行数，不能超过100行
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAppNo() {
		return this.appNo;
	}
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
