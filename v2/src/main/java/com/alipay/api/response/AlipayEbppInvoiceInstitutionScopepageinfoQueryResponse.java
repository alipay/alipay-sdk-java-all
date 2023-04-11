package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.scopepageinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:46:46
 */
public class AlipayEbppInvoiceInstitutionScopepageinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7696857667212764843L;

	/** 
	 * 制度下人员生效范围，枚举值：
EMPLOYEE_ALL(全体员工),
EMPLOYEE_SELECT(自定义员工),
EMPLOYEE_DEPARTMENT(部门)
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/** 
	 * 切换 open_id 后请使用此字段：
adapter_type为：
EMPLOYEE_DEPARTMENT：返回部门ID
EMPLOYEE_SELECT：当owner_type为PHONE时返回手机号，其他值则根据对接方式返回open_id，或企业码员工ID
	 */
	@ApiListField("onwer_open_id_list")
	@ApiField("string")
	private List<String> onwerOpenIdList;

	/** 
	 * 未切换 open_id 时请使用此字段：
adapter_type为：
EMPLOYEE_DEPARTMENT：返回部门ID
EMPLOYEE_SELECT：当owner_type为PHONE时返回手机号，其他值则根据对接方式返回支付宝用户ID，或企业码员工ID
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

	public void setOnwerOpenIdList(List<String> onwerOpenIdList) {
		this.onwerOpenIdList = onwerOpenIdList;
	}
	public List<String> getOnwerOpenIdList( ) {
		return this.onwerOpenIdList;
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
