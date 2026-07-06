package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业特殊行业资质信息
 *
 * @author auto create
 * @since 1.0, 2026-03-19 15:04:20
 */
public class InteOpSpecialLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 5762538288543422119L;

	/**
	 * 企业特殊资质图片，可参考 商家经营类目 中的“需要的特殊资质证书”。文件最小为 5KB，最大为5M，图片格式必须为：png、bmp、gif、jpg、jpeg。
传入 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("special_license_pic")
	private String specialLicensePic;

	/**
	 * 合约特殊资质的类型，默认可以传99
	 */
	@ApiField("special_license_type")
	private String specialLicenseType;

	public String getSpecialLicensePic() {
		return this.specialLicensePic;
	}
	public void setSpecialLicensePic(String specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

	public String getSpecialLicenseType() {
		return this.specialLicenseType;
	}
	public void setSpecialLicenseType(String specialLicenseType) {
		this.specialLicenseType = specialLicenseType;
	}

}
