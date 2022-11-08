package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活缴费机构消息通知
 *
 * @author auto create
 * @since 1.0, 2022-11-08 09:56:55
 */
public class AlipayEbppJfInstmessageNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1264791627927534111L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 账户余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 户号
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 外部业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展数据，json格式
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金额
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 机构编码
	 */
	@ApiField("inst")
	private String inst;

	/**
	 * 机构名字
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 机构发生时间
	 */
	@ApiField("inst_time")
	private String instTime;

	/**
	 * 组织代码，支付宝分配
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 账单金额
	 */
	@ApiField("owe_amount")
	private String oweAmount;

	/**
	 * 户名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 通知场景码，支付宝侧分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public String getInst() {
		return this.inst;
	}
	public void setInst(String inst) {
		this.inst = inst;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstTime() {
		return this.instTime;
	}
	public void setInstTime(String instTime) {
		this.instTime = instTime;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOweAmount() {
		return this.oweAmount;
	}
	public void setOweAmount(String oweAmount) {
		this.oweAmount = oweAmount;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
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
