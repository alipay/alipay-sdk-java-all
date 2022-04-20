package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动修改接口
 *
 * @author auto create
 * @since 1.0, 2018-04-16 17:49:48
 */
public class KoubeiMarketingCampaignActivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7295138241617464262L;

	/**
	 * 是否自动续期活动，仅当活动下券的有效期均为相对有效期时才能设置成Y
	 */
	@ApiField("auto_delay_flag")
	private String autoDelayFlag;

	/**
	 * 活动预算
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 活动id，通过 <a href="https://opendocs.alipay.com/apis/api_5/koubei.marketing.campaign.activity.create">koubei.marketing.campaign.activity.create</a>(活动创建接口)获取。
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动限制信息
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 活动详细说明。
 注意：本参数不允许修改，必须与  <a href="https://opendocs.alipay.com/apis/api_5/koubei.marketing.campaign.activity.query">koubei.marketing.campaign.activity.query</a>(活动详情查询)接口查询结果保持一致。
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动结束时间，格式为"yyyy-MM-dd HH:mm:ss"。
注意：活动结束时间只允许延长
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 活动名称。
注意：本参数不允许修改，必须与  <a href="https://opendocs.alipay.com/apis/api_5/koubei.marketing.campaign.activity.query">koubei.marketing.campaign.activity.query</a>(活动详情查询)接口查询结果保持一致。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型，不填默认为 MER（外部商户）。支持枚举值如下：
* MER：外部商户。
* MER_OPERATOR：外部商户操作员。
* PROVIDER：外部服务商。
* PROVIDER_STAFF：外部服务商员工。
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部批次ID。需保证同一账户下唯一，控制幂等。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 营销工具集
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道集，当活动类型为DIRECT_SEND或者REAL_TIME_SEND时必填，为CONSUME_SEND时必须为空
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 招商工具
	 */
	@ApiField("recruit_tool")
	private RecruitTool recruitTool;

	/**
	 * 活动开始时间，格式为"yyyy-MM-dd HH:mm:ss"。
注意：本参数不允许修改，必须与  <a href="https://opendocs.alipay.com/apis/api_5/koubei.marketing.campaign.activity.query">koubei.marketing.campaign.activity.query</a>(活动详情查询)接口查询结果保持一致。
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动类型。
 注意：本参数不允许修改，必须与  <a href="https://opendocs.alipay.com/apis/api_5/koubei.marketing.campaign.activity.query">koubei.marketing.campaign.activity.query</a>(活动详情查询)接口查询结果保持一致。
	 */
	@ApiField("type")
	private String type;

	public String getAutoDelayFlag() {
		return this.autoDelayFlag;
	}
	public void setAutoDelayFlag(String autoDelayFlag) {
		this.autoDelayFlag = autoDelayFlag;
	}

	public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}
	public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}
	public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}
	public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

	public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}
	public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}

	public RecruitTool getRecruitTool() {
		return this.recruitTool;
	}
	public void setRecruitTool(RecruitTool recruitTool) {
		this.recruitTool = recruitTool;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
