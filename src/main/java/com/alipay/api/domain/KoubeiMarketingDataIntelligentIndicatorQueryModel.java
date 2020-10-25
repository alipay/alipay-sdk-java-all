package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销方案维度的数据查询
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:13
 */
public class KoubeiMarketingDataIntelligentIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2388759818272992656L;

	/**
	 * 业务类型。1.PlanQuery 智能方案效果查询；2.PlanQueryByStore 智能营销方案门店效果查询
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * promo_id：为智能活动的id，当bizType= ‘PlanQuery'和bizType= ‘PlanQueryByStore'取这里的值；
sort_field：为排序指标KEY
sort_type：ASC表示升序,DESC表示降序
store_Ids：为门店ID，多个门店使用逗号分隔
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作人信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，请保持足够的复杂，方便数据来源排查
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 获取的报告时间,格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("report_date")
	private Date reportDate;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Date getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

}
