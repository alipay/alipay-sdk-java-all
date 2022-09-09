package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 招商报名信息
 *
 * @author auto create
 * @since 1.0, 2022-02-23 11:50:36
 */
public class RecruitEnrollInfo extends AlipayObject {

	private static final long serialVersionUID = 4536275959377735929L;

	/**
	 * 报名提交的活动城市码，详见<a href="https://opendocs.alipay.com/pre-open/02r07u" target="_blank">活动城市码</a>
	 */
	@ApiListField("cities")
	@ApiField("string")
	private List<String> cities;

	/**
	 * 报名商户
	 */
	@ApiField("enroll_merchant")
	private RecruitEnrollMerchant enrollMerchant;

	/**
	 * 报名提交的素材
	 */
	@ApiListField("materials")
	@ApiField("recruit_material")
	private List<RecruitMaterial> materials;

	/**
	 * 报名提交的小程序信息，是否必选取决于方案要求
	 */
	@ApiListField("mini_apps")
	@ApiField("recruit_mini_app")
	private List<RecruitMiniApp> miniApps;

	/**
	 * 报名提交的券信息，是否必选取决于方案要求
	 */
	@ApiListField("vouchers")
	@ApiField("recruit_voucher")
	private List<RecruitVoucher> vouchers;

	public List<String> getCities() {
		return this.cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public RecruitEnrollMerchant getEnrollMerchant() {
		return this.enrollMerchant;
	}
	public void setEnrollMerchant(RecruitEnrollMerchant enrollMerchant) {
		this.enrollMerchant = enrollMerchant;
	}

	public List<RecruitMaterial> getMaterials() {
		return this.materials;
	}
	public void setMaterials(List<RecruitMaterial> materials) {
		this.materials = materials;
	}

	public List<RecruitMiniApp> getMiniApps() {
		return this.miniApps;
	}
	public void setMiniApps(List<RecruitMiniApp> miniApps) {
		this.miniApps = miniApps;
	}

	public List<RecruitVoucher> getVouchers() {
		return this.vouchers;
	}
	public void setVouchers(List<RecruitVoucher> vouchers) {
		this.vouchers = vouchers;
	}

}
