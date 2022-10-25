package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赠险发放流水
 *
 * @author auto create
 * @since 1.0, 2019-04-23 11:37:54
 */
public class InsHealthSendFlowResult extends AlipayObject {

	private static final long serialVersionUID = 5585471592485364784L;

	/**
	 * 业务类型。HEALTH_BEAN_SIMPLE_UPGRADE 免费医疗金、HEALTH_DSDB_NEW_OUTPATIENT 多收多宝新门诊、HEALTH_GUARDIAN_GOLD 守护金
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 入口
	 */
	@ApiField("entrance")
	private String entrance;

	/**
	 * 发放时间
	 */
	@ApiField("offer_time")
	private Date offerTime;

	/**
	 * 发放流水的外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * COMMON_GIFT_INSURANCE_PRODUCT_GROUP 赠险通用产品组、CUSTOMER_GIFT_INSURANCE_PRODUCT_GROUP C端赠险产品组、BUSINESS_GIFT_INSURANCE_PRODUCT_GROUP B端赠险产品组、XHB_GIFT_INSURANCE_PRODUCT_GROUP 相互保赠险产品组
	 */
	@ApiField("product_group_biz_type")
	private String productGroupBizType;

	/**
	 * 发放保额
	 */
	@ApiField("product_sum_insured")
	private String productSumInsured;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 发放状态。0代表发放未领取，1代表发放已领取
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户支付宝UID
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

	public Date getOfferTime() {
		return this.offerTime;
	}
	public void setOfferTime(Date offerTime) {
		this.offerTime = offerTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductGroupBizType() {
		return this.productGroupBizType;
	}
	public void setProductGroupBizType(String productGroupBizType) {
		this.productGroupBizType = productGroupBizType;
	}

	public String getProductSumInsured() {
		return this.productSumInsured;
	}
	public void setProductSumInsured(String productSumInsured) {
		this.productSumInsured = productSumInsured;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
