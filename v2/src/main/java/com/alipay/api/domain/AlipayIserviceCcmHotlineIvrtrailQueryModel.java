package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取IVR轨迹详情列表
 *
 * @author auto create
 * @since 1.0, 2024-05-24 11:34:03
 */
public class AlipayIserviceCcmHotlineIvrtrailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6886679757241263316L;

	/**
	 * 123
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 查询结果的页码，起始值为 1，默认值为 1
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 查询结果的页大小，起始值为 10，默认值为 10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
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
