package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景化商家营销活动修改
 *
 * @author auto create
 * @since 1.0, 2022-06-29 10:45:37
 */
public class KoubeiMarketingCampaignMerchantActivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1439448413687516888L;

	/**
	 * 活动ActivityId
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动是否需要自动续期(已废弃)
	 */
	@ApiField("auto_delay_flag")
	private Boolean autoDelayFlag;

	/**
	 * 活动所属场景，只支持单个场景，目前支持枚举类型：点餐场景：DISH、预点餐场景：PRE_DISH、菜单场景：MENU
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 营销活动描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动结束时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 扩展信息数据，如需要透传信息到口碑，需要结果带回，则传递该值
	 */
	@ApiListField("ext_info")
	@ApiField("m_ext_info")
	private List<MExtInfo> extInfo;

	/**
	 * 营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 指定operator字段操作人类型，目前支持枚举：外部商户：MER、商户操作员：MER_OPERATOR、外部服务商：PROVIDER、外部服务商员工：PROVIDER_STAFF
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 活动外部业务类型，通过改类型指定营销活动是什么类型的活动，目前支持类型枚举值：会员券：MEMBER_CASH、会员折扣：MEMBER_RATE_DISCOUNT、会员价：MEMBER_DISH_ITEM
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 营销活动玩法详细信息设置
	 */
	@ApiListField("promo_info_list")
	@ApiField("m_promo_info")
	private List<MPromoInfo> promoInfoList;

	/**
	 * 活动开始时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Boolean getAutoDelayFlag() {
		return this.autoDelayFlag;
	}
	public void setAutoDelayFlag(Boolean autoDelayFlag) {
		this.autoDelayFlag = autoDelayFlag;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public List<MExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<MExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<MPromoInfo> getPromoInfoList() {
		return this.promoInfoList;
	}
	public void setPromoInfoList(List<MPromoInfo> promoInfoList) {
		this.promoInfoList = promoInfoList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
