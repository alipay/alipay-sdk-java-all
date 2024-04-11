package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询理赔进度
 *
 * @author auto create
 * @since 1.0, 2023-07-28 17:48:14
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimProgBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3517436758325153435L;

	/**
	 * current_page+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * data_key+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * is_submit+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值([{"value": "0","name": "未提交申请"},{"value": "1","name": "已经提交申请"},{"value": "2","name": "供应商已收到数据"}])+员工申请理赔+特殊说明(无)
	 */
	@ApiField("is_submit")
	private Long isSubmit;

	/**
	 * page_size+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public Long getIsSubmit() {
		return this.isSubmit;
	}
	public void setIsSubmit(Long isSubmit) {
		this.isSubmit = isSubmit;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
