package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询即插即充服务
 *
 * @author auto create
 * @since 1.0, 2024-03-25 17:41:50
 */
public class AlipayCommerceTransportChargerPncQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8148214475362773351L;

	/**
	 * 支付宝用户的openId。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车档案ID
	 */
	@ApiField("vid")
	private String vid;

	/**
	 * 车架号ID
	 */
	@ApiField("vin")
	private String vin;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
