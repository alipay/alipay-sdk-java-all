package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车场业务归属配置
 *
 * @author auto create
 * @since 1.0, 2021-02-19 20:37:59
 */
public class AlipayEcoMycarParkingParkinglotbizTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4465951952582313915L;

	/**
	 * 车场业务归属关系列表
	 */
	@ApiListField("business_isv")
	@ApiField("business_item")
	private List<BusinessItem> businessIsv;

	/**
	 * 车场创建返回的parking_id字段
	 */
	@ApiField("parking_id")
	private String parkingId;

	public List<BusinessItem> getBusinessIsv() {
		return this.businessIsv;
	}
	public void setBusinessIsv(List<BusinessItem> businessIsv) {
		this.businessIsv = businessIsv;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
