package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构服务通知
 *
 * @author auto create
 * @since 1.0, 2020-04-09 16:03:22
 */
public class AlipayEbppInstserviceMessageNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5269645182711239356L;

	/**
	 * 账单机构缩写，广东移动，江苏电网
	 */
	@ApiField("bill_inst")
	private String billInst;

	/**
	 * 如浙江电力，浙江移动等
	 */
	@ApiField("bill_inst_desc")
	private String billInstDesc;

	/**
	 * 通知关键字，户号，手机号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型，通信，缴费，还款等动帐服务通知
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 标准kv，json数据
	 */
	@ApiField("extend_data")
	private String extendData;

	/**
	 * 通知时间
	 */
	@ApiField("notify_date")
	private String notifyDate;

	/**
	 * 通知描述
	 */
	@ApiField("notify_desc")
	private String notifyDesc;

	/**
	 * 通知功能码
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 二级业务类型，话费，流量，水费，电费等
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillInst() {
		return this.billInst;
	}
	public void setBillInst(String billInst) {
		this.billInst = billInst;
	}

	public String getBillInstDesc() {
		return this.billInstDesc;
	}
	public void setBillInstDesc(String billInstDesc) {
		this.billInstDesc = billInstDesc;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendData() {
		return this.extendData;
	}
	public void setExtendData(String extendData) {
		this.extendData = extendData;
	}

	public String getNotifyDate() {
		return this.notifyDate;
	}
	public void setNotifyDate(String notifyDate) {
		this.notifyDate = notifyDate;
	}

	public String getNotifyDesc() {
		return this.notifyDesc;
	}
	public void setNotifyDesc(String notifyDesc) {
		this.notifyDesc = notifyDesc;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
