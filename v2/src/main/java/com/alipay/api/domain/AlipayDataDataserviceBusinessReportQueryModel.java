package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生意参谋指定商圈-查看商圈报告
 *
 * @author auto create
 * @since 1.0, 2024-04-28 17:45:44
 */
public class AlipayDataDataserviceBusinessReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5388562647346647738L;

	/**
	 * 商圈内品牌排行榜的行业筛选条件;
填写请参考文档：
<a href="https://opendocs.alipay.com/pre-open/0bjxu7">行业信息</a>
	 */
	@ApiListField("brand_rank_industry_dto")
	@ApiField("business_industry_d_t_o")
	private List<BusinessIndustryDTO> brandRankIndustryDto;

	/**
	 * 商户授权码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 需要查询的商圈概况的指标的集合
	 */
	@ApiListField("metric_keys")
	@ApiField("string")
	private List<String> metricKeys;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 需要查询的商圈内画像的元素
	 */
	@ApiField("portrait_in_mall_dto")
	private PortraitInMallReqDTO portraitInMallDto;

	/**
	 * task_id即商圈分析任务创建后生成的任务的唯一标识
	 */
	@ApiField("task_id")
	private String taskId;

	public List<BusinessIndustryDTO> getBrandRankIndustryDto() {
		return this.brandRankIndustryDto;
	}
	public void setBrandRankIndustryDto(List<BusinessIndustryDTO> brandRankIndustryDto) {
		this.brandRankIndustryDto = brandRankIndustryDto;
	}

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public List<String> getMetricKeys() {
		return this.metricKeys;
	}
	public void setMetricKeys(List<String> metricKeys) {
		this.metricKeys = metricKeys;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public PortraitInMallReqDTO getPortraitInMallDto() {
		return this.portraitInMallDto;
	}
	public void setPortraitInMallDto(PortraitInMallReqDTO portraitInMallDto) {
		this.portraitInMallDto = portraitInMallDto;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
