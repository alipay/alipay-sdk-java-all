package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆更新数据对象，主要更新 status 和 price 字段
 *
 * @author auto create
 * @since 1.0, 2024-10-22 10:40:19
 */
public class TransferCarUpdateData extends AlipayObject {

	private static final long serialVersionUID = 5713168777658632229L;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_date")
	private Date activityEndDate;

	/**
	 * 商户数据修改的时间，商户数据发生变化，该值必须更新，单位时间戳
	 */
	@ApiField("isv_update_date")
	private Date isvUpdateDate;

	/**
	 * 车源 id值，第三方车源 id 数据，第三方商户传递的 id 值
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 车价格；单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 状态，1 上架， 2 下架
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 商户车辆展示状态
0 下线态
1 上线态/待活动态度
2 活动中
3 活动结束
	 */
	@ApiField("vehicle_display_status")
	private Long vehicleDisplayStatus;

	public Date getActivityEndDate() {
		return this.activityEndDate;
	}
	public void setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

	public Date getIsvUpdateDate() {
		return this.isvUpdateDate;
	}
	public void setIsvUpdateDate(Date isvUpdateDate) {
		this.isvUpdateDate = isvUpdateDate;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getVehicleDisplayStatus() {
		return this.vehicleDisplayStatus;
	}
	public void setVehicleDisplayStatus(Long vehicleDisplayStatus) {
		this.vehicleDisplayStatus = vehicleDisplayStatus;
	}

}
