package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业ETC车辆行程查询
 *
 * @author auto create
 * @since 1.0, 2024-06-10 16:53:51
 */
public class AlipayCommerceTransportEtcenterpriseTripQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5671334762212561784L;

	/**
	 * 支付宝企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 企业侧车辆编号
	 */
	@ApiField("corp_vehicle_id")
	private String corpVehicleId;

	/**
	 * 行程查询结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 0：蓝； 1：黄； 2：黑； 3：白； 4：渐变绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 行程查询开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 企业运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpVehicleId() {
		return this.corpVehicleId;
	}
	public void setCorpVehicleId(String corpVehicleId) {
		this.corpVehicleId = corpVehicleId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
