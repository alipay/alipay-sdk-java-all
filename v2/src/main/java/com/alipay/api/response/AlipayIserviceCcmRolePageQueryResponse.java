package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Role;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.role.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:27:28
 */
public class AlipayIserviceCcmRolePageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7456883514816759427L;

	/** 
	 * 查询结果的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询时设置的每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 角色列表
	 */
	@ApiListField("roles")
	@ApiField("role")
	private List<Role> roles;

	/** 
	 * 总条目数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public List<Role> getRoles( ) {
		return this.roles;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
