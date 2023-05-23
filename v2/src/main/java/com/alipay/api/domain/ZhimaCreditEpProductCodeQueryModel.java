package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用企业征信产品推广码查询业务明细
 *
 * @author auto create
 * @since 1.0, 2021-03-30 15:10:54
 */
public class ZhimaCreditEpProductCodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7518959166827945748L;

	/**
	 * 二维码唯一标识id
	 */
	@ApiField("code_id")
	private String codeId;

	/**
	 * 查询结束日期，与开始日期为左闭右闭
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 页码序号，默认从1开始，每页默认为最多300条记录
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 查询开始日期，与结束日期为左闭右闭
	 */
	@ApiField("start_date")
	private String startDate;

	public String getCodeId() {
		return this.codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
