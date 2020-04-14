package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品通用组查询
 *
 * @author auto create
 * @since 1.0, 2020-04-11 11:06:29
 */
public class KoubeiCateringDishCommgroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3586752587355475758L;

	/**
	 * 需要查询的组id
	 */
	@ApiField("comm_group_id")
	private String commGroupId;

	/**
	 * 查询页码，表示第几页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，表示每页查询数量，不超过50
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getCommGroupId() {
		return this.commGroupId;
	}
	public void setCommGroupId(String commGroupId) {
		this.commGroupId = commGroupId;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
