package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantActivityVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:10:16
 */
public class KoubeiMarketingCampaignItemMerchantactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5269743755874827889L;

	/** 
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 营销活动id
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
	private Date gmtEnd;

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

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setCountLimit(Long countLimit) {
		this.countLimit = countLimit;
	}
	public Long getCountLimit( ) {
		return this.countLimit;
	}

	public void setCountLimitPerDay(Long countLimitPerDay) {
		this.countLimitPerDay = countLimitPerDay;
	}
	public Long getCountLimitPerDay( ) {
		return this.countLimitPerDay;
	}

	public void setCountLimitPerUser(Long countLimitPerUser) {
		this.countLimitPerUser = countLimitPerUser;
	}
	public Long getCountLimitPerUser( ) {
		return this.countLimitPerUser;
	}

	public void setCountLimitPerUserPerDay(Long countLimitPerUserPerDay) {
		this.countLimitPerUserPerDay = countLimitPerUserPerDay;
	}
	public Long getCountLimitPerUserPerDay( ) {
		return this.countLimitPerUserPerDay;
	}

	public void setCrowd(String crowd) {
		this.crowd = crowd;
	}
	public String getCrowd( ) {
		return this.crowd;
	}

	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}
	public String getDeductAmount( ) {
		return this.deductAmount;
	}

	public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}
	public String getExternalUniqueId( ) {
		return this.externalUniqueId;
	}

	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public Date getGmtEnd( ) {
		return this.gmtEnd;
	}

	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}
	public String getGmtStart( ) {
		return this.gmtStart;
	}

	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}
	public List<String> getItemIds( ) {
		return this.itemIds;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}
	public String getMinCost( ) {
		return this.minCost;
	}

	public void setObtainManually(Boolean obtainManually) {
		this.obtainManually = obtainManually;
	}
	public Boolean getObtainManually( ) {
		return this.obtainManually;
	}

	public void setVoucherInfo(MerchantActivityVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}
	public MerchantActivityVoucherInfo getVoucherInfo( ) {
		return this.voucherInfo;
	}

}
