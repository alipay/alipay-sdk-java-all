package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动指标查询
 *
 * @author auto create
 * @since 1.0, 2021-03-12 11:06:33
 */
public class KoubeiMarketingDataIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6496941847362445899L;

	/**
	 * 开始日期,格式:yyyyMMdd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 业务类型，可选值有八个
1，MemberQuery 商户会员数据查询
2，MemberQueryByStore 门店会员数据查询
3，TradeQuery 商户交易数据查询
4，TradeQueryByStore 门店交易数据查询
5，CampaignQuery 商户活动数据查询
6，CampaignQueryByStore 门店活动数据查询
7, ConponsQuery 商户券数据查询
8,ConponsQueryByStore 门店券数据查询
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束日期 格式:yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * camp_id：为活动ID
sort_field：为排序指标KEY
sort_type：ASC表示升序,DESC表示降序
store_Ids：为门店ID，多个门店使用逗号分隔
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页记录数,不能超过50，默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

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

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
