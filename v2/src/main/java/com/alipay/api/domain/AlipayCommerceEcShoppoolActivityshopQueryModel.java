package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码门店池营销门店查询
 *
 * @author auto create
 * @since 1.0, 2024-07-11 10:34:30
 */
public class AlipayCommerceEcShoppoolActivityshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4164969758416815825L;

	/**
	 * 企业id，企业领域的唯一标识
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 分页中的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页展示的门店个数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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
