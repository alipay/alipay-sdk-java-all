package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公司列表查询返回结果
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class CompanyListQueryResult extends AlipayObject {

	private static final long serialVersionUID = 6696898617157511451L;

	/**
	 * 公司基础信息列表
	 */
	@ApiListField("company_base_model_list")
	@ApiField("company_base_v_o")
	private List<CompanyBaseVO> companyBaseModelList;

	/**
	 * 公司集合
	 */
	@ApiListField("data")
	@ApiField("corp_company_v_o")
	private List<CorpCompanyVO> data;

	/**
	 * 字段权限列表
	 */
	@ApiListField("field_info_list")
	@ApiField("string")
	private List<String> fieldInfoList;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 是否分页
	 */
	@ApiField("paging")
	private Boolean paging;

	/**
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public List<CompanyBaseVO> getCompanyBaseModelList() {
		return this.companyBaseModelList;
	}
	public void setCompanyBaseModelList(List<CompanyBaseVO> companyBaseModelList) {
		this.companyBaseModelList = companyBaseModelList;
	}

	public List<CorpCompanyVO> getData() {
		return this.data;
	}
	public void setData(List<CorpCompanyVO> data) {
		this.data = data;
	}

	public List<String> getFieldInfoList() {
		return this.fieldInfoList;
	}
	public void setFieldInfoList(List<String> fieldInfoList) {
		this.fieldInfoList = fieldInfoList;
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

	public Boolean getPaging() {
		return this.paging;
	}
	public void setPaging(Boolean paging) {
		this.paging = paging;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
