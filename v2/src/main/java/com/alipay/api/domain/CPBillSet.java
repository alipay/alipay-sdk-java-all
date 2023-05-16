package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业平台物业费账单数据集合
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:14:19
 */
public class CPBillSet extends AlipayObject {

	private static final long serialVersionUID = 6534427755225246884L;

	/**
	 * 明细条目所归属的账期，用于归类和向用户展示，具体参数值由物业系统自行定义，除参数最大长度外支付宝不做限定。
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 物业费账单应收明细条目ID，在同一小区内必须唯一，不同小区不做唯一性要求。
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 费用类型名称，根据物业系统定义传入，支付宝除参数最大长度外不做限定。
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 缴费截止日期，格式固定为YYYYMMDD。不能早于调用接口时的当前实际日期（北京时间）和出账日期。
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 物业系统端房屋编号，必须事先通过房屋信息上传接口上传到支付宝社区物业平台。
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 缴费明细条目关联ID。若物业系统业务约束上传的多条明细条目必须被一次同时支付，则对应的明细条目需传入同样的relate_id。
	 */
	@ApiField("relate_id")
	private String relateId;

	/**
	 * 出账日期，格式固定为YYYYMMDD。
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 缴费支付确认页显示给用户的提示确认信息，除房间名外的第二重校验信息，预防用户错缴。建议传入和缴费户相关的信息例如，可传入脱敏后的物业系统中的业主姓名，或其他相关信息。可选参数，不传则不展示。账单明细合并支付时，若部分账单明细的remark_str不同，则默认取第一条有remark_str值的账单明细进行展示。
	 */
	@ApiField("remark_str")
	private String remarkStr;

	/**
	 * 对应的房屋门牌地址。若开发者之前通过上传物业小区内部房屋信息接口中的address参数已上传，可不传。
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

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getRelateId() {
		return this.relateId;
	}
	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	public String getReleaseDay() {
		return this.releaseDay;
	}
	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	public String getRemarkStr() {
		return this.remarkStr;
	}
	public void setRemarkStr(String remarkStr) {
		this.remarkStr = remarkStr;
	}

	public String getRoomAddress() {
		return this.roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}

}
