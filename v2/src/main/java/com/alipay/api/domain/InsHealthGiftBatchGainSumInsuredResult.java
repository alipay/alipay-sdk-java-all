package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康险赠险待领取权益，目前包含待领取保额，准入
 *
 * @author auto create
 * @since 1.0, 2019-04-23 11:37:54
 */
public class InsHealthGiftBatchGainSumInsuredResult extends AlipayObject {

	private static final long serialVersionUID = 7454642361749374143L;

	/**
	 * 是否准入。true标识准入，false标识不准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/**
	 * 赠险业务标志

HEALTH_BEAN_SIMPLE_UPGRADE 免费医疗金、HEALTH_GUARDIAN_GOLD 守护金、HEALTH_DSDB_NEW_OUTPATIENT 多收多宝新门诊
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 本次可领取保额
	 */
	@ApiField("delta_sum_insured")
	private String deltaSumInsured;

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

	public Boolean getAdmit() {
		return this.admit;
	}
	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDeltaSumInsured() {
		return this.deltaSumInsured;
	}
	public void setDeltaSumInsured(String deltaSumInsured) {
		this.deltaSumInsured = deltaSumInsured;
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

}
