package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户持仓信息获取
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:38:20
 */
public class AnttechNftOwnassetUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4389866158591298675L;

	/**
	 * 博域用户的 id
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 账号类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小每次最大为30
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

}
