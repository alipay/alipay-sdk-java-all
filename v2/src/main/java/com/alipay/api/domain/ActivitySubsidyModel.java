package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家自设/大运河等传参类权益详细信息（期数粒度）
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class ActivitySubsidyModel extends AlipayObject {

	private static final long serialVersionUID = 3675181752515944652L;

	/**
	 * 大运河活动码
	 */
	@ApiField("dec_activity_code")
	private String decActivityCode;

	/**
	 * 分期费率版本
	 */
	@ApiField("dec_fee_fq_rate_version")
	private String decFeeFqRateVersion;

	/**
	 * 淘内使用费率档位
	 */
	@ApiField("dec_fee_grade")
	private String decFeeGrade;

	/**
	 * 分期期数
	 */
	@ApiField("install_num")
	private String installNum;

	/**
	 * 商家贴息比例
0用户付息，100为商家贴息
	 */
	@ApiField("user_fq_seller_percent")
	private String userFqSellerPercent;

	public String getDecActivityCode() {
		return this.decActivityCode;
	}
	public void setDecActivityCode(String decActivityCode) {
		this.decActivityCode = decActivityCode;
	}

	public String getDecFeeFqRateVersion() {
		return this.decFeeFqRateVersion;
	}
	public void setDecFeeFqRateVersion(String decFeeFqRateVersion) {
		this.decFeeFqRateVersion = decFeeFqRateVersion;
	}

	public String getDecFeeGrade() {
		return this.decFeeGrade;
	}
	public void setDecFeeGrade(String decFeeGrade) {
		this.decFeeGrade = decFeeGrade;
	}

	public String getInstallNum() {
		return this.installNum;
	}
	public void setInstallNum(String installNum) {
		this.installNum = installNum;
	}

	public String getUserFqSellerPercent() {
		return this.userFqSellerPercent;
	}
	public void setUserFqSellerPercent(String userFqSellerPercent) {
		this.userFqSellerPercent = userFqSellerPercent;
	}

}
