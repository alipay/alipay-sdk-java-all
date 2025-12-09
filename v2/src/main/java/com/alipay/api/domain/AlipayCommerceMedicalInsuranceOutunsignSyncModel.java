package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部用户解约商保码通知
 *
 * @author auto create
 * @since 1.0, 2025-10-29 17:33:19
 */
public class AlipayCommerceMedicalInsuranceOutunsignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8296874392947935987L;

	/**
	 * 保司类型，如平安养老险-PINGAN_YLX
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 购买保司产品的企业ID，如：中国移动
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 开通状态，1-签约、2-解约
	 */
	@ApiField("open_status")
	private String openStatus;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
