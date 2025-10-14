package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理车辆信息
 *
 * @author auto create
 * @since 1.0, 2023-09-21 17:53:59
 */
public class EtcVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 2686794924278954337L;

	/**
	 * 车辆发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 0：蓝；
1：黄； 
2：黑；
3：白；
4：渐变绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 核定载人数，不带单位
	 */
	@ApiField("vi_ac")
	private String viAc;

	/**
	 * 行驶证发证日期
	 */
	@ApiField("vi_grant_date")
	private String viGrantDate;

	/**
	 * 总质量
	 */
	@ApiField("vi_gross_mass")
	private String viGrossMass;

	/**
	 * 车高
	 */
	@ApiField("vi_height")
	private String viHeight;

	/**
	 * 车长
	 */
	@ApiField("vi_length")
	private String viLength;

	/**
	 * 行驶证上的品牌型号
	 */
	@ApiField("vi_model_name")
	private String viModelName;

	/**
	 * 车辆所有人
	 */
	@ApiField("vi_owner_name")
	private String viOwnerName;

	/**
	 * 车辆注册日期
	 */
	@ApiField("vi_register_date")
	private String viRegisterDate;

	/**
	 * 车辆类型，OCR识别信息，例如小型普通客车
	 */
	@ApiField("vi_type")
	private String viType;

	/**
	 * 运营/非营运
	 */
	@ApiField("vi_use_type")
	private String viUseType;

	/**
	 * 车辆识别号
	 */
	@ApiField("vi_vin")
	private String viVin;

	/**
	 * 车宽
	 */
	@ApiField("vi_width")
	private String viWidth;

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
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

	public String getViAc() {
		return this.viAc;
	}
	public void setViAc(String viAc) {
		this.viAc = viAc;
	}

	public String getViGrantDate() {
		return this.viGrantDate;
	}
	public void setViGrantDate(String viGrantDate) {
		this.viGrantDate = viGrantDate;
	}

	public String getViGrossMass() {
		return this.viGrossMass;
	}
	public void setViGrossMass(String viGrossMass) {
		this.viGrossMass = viGrossMass;
	}

	public String getViHeight() {
		return this.viHeight;
	}
	public void setViHeight(String viHeight) {
		this.viHeight = viHeight;
	}

	public String getViLength() {
		return this.viLength;
	}
	public void setViLength(String viLength) {
		this.viLength = viLength;
	}

	public String getViModelName() {
		return this.viModelName;
	}
	public void setViModelName(String viModelName) {
		this.viModelName = viModelName;
	}

	public String getViOwnerName() {
		return this.viOwnerName;
	}
	public void setViOwnerName(String viOwnerName) {
		this.viOwnerName = viOwnerName;
	}

	public String getViRegisterDate() {
		return this.viRegisterDate;
	}
	public void setViRegisterDate(String viRegisterDate) {
		this.viRegisterDate = viRegisterDate;
	}

	public String getViType() {
		return this.viType;
	}
	public void setViType(String viType) {
		this.viType = viType;
	}

	public String getViUseType() {
		return this.viUseType;
	}
	public void setViUseType(String viUseType) {
		this.viUseType = viUseType;
	}

	public String getViVin() {
		return this.viVin;
	}
	public void setViVin(String viVin) {
		this.viVin = viVin;
	}

	public String getViWidth() {
		return this.viWidth;
	}
	public void setViWidth(String viWidth) {
		this.viWidth = viWidth;
	}

}
