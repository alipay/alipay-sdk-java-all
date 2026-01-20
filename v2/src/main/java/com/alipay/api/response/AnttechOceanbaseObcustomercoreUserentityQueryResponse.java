package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OBPassportEntityDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obcustomercore.userentity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 15:37:40
 */
public class AnttechOceanbaseObcustomercoreUserentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8674455118326982622L;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 公司通行证角色信息DTO
	 */
	@ApiListField("data")
	@ApiField("o_b_passport_entity_d_t_o")
	private List<OBPassportEntityDTO> data;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 分页总数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 数据体data的总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setData(List<OBPassportEntityDTO> data) {
		this.data = data;
	}
	public List<OBPassportEntityDTO> getData( ) {
		return this.data;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
