package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子证件产品-驾驶证
 *
 * @author auto create
 * @since 1.0, 2017-06-01 16:05:07
 */
public class AlipayUserCertDocDrivingLicense extends AlipayObject {

	private static final long serialVersionUID = 8762177843373652878L;

	/**
	 * 准驾车型
	 */
	@ApiField("clazz")
	private String clazz;

	/**
	 * 证号
	 */
	@ApiField("driving_license_no")
	private String drivingLicenseNo;

	/**
	 * base64后的主页照片
	 */
	@ApiField("encoded_img_main")
	private String encodedImgMain;

	/**
	 * base64编码后的副页图片
	 */
	@ApiField("encoded_img_vice")
	private String encodedImgVice;

	/**
	 * 失效日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 档案编号
	 */
	@ApiField("file_no")
	private String fileNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 生效日期
	 */
	@ApiField("valide_date")
	private String valideDate;

	public String getClazz() {
		return this.clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDrivingLicenseNo() {
		return this.drivingLicenseNo;
	}
	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

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

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getFileNo() {
		return this.fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValideDate() {
		return this.valideDate;
	}
	public void setValideDate(String valideDate) {
		this.valideDate = valideDate;
	}

}
