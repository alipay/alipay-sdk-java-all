package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业ETC入驻车辆查询
 *
 * @author auto create
 * @since 1.0, 2024-06-10 16:35:49
 */
public class AlipayCommerceTransportEtcenterpriseVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5138112815522298876L;

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
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 企业运单号，同一个corp_id下唯一
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

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
