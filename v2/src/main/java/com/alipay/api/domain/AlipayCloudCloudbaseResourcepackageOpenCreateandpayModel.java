package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通下单并支付
 *
 * @author auto create
 * @since 1.0, 2023-10-30 17:06:58
 */
public class AlipayCloudCloudbaseResourcepackageOpenCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 6755177697624432262L;

	/**
	 * 是否自动续费
	 */
	@ApiField("auto_renew")
	private Boolean autoRenew;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境描述
	 */
	@ApiField("env_description")
	private String envDescription;

	/**
	 * 环境名称
	 */
	@ApiField("env_name")
	private String envName;

	/**
	 * 购买时长(月)
	 */
	@ApiField("purchase_month")
	private Long purchaseMonth;

	/**
	 * 环境区域
 - cn-hangzhou
	 */
	@ApiField("region")
	private String region;

	/**
	 * 资源包规格编码
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_base_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_ent_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("spec_code")
	private String specCode;

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}
	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getEnvDescription() {
		return this.envDescription;
	}
	public void setEnvDescription(String envDescription) {
		this.envDescription = envDescription;
	}

	public String getEnvName() {
		return this.envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public Long getPurchaseMonth() {
		return this.purchaseMonth;
	}
	public void setPurchaseMonth(Long purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
