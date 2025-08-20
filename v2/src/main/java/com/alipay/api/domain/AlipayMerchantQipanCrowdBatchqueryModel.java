package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家人群查询
 *
 * @author auto create
 * @since 1.0, 2024-11-18 16:44:00
 */
public class AlipayMerchantQipanCrowdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6885476193745663965L;

	/**
	 * 人群名称
最大长度为15个字符
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 页码，本参数为空或小于1默认显示第一页；
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 每页大小。本参数为空或小于1默认20条；超过20条默认按20条查询；不足20条则按实际记录数返回
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
