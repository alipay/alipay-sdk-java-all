package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建口令红包模型
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:46
 */
public class KbAdvertContentPasswordModify extends AlipayObject {

	private static final long serialVersionUID = 3421936273144534436L;

	/**
	 * 口令红包背景图的django ID
	 */
	@ApiField("background_img_id")
	private String backgroundImgId;

	/**
	 * 口令红包品牌名称（品牌名称不能超过20位）
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 红包口令（口令不能超过20位，口令只能是中文、英文、数字组合,不能纯数字）
	 */
	@ApiField("password")
	private String password;

	/**
	 * 口令红包券LOGO的django ID
	 */
	@ApiField("voucher_logo_id")
	private String voucherLogoId;

	public String getBackgroundImgId() {
		return this.backgroundImgId;
	}
	public void setBackgroundImgId(String backgroundImgId) {
		this.backgroundImgId = backgroundImgId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getVoucherLogoId() {
		return this.voucherLogoId;
	}
	public void setVoucherLogoId(String voucherLogoId) {
		this.voucherLogoId = voucherLogoId;
	}

}
