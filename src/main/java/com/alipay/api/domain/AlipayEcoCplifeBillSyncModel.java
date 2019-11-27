package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业费账单数据同步
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:10:28
 */
public class AlipayEcoCplifeBillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4582373766173427751L;

	/**
	 * 待同步的物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 支付宝社区物业平台小区ID，用户通过支付宝社区物业平台物业查询获取。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 指定条目待更新的缴费截止日期
若operate_type为update，该参数选填；
若operate_type为delete，该参数不用填。
	 */
	@ApiField("new_deadline")
	private String newDeadline;

	/**
	 * 指定条目待更新的应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
若operate_type为update，该参数选填；
若operate_type为delete，该参数不用填。
	 */
	@ApiField("new_entry_amount")
	private String newEntryAmount;

	/**
	 * 同步类型：
delete：删除
update：更改
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getBillEntryId() {
		return this.billEntryId;
	}
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getNewDeadline() {
		return this.newDeadline;
	}
	public void setNewDeadline(String newDeadline) {
		this.newDeadline = newDeadline;
	}

	public String getNewEntryAmount() {
		return this.newEntryAmount;
	}
	public void setNewEntryAmount(String newEntryAmount) {
		this.newEntryAmount = newEntryAmount;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
