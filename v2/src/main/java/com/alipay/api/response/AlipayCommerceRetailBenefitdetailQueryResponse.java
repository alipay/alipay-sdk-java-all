package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:41
 */
public class AlipayCommerceRetailBenefitdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6189599914516924213L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动规则
	 */
	@ApiField("activity_rule")
	private String activityRule;

	/** 
	 * 活动规则描述
	 */
	@ApiField("activity_rule_desc")
	private String activityRuleDesc;

	/** 
	 * null
	 */
	@ApiListField("activity_scope_list")
	@ApiField("string")
	private List<String> activityScopeList;

	/** 
	 * 活动来源
	 */
	@ApiField("activity_source")
	private String activitySource;

	/** 
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/** 
	 * 品牌权益图片
	 */
	@ApiField("brand_image")
	private String brandImage;

	/** 
	 * 品牌logo图片
	 */
	@ApiField("brand_logo_image")
	private String brandLogoImage;

	/** 
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 信息
	 */
	@ApiField("en_info")
	private String enInfo;

	/** 
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 操作员信息
	 */
	@ApiField("operator")
	private String operator;

	/** 
	 * 投放优先级
	 */
	@ApiField("priority")
	private Long priority;

	/** 
	 * null
	 */
	@ApiListField("prize_infos")
	@ApiField("string")
	private List<String> prizeInfos;

	/** 
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 活动status
	 */
	@ApiField("status")
	private String status;

	/** 
	 * null
	 */
	@ApiListField("verify_tester")
	@ApiField("string")
	private List<String> verifyTester;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setActivityRule(String activityRule) {
		this.activityRule = activityRule;
	}
	public String getActivityRule( ) {
		return this.activityRule;
	}

	public void setActivityRuleDesc(String activityRuleDesc) {
		this.activityRuleDesc = activityRuleDesc;
	}
	public String getActivityRuleDesc( ) {
		return this.activityRuleDesc;
	}

	public void setActivityScopeList(List<String> activityScopeList) {
		this.activityScopeList = activityScopeList;
	}
	public List<String> getActivityScopeList( ) {
		return this.activityScopeList;
	}

	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}
	public String getActivitySource( ) {
		return this.activitySource;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getActivityType( ) {
		return this.activityType;
	}

	public void setBrandImage(String brandImage) {
		this.brandImage = brandImage;
	}
	public String getBrandImage( ) {
		return this.brandImage;
	}

	public void setBrandLogoImage(String brandLogoImage) {
		this.brandLogoImage = brandLogoImage;
	}
	public String getBrandLogoImage( ) {
		return this.brandLogoImage;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setEnInfo(String enInfo) {
		this.enInfo = enInfo;
	}
	public String getEnInfo( ) {
		return this.enInfo;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator( ) {
		return this.operator;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}
	public Long getPriority( ) {
		return this.priority;
	}

	public void setPrizeInfos(List<String> prizeInfos) {
		this.prizeInfos = prizeInfos;
	}
	public List<String> getPrizeInfos( ) {
		return this.prizeInfos;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVerifyTester(List<String> verifyTester) {
		this.verifyTester = verifyTester;
	}
	public List<String> getVerifyTester( ) {
		return this.verifyTester;
	}

}
