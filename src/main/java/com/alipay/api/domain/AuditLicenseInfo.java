package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序版本提交审核营业执照信息
 *
 * @author auto create
 * @since 1.0, 2019-06-20 23:01:37
 */
public class AuditLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 6241178366955441864L;

	/**
	 * 营业执照名称，需要与营业执照保持一致
	 */
	@ApiField("license_name")
	private String licenseName;

	/**
	 * 营业执照号，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息，如果不填默认采用当前小程序应用营业执照号。
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 营业执照照片地址列表
	 */
	@ApiListField("license_pic_list")
	@ApiField("string")
	private List<String> licensePicList;

	/**
	 * 营业执有效期，格式为yyyy-MM-dd，9999-12-31表示长期
	 */
	@ApiField("license_valid_date")
	private String licenseValidDate;

	/**
	 * 门头照图片地址，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息，如果不填默认采用当前小程序门头照图片
	 */
	@ApiField("out_door_pic")
	private String outDoorPic;

	public String getLicenseName() {
		return this.licenseName;
	}
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public List<String> getLicensePicList() {
		return this.licensePicList;
	}
	public void setLicensePicList(List<String> licensePicList) {
		this.licensePicList = licensePicList;
	}

	public String getLicenseValidDate() {
		return this.licenseValidDate;
	}
	public void setLicenseValidDate(String licenseValidDate) {
		this.licenseValidDate = licenseValidDate;
	}

	public String getOutDoorPic() {
		return this.outDoorPic;
	}
	public void setOutDoorPic(String outDoorPic) {
		this.outDoorPic = outDoorPic;
	}

}
