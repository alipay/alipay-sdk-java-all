package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 特殊行业资质信息
 *
 * @author auto create
 * @since 1.0, 2025-12-23 23:01:27
 */
public class SpecialLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 7675553467917266935L;

	/**
	 * 【描述】企业特殊资质图片，可参考 商家经营类目 中的“需要的特殊资质证书”。
【必选条件】根据商家类目判断是否需要资质，资质信息见 商家经营类目2.0。
传入使用 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("special_license_pic")
	private String specialLicensePic;

	/**
	 * 长度范围：[0,100]
枚举值：
门头照:101
内景照片:102
办公场地照片:103
商户码照片:104
收费样本:105
店内照:106
门头照:107
经营场景照:108
门店分发封面图:109
商圈相册:110
其他附件:99
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
