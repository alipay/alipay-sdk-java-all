package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销-活动账单批量查询
 *
 * @author auto create
 * @since 1.0, 2024-04-25 15:01:02
 */
public class AnttechMorseMarketingBillsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3349433593367429132L;

	/**
	 * 业务唯一标识码，摩斯侧分配
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 分页查询当前页数，取值区间：[1,无穷]，查询页没有值则标识后期没有数据可以不用再查询了
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询每页的个数，默认10条，取值区间：[1,50]，不在这个区间内，采用默认条数10.
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询对象的交易日期，格式为yyyyMMdd
	 */
	@ApiField("pay_date")
	private String payDate;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

}
