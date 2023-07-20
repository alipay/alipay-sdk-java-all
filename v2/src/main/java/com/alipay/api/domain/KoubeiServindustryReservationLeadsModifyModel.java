package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客资回传
 *
 * @author auto create
 * @since 1.0, 2022-04-27 17:07:23
 */
public class KoubeiServindustryReservationLeadsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5249537257111785467L;

	/**
	 * 实际到店时间：status_mark==CUSTOMER_ARRIVED时，gmt_arrived不能为空
	 */
	@ApiField("gmt_arrived")
	private Date gmtArrived;

	/**
	 * 预约到店时间：status_mark==CUSTOMER_ACCEPTED时，gmt_reserve不能为空
	 */
	@ApiField("gmt_reserve")
	private Date gmtReserve;

	/**
	 * 商家备注：和status_mark不能同时为空
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 预约记录ID
	 */
	@ApiField("reservation_record_id")
	private String reservationRecordId;

	/**
	 * 客资状态：和memo不能同时为空
PROCESSING("待跟进"),
CUSTOMER_ACCEPTED("待到店"),
CUSTOMER_ARRIVED("已到店"),
CUSTOMER_REJECTED("无意向"),
IN_BLACK_LIST("黑名单"),
	 */
	@ApiField("status_mark")
	private String statusMark;

	public Date getGmtArrived() {
		return this.gmtArrived;
	}
	public void setGmtArrived(Date gmtArrived) {
		this.gmtArrived = gmtArrived;
	}

	public Date getGmtReserve() {
		return this.gmtReserve;
	}
	public void setGmtReserve(Date gmtReserve) {
		this.gmtReserve = gmtReserve;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReservationRecordId() {
		return this.reservationRecordId;
	}
	public void setReservationRecordId(String reservationRecordId) {
		this.reservationRecordId = reservationRecordId;
	}

	public String getStatusMark() {
		return this.statusMark;
	}
	public void setStatusMark(String statusMark) {
		this.statusMark = statusMark;
	}

}
