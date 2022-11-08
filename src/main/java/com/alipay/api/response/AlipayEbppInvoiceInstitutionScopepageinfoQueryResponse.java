package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.scopepageinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-29 20:04:40
 */
public class AlipayEbppInvoiceInstitutionScopepageinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5118443265399763856L;

	/** 
	 * 制度下人员生效范围，枚举值：
EMPLOYEE_ALL(全体员工),
EMPLOYEE_SELECT(自定义员工),
EMPLOYEE_DEPARTMENT(部门)
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/** 
	 * 员工id列表，如owner_type为phone返回员工手机号
	 */
	@ApiListField("owner_id_list")
	@ApiField("string")
	private List<String> ownerIdList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
	}
	public String getAdapterType( ) {
		return this.adapterType;
	}

	public void setOwnerIdList(List<String> ownerIdList) {
		this.ownerIdList = ownerIdList;
	}
	public List<String> getOwnerIdList( ) {
		return this.ownerIdList;
	}

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

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
