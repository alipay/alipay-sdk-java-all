package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动限制信息，比如活动限定参与的门店，限定参与的人群，或用户每天限定参与的次数等
 *
 * @author auto create
 * @since 1.0, 2019-01-28 10:52:33
 */
public class MPromoConstraint extends AlipayObject {

	private static final long serialVersionUID = 5238887772564896116L;

	/**
	 * 人群类型，仅当need_crowd_flag=true时生效，支持枚举取值: 商户门店会员：MERCHANT_SHOP_MEMBER
	 */
	@ApiField("crowd_type")
	private String crowdType;

	/**
	 * 人群对应的值，如crowd_type='MERCHANT_SHOP_MEMBER'时，如需设置会员等级人群类型,该值需要设置,注意:设置等级人群时,适用门店只能绑定同一个会员模板;
	 */
	@ApiListField("member_levels")
	@ApiField("m_member_level")
	private List<MMemberLevel> memberLevels;

	/**
	 * 活动是否设置人群信息标识
	 */
	@ApiField("need_crowd_flag")
	private Boolean needCrowdFlag;

	/**
	 * 描述用户在某个周期内限制参与的次数；目前仅支持维度天维度：D
	 */
	@ApiField("sub_dimension")
	private String subDimension;

	/**
	 * 描述用户在指定周期(sub_dimension)维度内,可参与的次数;取值范围1~99,-1为不限制
	 */
	@ApiField("sub_win_count")
	private String subWinCount;

	/**
	 * 活动适用的门店集合;最大支持10000个非重复门店Id
	 */
	@ApiListField("suit_shop_ids")
	@ApiField("string")
	private List<String> suitShopIds;

	/**
	 * 用户在整个活动期间参与的总次数;取值范围1~99,取值-1为不限制
	 */
	@ApiField("total_win_count")
	private String totalWinCount;

	public String getCrowdType() {
		return this.crowdType;
	}
	public void setCrowdType(String crowdType) {
		this.crowdType = crowdType;
	}

	public List<MMemberLevel> getMemberLevels() {
		return this.memberLevels;
	}
	public void setMemberLevels(List<MMemberLevel> memberLevels) {
		this.memberLevels = memberLevels;
	}

	public Boolean getNeedCrowdFlag() {
		return this.needCrowdFlag;
	}
	public void setNeedCrowdFlag(Boolean needCrowdFlag) {
		this.needCrowdFlag = needCrowdFlag;
	}

	public String getSubDimension() {
		return this.subDimension;
	}
	public void setSubDimension(String subDimension) {
		this.subDimension = subDimension;
	}

	public String getSubWinCount() {
		return this.subWinCount;
	}
	public void setSubWinCount(String subWinCount) {
		this.subWinCount = subWinCount;
	}

	public List<String> getSuitShopIds() {
		return this.suitShopIds;
	}
	public void setSuitShopIds(List<String> suitShopIds) {
		this.suitShopIds = suitShopIds;
	}

	public String getTotalWinCount() {
		return this.totalWinCount;
	}
	public void setTotalWinCount(String totalWinCount) {
		this.totalWinCount = totalWinCount;
	}

}
