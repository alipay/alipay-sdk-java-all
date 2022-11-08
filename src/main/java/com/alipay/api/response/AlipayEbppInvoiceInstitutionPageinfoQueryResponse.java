package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstitutionBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.pageinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-29 20:04:10
 */
public class AlipayEbppInvoiceInstitutionPageinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6147767935757236816L;

	/** 
	 * 制度基本信息列表
	 */
	@ApiListField("institution_basic_info_list")
	@ApiField("institution_basic_info")
	private List<InstitutionBasicInfo> institutionBasicInfoList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

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

	public void setInstitutionBasicInfoList(List<InstitutionBasicInfo> institutionBasicInfoList) {
		this.institutionBasicInfoList = institutionBasicInfoList;
	}
	public List<InstitutionBasicInfo> getInstitutionBasicInfoList( ) {
		return this.institutionBasicInfoList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
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
