package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个人用户升级申请接口
 *
 * @author auto create
 * @since 1.0, 2026-01-15 11:33:31
 */
public class AlipayTradeSolutionprodMerchantupgradeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3343973164277252951L;

	/**
	 * 结果页点击完成后的跳转地址 1、跳转类型为ALIPAY_URL，back_url就做支付宝端内跳转 2、跳转类型为MERCHANT_URL，back_url就跳转到端外
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 用于升级完成之后的回跳地址类型： 1、类型为MERCHANT_URL，代表需要回跳至端外商户地址，back_url按照跳端方式拼接 2、类型为ALIPAY_URL，代表需要回跳至支付宝端内地址，back_url按照跳支付宝端内方式拼接，支持小程序或h5
	 */
	@ApiField("back_url_type")
	private String backUrlType;

	/**
	 * 个人商户的城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 当前个人收款方类型
	 */
	@ApiField("current_merchant_type")
	private String currentMerchantType;

	/**
	 * 外部单据号，由商家自定义。64个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复。该参数用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 个人商户省份的名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 个人收款方使用服务
	 */
	@ApiListField("service")
	@ApiField("string")
	private List<String> service;

	/**
	 * 商户站点信息,包括网站、app、小程序。商户使用服务包含电脑支付，必须填充一个类型为01(网站)的SolutionSiteInfo对象，site_type/site_url/site_name必填；、当包含wap支付时，必须至少填充类型为01(网站)或07(手机网站)中一种类型的SolutionSiteInfo对象，site_type/site_url/site_name必填；当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SolutionSiteInfo对象，site_type/site_name必填；当包含jsapi支付时，必须填充一个类型为06(支付宝小程序)的SolutionSiteInfo对象site_type/site_url/site_name/tiny_app_id必填；
	 */
	@ApiListField("sites")
	@ApiField("solution_site_info")
	private List<SolutionSiteInfo> sites;

	/**
	 * 需要升级的个人收款方smid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 解决方案code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 目标个人收款方类型，当前仅支持PERSONAL_MERCHANTS
	 */
	@ApiField("target_merchant_type")
	private String targetMerchantType;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBackUrlType() {
		return this.backUrlType;
	}
	public void setBackUrlType(String backUrlType) {
		this.backUrlType = backUrlType;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCurrentMerchantType() {
		return this.currentMerchantType;
	}
	public void setCurrentMerchantType(String currentMerchantType) {
		this.currentMerchantType = currentMerchantType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public List<String> getService() {
		return this.service;
	}
	public void setService(List<String> service) {
		this.service = service;
	}

	public List<SolutionSiteInfo> getSites() {
		return this.sites;
	}
	public void setSites(List<SolutionSiteInfo> sites) {
		this.sites = sites;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public String getTargetMerchantType() {
		return this.targetMerchantType;
	}
	public void setTargetMerchantType(String targetMerchantType) {
		this.targetMerchantType = targetMerchantType;
	}

}
