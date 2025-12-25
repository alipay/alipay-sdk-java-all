package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业平台待修改的物业费账单数据集合
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:15:11
 */
public class CPBillModifySet extends AlipayObject {

	private static final long serialVersionUID = 7824435139966732292L;

	/**
	 * 若账期需修改，则传入。账期用于缴费明细页归类和展示，可以使用不超过16个字符的有业务含义的字符串。
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 若应收金额需修改，则传入，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 待修改的物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 若费用类型需修改，则传入
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 若缴费截止日期需修改，则传入。格式固定为YYYYMMDD
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 若出账日期需修改，则传入，格式固定为YYYYMMDD
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 若房屋门牌地址需要修改，则传入该值
	 */
	@ApiField("room_address")
	private String roomAddress;

	public String getAcctPeriod() {
		return this.acctPeriod;
	}
	public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

	public String getBillEntryAmount() {
		return this.billEntryAmount;
	}
	public void setBillEntryAmount(String billEntryAmount) {
		this.billEntryAmount = billEntryAmount;
	}

	public String getBillEntryId() {
		return this.billEntryId;
	}
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

	public String getCostType() {
		return this.costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}

	public String getDeadline() {
		return this.deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getReleaseDay() {
		return this.releaseDay;
	}
	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	public String getRoomAddress() {
		return this.roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}

}
