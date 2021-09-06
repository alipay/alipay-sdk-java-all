package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户生效赠险查询结果
 *
 * @author auto create
 * @since 1.0, 2019-04-23 11:37:54
 */
public class InsHealthGiftBatchValidGiftResult extends AlipayObject {

	private static final long serialVersionUID = 4242223463583533783L;

	/**
	 * 赠险业务标志

HEALTH_BEAN_SIMPLE_UPGRADE 免费医疗金、HEALTH_GUARDIAN_GOLD 守护金、HEALTH_DSDB_NEW_OUTPATIENT 多收多宝新门诊
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 最新保单号码
	 */
	@ApiField("latest_policy_no")
	private String latestPolicyNo;

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
	 * 赠险标准产品编号。6349免费医疗金、6325多收多宝门诊、7169守护金
	 */
	@ApiField("sp_no")
	private String spNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getLatestPolicyNo() {
		return this.latestPolicyNo;
	}
	public void setLatestPolicyNo(String latestPolicyNo) {
		this.latestPolicyNo = latestPolicyNo;
	}

	public String getProductGroupBizType() {
		return this.productGroupBizType;
	}
	public void setProductGroupBizType(String productGroupBizType) {
		this.productGroupBizType = productGroupBizType;
	}

	public String getSpNo() {
		return this.spNo;
	}
	public void setSpNo(String spNo) {
		this.spNo = spNo;
	}

}
