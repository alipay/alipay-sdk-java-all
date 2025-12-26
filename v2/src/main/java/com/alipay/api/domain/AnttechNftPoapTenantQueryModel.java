package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户勋章(租户维度)
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:37:52
 */
public class AnttechNftPoapTenantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2437436397529859997L;

	/**
	 * 用户ID
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 账号类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
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
