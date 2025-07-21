package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本地接直付通记账关系绑定
 *
 * @author auto create
 * @since 1.0, 2023-12-28 14:59:56
 */
public class AntMerchantExpandZftChargerelationBindModel extends AlipayObject {

	private static final long serialVersionUID = 8223381542736312679L;

	/**
	 * 授权函。当商户名与结算卡户名不一致。《说明函》模板参考https://opendocs.alipay.com/open/direct-payment/cg5mkp#%E7%9B%B8%E5%85%B3%E8%B5%84%E6%96%99。涉及外籍法人（这种情况上传任意能证明身份的图片）时必填，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。（商户类型为个体工商户时，本字段仅需上传营业执照非授权函）
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 记账方smid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 目标记账对手方smid
	 */
	@ApiField("target_smid")
	private String targetSmid;

	public String getLicenseAuthLetterImage() {
		return this.licenseAuthLetterImage;
	}
	public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
		this.licenseAuthLetterImage = licenseAuthLetterImage;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTargetSmid() {
		return this.targetSmid;
	}
	public void setTargetSmid(String targetSmid) {
		this.targetSmid = targetSmid;
	}

}
