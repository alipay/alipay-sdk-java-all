package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约解决方案列表分页查询服务
 *
 * @author auto create
 * @since 1.0, 2023-05-18 15:29:16
 */
public class AlipayFinancialnetAuthEcsignSolutionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8363457963965864288L;

	/**
	 * 页，默认1，必须要大于0。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小，默认10。
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 解决方案码，唯一值，又创建时系统生成。
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 解决方案名称，非唯一值，有用户自行输入。
	 */
	@ApiField("solution_name")
	private String solutionName;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public String getSolutionName() {
		return this.solutionName;
	}
	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

}
