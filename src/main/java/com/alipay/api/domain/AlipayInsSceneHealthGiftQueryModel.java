package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康险赠险权益查询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-21 10:55:43
 */
public class AlipayInsSceneHealthGiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1748424469944926246L;

	/**
	 * 查询某范围内某渠道领取的保额的止期，注意，只对sourceGainedSumInsured字段生效
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 赠险的产品组标识，例如免费医疗金的COMMON_GIFT_INSURANCE_PRODUCT_GROUP
	 */
	@ApiField("product_group_biz_type")
	private String productGroupBizType;

	/**
	 * 渠道来源，标识赠险的领取渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 查询某范围内某渠道领取的保额的起期，注意，只对sourceGainedSumInsured字段生效
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
