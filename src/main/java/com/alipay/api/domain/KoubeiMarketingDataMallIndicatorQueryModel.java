package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户经营数据查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:53:07
 */
public class KoubeiMarketingDataMallIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2795738127639484632L;

	/**
	 * 开始日期,格式:yyyyMMdd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 业务类型，目前可选值有5个
1，mallIndustryMemberStatistics	商户会员统计信息
2，mallIndustryTradeStatistics	行业交易统计信息
3，mallIndustryEventStatistics	行业活动统计信息
4，mallIndustryInfo	最新的行业维表信息
5，mallIndustryConsumptionStatistics	MALL消费能力统计信息
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束日期,格式:yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * camp_id：为活动ID
order_by：为排序指标KEY，目前只支持文档中给出的例子字段
order_type：ASC表示升序,DESC表示降序
cate_1_ids：为门店ID，多个门店使用逗号分隔
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数,不能超过50。默认为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
