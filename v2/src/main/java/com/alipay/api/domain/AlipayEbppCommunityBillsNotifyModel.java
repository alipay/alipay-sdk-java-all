package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新一方待缴账单创建
 *
 * @author auto create
 * @since 1.0, 2026-10-16 15:30:49
 */
public class AlipayEbppCommunityBillsNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8253894476473673145L;

	/**
	 * 待缴费金额，正数 单位:分 如欠费 200.20 元，则传入 20020
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("remote_external_bill_detail")
	private List<RemoteExternalBillDetail> billList;

	/**
	 * 根据账单类型区分不同的消息模板
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 小区短名
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 待缴费计算结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 待缴账单通知用户 Uid 对应的openUid (与alipayUid对应)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部户号
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 待缴费计算起始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 待缴账单通知用户 Uid
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public List<RemoteExternalBillDetail> getBillList() {
		return this.billList;
	}
	public void setBillList(List<RemoteExternalBillDetail> billList) {
		this.billList = billList;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
