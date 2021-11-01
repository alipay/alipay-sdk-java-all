package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账关系查询
 *
 * @author auto create
 * @since 1.0, 2021-09-18 10:57:14
 */
public class AlipayTradeRoyaltyRelationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1364928125513417982L;

	/**
	 * 外部请求号，由商家自定义。32个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 几页，起始页为 1。不填默认为 1。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面大小。每页记录数，取值范围是(0,100]。不填默认为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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

}
