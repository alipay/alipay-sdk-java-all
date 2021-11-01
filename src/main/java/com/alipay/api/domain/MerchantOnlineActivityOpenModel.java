package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动信息
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:37:20
 */
public class MerchantOnlineActivityOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2194777863572114183L;

	/**
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 营销活动Id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动优惠次数限制
	 */
	@ApiField("count_limit")
	private Long countLimit;

	/**
	 * 活动优惠单日次数限制
	 */
	@ApiField("count_limit_per_day")
	private Long countLimitPerDay;

	/**
	 * 活动单用户限次
	 */
	@ApiField("count_limit_per_user")
	private Long countLimitPerUser;

	/**
	 * 活动单用户单日限次
	 */
	@ApiField("count_limit_per_user_per_day")
	private Long countLimitPerUserPerDay;

	/**
	 * 人群规则
DEFAULT：全部用户
ONLINE_NEWCOMER：在线购买新人
MEMBER：会员
	 */
	@ApiField("crowd")
	private String crowd;

	/**
	 * 代金券面额
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 外部Id
	 */
	@ApiField("external_unique_id")
	private String externalUniqueId;

	/**
	 * 活动结束时间
格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 活动开始时间，格式为:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 商品列表
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 使用门槛，满X元可用，使用门槛必须大于券面额
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 是否手动领取，本期只支持true
	 */
	@ApiField("obtain_manually")
	private Boolean obtainManually;

	/**
	 * 券信息
	 */
	@ApiField("voucher_info")
	private MerchantActivityVoucherInfo voucherInfo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public Long getCountLimit() {
		return this.countLimit;
	}
	public void setCountLimit(Long countLimit) {
		this.countLimit = countLimit;
	}

	public Long getCountLimitPerDay() {
		return this.countLimitPerDay;
	}
	public void setCountLimitPerDay(Long countLimitPerDay) {
		this.countLimitPerDay = countLimitPerDay;
	}

	public Long getCountLimitPerUser() {
		return this.countLimitPerUser;
	}
	public void setCountLimitPerUser(Long countLimitPerUser) {
		this.countLimitPerUser = countLimitPerUser;
	}

	public Long getCountLimitPerUserPerDay() {
		return this.countLimitPerUserPerDay;
	}
	public void setCountLimitPerUserPerDay(Long countLimitPerUserPerDay) {
		this.countLimitPerUserPerDay = countLimitPerUserPerDay;
	}

	public String getCrowd() {
		return this.crowd;
	}
	public void setCrowd(String crowd) {
		this.crowd = crowd;
	}

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getExternalUniqueId() {
		return this.externalUniqueId;
	}
	public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	public Boolean getObtainManually() {
		return this.obtainManually;
	}
	public void setObtainManually(Boolean obtainManually) {
		this.obtainManually = obtainManually;
	}

	public MerchantActivityVoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(MerchantActivityVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
