package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.scopepageinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-28 10:52:05
 */
public class AlipayEbppInvoiceInstitutionScopepageinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7749455178151478623L;

	/** 
	 * 制度适用范围类型
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/** 
	 * 适配开放id列表
	 */
	@ApiListField("onwer_open_id_list")
	@ApiField("string")
	private List<String> onwerOpenIdList;

	/** 
	 * 适配id列表
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
	 * 总页数
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
