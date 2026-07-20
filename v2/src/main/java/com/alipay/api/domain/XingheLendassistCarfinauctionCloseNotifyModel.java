package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关单接口
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:46:54
 */
public class XingheLendassistCarfinauctionCloseNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2637246318993216326L;

	/**
	 * 星河申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 关闭原因描述
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 关闭时间
	 */
	@ApiField("close_time")
	private Date closeTime;

	/**
	 * 关闭类型
	 */
	@ApiField("close_type")
	private String closeType;

	/**
	 * 外部订单号（阿里拍卖申请单号）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public Date getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	public String getCloseType() {
		return this.closeType;
	}
	public void setCloseType(String closeType) {
		this.closeType = closeType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
