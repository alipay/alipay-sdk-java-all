package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子证件产品行驶证
 *
 * @author auto create
 * @since 1.0, 2017-06-01 16:04:48
 */
public class AlipayUserCertDocVehicleLicense extends AlipayObject {

	private static final long serialVersionUID = 7147927476442264427L;

	/**
	 * base64编码后的主页照片
	 */
	@ApiField("encoded_img_main")
	private String encodedImgMain;

	/**
	 * base64编码后的副页照片
	 */
	@ApiField("encoded_img_vice")
	private String encodedImgVice;

	/**
	 * 发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 发证日期
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 品牌型号
	 */
	@ApiField("model")
	private String model;

	/**
	 * 所有人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 号牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 注册日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 车辆识别代号
	 */
	@ApiField("vin")
	private String vin;

	public String getEncodedImgMain() {
		return this.encodedImgMain;
	}
	public void setEncodedImgMain(String encodedImgMain) {
		this.encodedImgMain = encodedImgMain;
	}

	public String getEncodedImgVice() {
		return this.encodedImgVice;
	}
	public void setEncodedImgVice(String encodedImgVice) {
		this.encodedImgVice = encodedImgVice;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
