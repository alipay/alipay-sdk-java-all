package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景化商家营销活动详情信息对象
 *
 * @author auto create
 * @since 1.0, 2018-11-28 19:29:35
 */
public class MActivityDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1817641968627499937L;

	/**
	 * 口碑营销活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动当前状态信息，目前枚举值：草稿：CREATED、已生效：ENABLED、已启动：STARTED、已下架：CLOSED、已完成：FINISHED
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 活动是否需要自动续期
	 */
	@ApiField("auto_delay_flag")
	private Boolean autoDelayFlag;

	/**
	 * 活动所属场景，目前支持枚举类型：点餐场景：DISH、预点餐场景：PRE_DISH、菜单场景：MENU
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 创建人id
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 指定creator字段创建人类型，目前支持枚举：外部商户：MER、商户操作员：MER_OPERATOR、外部服务商：PROVIDER、外部服务商员工：PROVIDER_STAFF
	 */
	@ApiField("creator_type")
	private String creatorType;

	/**
	 * 活动描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 页面展示状态信息，查询结果返回Code码，目前支持code和对应说明：初始状态：CAMP_CREATED、待确认：CAMP_CONFIRM、已启用未开始：CAMP_TIME_YET、进行中：CAMP_GOING、活动修改中：CAMP_MODIFYING、活动下架中：CAMP_CLOSING、已下架：CAMP_ENDED、已结束：CAMP_EXPIRED、已驳回：CAMP_REJECTED
	 */
	@ApiField("display_status")
	private String displayStatus;

	/**
	 * 活动结束时间
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
	 * 活动外部业务类型，通过改类型指定营销活动是什么类型的活动，目前支持类型枚举值：会员券：MEMBER_CASH、会员折扣：MEMBER_RATE_DISCOUNT、会员价：MEMBER_DISH_ITEM
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 所属人，一般所属人为商户pid
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 指定owner_id所属人字段类型，目前支持枚举：外部商户：MER
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 营销活动玩法详细信息设置
	 */
	@ApiListField("promo_info_list")
	@ApiField("m_promo_info")
	private List<MPromoInfo> promoInfoList;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
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

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorType() {
		return this.creatorType;
	}
	public void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDisplayStatus() {
		return this.displayStatus;
	}
	public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
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

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
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
