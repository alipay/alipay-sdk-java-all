package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告权益创建接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:41
 */
public class AlipayCommerceRetailBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8745339944253393782L;

	/**
	 * 广告投放活动
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动规则
	 */
	@ApiField("activity_rule")
	private String activityRule;

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
	 * 活动分类
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 品牌Logo图片
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
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 投放人员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 幂等号，要保证唯一
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 投放优先级，数字越大，越优先投放
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
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityRule() {
		return this.activityRule;
	}
	public void setActivityRule(String activityRule) {
		this.activityRule = activityRule;
	}

	public List<String> getActivityScopeList() {
		return this.activityScopeList;
	}
	public void setActivityScopeList(List<String> activityScopeList) {
		this.activityScopeList = activityScopeList;
	}

	public String getActivitySource() {
		return this.activitySource;
	}
	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getBrandLogoImage() {
		return this.brandLogoImage;
	}
	public void setBrandLogoImage(String brandLogoImage) {
		this.brandLogoImage = brandLogoImage;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getEnInfo() {
		return this.enInfo;
	}
	public void setEnInfo(String enInfo) {
		this.enInfo = enInfo;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public List<String> getPrizeInfos() {
		return this.prizeInfos;
	}
	public void setPrizeInfos(List<String> prizeInfos) {
		this.prizeInfos = prizeInfos;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
