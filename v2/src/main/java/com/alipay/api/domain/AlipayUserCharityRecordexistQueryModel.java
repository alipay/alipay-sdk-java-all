package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询是否在支付宝公益捐赠的接口
 *
 * @author auto create
 * @since 1.0, 2022-10-25 21:06:13
 */
public class AlipayUserCharityRecordexistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8834251987648928315L;

	/**
	 * 公益的业务类型(缺省是所有类型)
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 捐赠记录的结束时间（默认是查询当前自然年一年的记录）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 支付宝用户user_id对应的open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 捐赠记录的开始时间（默认是查询当前自然年一年的记录）
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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
