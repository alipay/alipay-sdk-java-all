package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区三方待缴账单创建
 *
 * @author auto create
 * @since 1.0, 2025-07-15 16:12:33
 */
public class AlipayEbppCommunityThirdpartybillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1525513823938597716L;

	/**
	 * 待缴账单通知用户 Uid 
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 待缴费金额，正数 单位:分
如欠费 200.20 元，则传入 20020
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 账单详情地址 长度限制
	 */
	@ApiField("bill_detail_url")
	private String billDetailUrl;

	/**
	 * 账单结束时间
	 */
	@ApiField("bill_end_time")
	private Date billEndTime;

	/**
	 * 账单开始时间
	 */
	@ApiField("bill_start_time")
	private Date billStartTime;

	/**
	 * 待缴账单业务流水号
通过该字段幂等。 相同服务商下传入相同 bizNo 视为相同请求。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * T	业主绑定房间号。对应先前请求物业缴费插件时请求参数 communityRoomId
	 */
	@ApiField("community_room_id")
	private String communityRoomId;

	/**
	 * 待缴账单通知用户 Uid 对应的openUid
(与alipayUid对应)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 小区编号。对应三方生态小区同步接口请求参数的out_community_id。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBillDetailUrl() {
		return this.billDetailUrl;
	}
	public void setBillDetailUrl(String billDetailUrl) {
		this.billDetailUrl = billDetailUrl;
	}

	public Date getBillEndTime() {
		return this.billEndTime;
	}
	public void setBillEndTime(Date billEndTime) {
		this.billEndTime = billEndTime;
	}

	public Date getBillStartTime() {
		return this.billStartTime;
	}
	public void setBillStartTime(Date billStartTime) {
		this.billStartTime = billStartTime;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCommunityRoomId() {
		return this.communityRoomId;
	}
	public void setCommunityRoomId(String communityRoomId) {
		this.communityRoomId = communityRoomId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

}
