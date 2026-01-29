package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销-标准化活动账单数据批量查询
 *
 * @author auto create
 * @since 1.0, 2024-08-27 21:39:15
 */
public class AnttechMorseMarketingDataBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6363845588743235462L;

	/**
	 * 业务唯一标识码，摩斯侧分配，空时查询所有biz_code
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 查询账单的数据类型，对账明细和转化明细
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 分页查询当前页数，取值区间：[1,100000]，查询页没有值则标识后期没有数据可以不用再查询了，单位页
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页查询每页的个数，默认100条，取值区间：[1,300]，不在这个区间内，采用默认条数100，单位条
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

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
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
