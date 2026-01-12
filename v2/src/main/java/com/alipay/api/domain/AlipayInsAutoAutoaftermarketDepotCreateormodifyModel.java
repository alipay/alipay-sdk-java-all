package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商将修理厂信息同步至车险
 *
 * @author auto create
 * @since 1.0, 2019-11-18 18:22:54
 */
public class AlipayInsAutoAutoaftermarketDepotCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 8556365753353429828L;

	/**
	 * 操作类型:
ONLINE-上线，
OFFLINE-下线，
UPDATE-修改修理厂信息（如修改修理厂名称，修理厂某几天的库存）
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 营业结束时间，格式:HH:MM
	 */
	@ApiField("business_end_time")
	private String businessEndTime;

	/**
	 * 开始营业时间，格式HH:MM
	 */
	@ApiField("business_start_time")
	private String businessStartTime;

	/**
	 * 需要更新库存的日期:
如果需要修改某几天的库存，该字段必传，若该字段不传，则默认修改所有的库存
格式:yyyy-MM-dd
	 */
	@ApiListField("calendars")
	@ApiField("string")
	private List<String> calendars;

	/**
	 * 修理厂支付宝账号，用于后续结算线上化
	 */
	@ApiField("depot_account")
	private String depotAccount;

	/**
	 * 修理厂详细地址
	 */
	@ApiField("depot_address")
	private String depotAddress;

	/**
	 * 服务商侧的修理厂id，需要唯一
	 */
	@ApiField("depot_id")
	private String depotId;

	/**
	 * 修理厂名称
	 */
	@ApiField("depot_name")
	private String depotName;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("extra")
	private String extra;

	/**
	 * 修理厂联系方式
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 修理厂维修范围，json格式
	 */
	@ApiField("repair_scope")
	private String repairScope;

	/**
	 * 修理厂每日可修数量
	 */
	@ApiField("threshold")
	private Long threshold;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBusinessEndTime() {
		return this.businessEndTime;
	}
	public void setBusinessEndTime(String businessEndTime) {
		this.businessEndTime = businessEndTime;
	}

	public String getBusinessStartTime() {
		return this.businessStartTime;
	}
	public void setBusinessStartTime(String businessStartTime) {
		this.businessStartTime = businessStartTime;
	}

	public List<String> getCalendars() {
		return this.calendars;
	}
	public void setCalendars(List<String> calendars) {
		this.calendars = calendars;
	}

	public String getDepotAccount() {
		return this.depotAccount;
	}
	public void setDepotAccount(String depotAccount) {
		this.depotAccount = depotAccount;
	}

	public String getDepotAddress() {
		return this.depotAddress;
	}
	public void setDepotAddress(String depotAddress) {
		this.depotAddress = depotAddress;
	}

	public String getDepotId() {
		return this.depotId;
	}
	public void setDepotId(String depotId) {
		this.depotId = depotId;
	}

	public String getDepotName() {
		return this.depotName;
	}
	public void setDepotName(String depotName) {
		this.depotName = depotName;
	}

	public String getExtra() {
		return this.extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRepairScope() {
		return this.repairScope;
	}
	public void setRepairScope(String repairScope) {
		this.repairScope = repairScope;
	}

	public Long getThreshold() {
		return this.threshold;
	}
	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}

}
