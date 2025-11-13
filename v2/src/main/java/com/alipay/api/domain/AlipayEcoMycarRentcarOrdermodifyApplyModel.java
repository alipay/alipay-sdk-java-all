package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车商户侧续租申请
 *
 * @author auto create
 * @since 1.0, 2024-09-18 14:13:52
 */
public class AlipayEcoMycarRentcarOrdermodifyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2748198599464947112L;

	/**
	 * 修改后租期的结束时间。目前仅支持续租。例如原始订单租期是1号~2号，续租1天，修改后租期就是1号~3号，结束时间修改为3号
	 */
	@ApiField("modified_end_time")
	private Date modifiedEndTime;

	/**
	 * 修改后租期的开始时间。目前仅支持续租。例如原始订单租期是1号~2号，续租1天，修改后租期就是1号~3号，开始时间仍然是1号
	 */
	@ApiField("modified_start_time")
	private Date modifiedStartTime;

	/**
	 * 支付宝用户开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 发起修改订单的租车单的商户侧订单号
	 */
	@ApiField("parent_out_order_no")
	private String parentOutOrderNo;

	/**
	 * 修改订单后需要用户支付的费用总金额，单位分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public Date getModifiedEndTime() {
		return this.modifiedEndTime;
	}
	public void setModifiedEndTime(Date modifiedEndTime) {
		this.modifiedEndTime = modifiedEndTime;
	}

	public Date getModifiedStartTime() {
		return this.modifiedStartTime;
	}
	public void setModifiedStartTime(Date modifiedStartTime) {
		this.modifiedStartTime = modifiedStartTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getParentOutOrderNo() {
		return this.parentOutOrderNo;
	}
	public void setParentOutOrderNo(String parentOutOrderNo) {
		this.parentOutOrderNo = parentOutOrderNo;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
