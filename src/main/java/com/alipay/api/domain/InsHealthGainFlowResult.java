package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赠险领取流水
 *
 * @author auto create
 * @since 1.0, 2019-04-23 11:37:54
 */
public class InsHealthGainFlowResult extends AlipayObject {

	private static final long serialVersionUID = 1647148979426343894L;

	/**
	 * 业务类型。免费医疗金 HEALTH_BEAN_SIMPLE_UPGRADE、守护金 HEALTH_GUARDIAN_GOLD、多收多宝新门诊 HEALTH_DSDB_NEW_OUTPATIENT
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 入口
	 */
	@ApiField("entrance")
	private String entrance;

	/**
	 * 保额新值
	 */
	@ApiField("new_sum_insured")
	private String newSumInsured;

	/**
	 * 领取时间
	 */
	@ApiField("offer_time")
	private Date offerTime;

	/**
	 * 保额旧值
	 */
	@ApiField("old_sum_insured")
	private String oldSumInsured;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 赠险产品组类型。
赠险通用产品组 COMMON_GIFT_INSURANCE_PRODUCT_GROUP、
C端赠险产品组 CUSTOMER_GIFT_INSURANCE_PRODUCT_GROUP、
B端赠险产品组 BUSINESS_GIFT_INSURANCE_PRODUCT_GROUP、
相互保赠险产品组 XHB_GIFT_INSURANCE_PRODUCT_GROUP
	 */
	@ApiField("product_group_biz_type")
	private String productGroupBizType;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 标准产品编号。7169 守护金，6325 多收多宝门诊，6349 免费医疗金
	 */
	@ApiField("sp_no")
	private String spNo;

	/**
	 * 支付宝用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEntrance() {
		return this.entrance;
	}
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

	public String getNewSumInsured() {
		return this.newSumInsured;
	}
	public void setNewSumInsured(String newSumInsured) {
		this.newSumInsured = newSumInsured;
	}

	public Date getOfferTime() {
		return this.offerTime;
	}
	public void setOfferTime(Date offerTime) {
		this.offerTime = offerTime;
	}

	public String getOldSumInsured() {
		return this.oldSumInsured;
	}
	public void setOldSumInsured(String oldSumInsured) {
		this.oldSumInsured = oldSumInsured;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProductGroupBizType() {
		return this.productGroupBizType;
	}
	public void setProductGroupBizType(String productGroupBizType) {
		this.productGroupBizType = productGroupBizType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSpNo() {
		return this.spNo;
	}
	public void setSpNo(String spNo) {
		this.spNo = spNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
