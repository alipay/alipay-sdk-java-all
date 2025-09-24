package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 荣耀优惠券信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:23:27
 */
public class HonorCouponDTO extends AlipayObject {

	private static final long serialVersionUID = 5848354156219293319L;

	/**
	 * 优惠券名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 优惠券id
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 优惠券类型，枚举值：
1：放款券；2：还款券
	 */
	@ApiField("coupon_type")
	private Long couponType;

	/**
	 * 券有效期结束时间，时间戳毫秒
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 领取时间，时间戳毫秒
	 */
	@ApiField("receive_time")
	private Long receiveTime;

	/**
	 * 券选中状态。0：未选中可选择；1：未选中不可选择；2：选中可取消；3：选中不可取消
	 */
	@ApiField("select_status")
	private Long selectStatus;

	/**
	 * 券有效期开始时间，时间戳毫秒
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 券状态，枚举值：
1-未使用
2-已使用
3-已过期
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 券不可用原因，不可用时必传，前端根据此字段判断优惠券是否置灰，不可选中
	 */
	@ApiField("unusable_reason")
	private String unusableReason;

	/**
	 * 使用规则列表，返回List<中文规则描述>
	 */
	@ApiListField("use_rules")
	@ApiField("string")
	private List<String> useRules;

	/**
	 * 使用时间，时间戳毫秒，已使用时必传
	 */
	@ApiField("used_time")
	private Long usedTime;

	public String getCouponName() {
		return this.couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponNo() {
		return this.couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public Long getCouponType() {
		return this.couponType;
	}
	public void setCouponType(Long couponType) {
		this.couponType = couponType;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Long receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Long getSelectStatus() {
		return this.selectStatus;
	}
	public void setSelectStatus(Long selectStatus) {
		this.selectStatus = selectStatus;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getUnusableReason() {
		return this.unusableReason;
	}
	public void setUnusableReason(String unusableReason) {
		this.unusableReason = unusableReason;
	}

	public List<String> getUseRules() {
		return this.useRules;
	}
	public void setUseRules(List<String> useRules) {
		this.useRules = useRules;
	}

	public Long getUsedTime() {
		return this.usedTime;
	}
	public void setUsedTime(Long usedTime) {
		this.usedTime = usedTime;
	}

}
