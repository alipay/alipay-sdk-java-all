package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构服务通知
 *
 * @author auto create
 * @since 1.0, 2022-11-24 19:57:16
 */
public class AlipayEbppInstserviceMessageNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8766517389775593184L;

	/**
	 * 余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账单日期等时间格式
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单机构缩写，广东移动，江苏电网，支付宝分配
	 */
	@ApiField("bill_inst")
	private String billInst;

	/**
	 * 如浙江电力，浙江移动等，支付宝分配
	 */
	@ApiField("bill_inst_desc")
	private String billInstDesc;

	/**
	 * 通知关键字，户号，手机号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 账单缴清截止日期
	 */
	@ApiField("bill_last_date")
	private String billLastDate;

	/**
	 * 通知流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单业务类型
	 */
	@ApiField("bill_type")
	private String billType;

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
	 * 通知功能码，支付宝分配
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 支付宝用户的open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 二级业务类型，话费，流量，水费，电费等
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 阀值金额，低额触发的阀值
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 用户地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

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

	public String getBillLastDate() {
		return this.billLastDate;
	}
	public void setBillLastDate(String billLastDate) {
		this.billLastDate = billLastDate;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
