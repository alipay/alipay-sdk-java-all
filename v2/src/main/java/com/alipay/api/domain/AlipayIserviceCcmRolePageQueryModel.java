package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询角色
 *
 * @author auto create
 * @since 1.0, 2023-08-21 15:10:16
 */
public class AlipayIserviceCcmRolePageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6199523134192911727L;

	/**
	 * 部门id（即租户实例ID、数据权限ID）
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 角色名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 查询结果的页码，起始值为 1，默认值为 1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询时设置的每页记录数，最大值 100 行，默认为 10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
