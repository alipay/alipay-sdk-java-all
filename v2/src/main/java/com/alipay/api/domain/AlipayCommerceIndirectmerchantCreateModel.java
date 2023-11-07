package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建商户
 *
 * @author auto create
 * @since 1.0, 2023-10-30 10:31:13
 */
public class AlipayCommerceIndirectmerchantCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1245553954184784385L;

	/**
	 * 登录账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 商家logo图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 应用id
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 分账关系信息
	 */
	@ApiListField("merchant_settle_relation_list")
	@ApiField("merchant_settle_relation_processor_request")
	private List<MerchantSettleRelationProcessorRequest> merchantSettleRelationList;

	/**
	 * 商家联系电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * smid
	 */
	@ApiField("smid")
	private String smid;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public List<MerchantSettleRelationProcessorRequest> getMerchantSettleRelationList() {
		return this.merchantSettleRelationList;
	}
	public void setMerchantSettleRelationList(List<MerchantSettleRelationProcessorRequest> merchantSettleRelationList) {
		this.merchantSettleRelationList = merchantSettleRelationList;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
