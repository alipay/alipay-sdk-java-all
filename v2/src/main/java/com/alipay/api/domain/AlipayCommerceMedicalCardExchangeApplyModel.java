package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作商兑换券码和兑换页链接
 *
 * @author auto create
 * @since 1.0, 2025-09-29 23:05:20
 */
public class AlipayCommerceMedicalCardExchangeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8857788419825368529L;

	/**
	 * 申请数量，单位是个
	 */
	@ApiField("apply_sum")
	private Long applySum;

	/**
	 * 申请券码时间，毫秒级时间戳 当前字段已废弃(可以通过逻辑查询得到)
	 */
	@ApiField("apply_time")
	@Deprecated
	private Long applyTime;

	/**
	 * 权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 外部唯一单号不能为空
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 合作方式
	 */
	@ApiField("cooperate_mode")
	private String cooperateMode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getApplySum() {
		return this.applySum;
	}
	public void setApplySum(Long applySum) {
		this.applySum = applySum;
	}

	public Long getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCooperateMode() {
		return this.cooperateMode;
	}
	public void setCooperateMode(String cooperateMode) {
		this.cooperateMode = cooperateMode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
