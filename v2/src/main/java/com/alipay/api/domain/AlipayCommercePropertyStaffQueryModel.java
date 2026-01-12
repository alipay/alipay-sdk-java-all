package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工查询接口
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class AlipayCommercePropertyStaffQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6371266851958195447L;

	/**
	 * 姓名 精确匹配
	 */
	@ApiField("name")
	private String name;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 手机号 精确匹配
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 员工id 精确匹配
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 工号 精确匹配
	 */
	@ApiField("staff_no")
	private String staffNo;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffNo() {
		return this.staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

}
