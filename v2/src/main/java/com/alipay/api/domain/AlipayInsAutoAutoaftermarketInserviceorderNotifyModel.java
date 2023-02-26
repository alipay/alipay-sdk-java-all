package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务使用过程中状态同步
 *
 * @author auto create
 * @since 1.0, 2019-10-23 21:29:32
 */
public class AlipayInsAutoAutoaftermarketInserviceorderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5253652738446213169L;

	/**
	 * 蚂蚁服务申请单号
	 */
	@ApiField("ant_ser_apply_no")
	private String antSerApplyNo;

	/**
	 * 业务状态变更时间。
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("event_time")
	private Date eventTime;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("extra")
	private String extra;

	/**
	 * 机构服务申请单号
	 */
	@ApiField("inst_ser_apply_no")
	private String instSerApplyNo;

	/**
	 * 如果是确认维修项，则该字段必传
	 */
	@ApiListField("repair_item")
	@ApiField("repair_item")
	private List<RepairItem> repairItem;

	/**
	 * ARRIVED_DEPOT("ARRIVED_DEPOT", "已到店"),
NOT_ARRIVE_DEPOT("NOT_ARRIVE_DEPOT", "未到店"),
REPAIR_ABANDON("REPAIR_ABANDON", "已放弃修理"),
REPAIRING("REPAIRING", "修理中"),
REPAIR_COMPLETED("REPAIR_COMPLETED", "维修完成"),
DEPOT_CONFIRMED_REPAIR_ITEM("DEPOT_CONFIRMED_REPAIR_ITEM", "修理厂已确认维修项");
	 */
	@ApiField("status")
	private String status;

	public String getAntSerApplyNo() {
		return this.antSerApplyNo;
	}
	public void setAntSerApplyNo(String antSerApplyNo) {
		this.antSerApplyNo = antSerApplyNo;
	}

	public Date getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getExtra() {
		return this.extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getInstSerApplyNo() {
		return this.instSerApplyNo;
	}
	public void setInstSerApplyNo(String instSerApplyNo) {
		this.instSerApplyNo = instSerApplyNo;
	}

	public List<RepairItem> getRepairItem() {
		return this.repairItem;
	}
	public void setRepairItem(List<RepairItem> repairItem) {
		this.repairItem = repairItem;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
