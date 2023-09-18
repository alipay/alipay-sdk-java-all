package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户资金代扣签约申请
 *
 * @author auto create
 * @since 1.0, 2023-06-09 11:27:24
 */
public class AnttechBlockchainDefinFwhSignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6617127932273212648L;

	/**
	 * 授权有效期，单位为天；不填为永久有效
	 */
	@ApiField("expiry_period")
	private String expiryPeriod;

	/**
	 * 商家证件号
	 */
	@ApiField("merchant_id_number")
	private String merchantIdNumber;

	/**
	 * 商家证件类型
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	/**
	 * 商家名称，即出金商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 外部脱敏登录号，用于签约页面展示
	 */
	@ApiField("outer_logon_id")
	private String outerLogonId;

	/**
	 * 代扣授权产品合约码，即在产品中心签约的商户代扣产品一级合约编码，可联系运营获取
	 */
	@ApiField("product_agrt_code")
	private String productAgrtCode;

	/**
	 * 请求流水号，即调用方系统中唯一流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 签约链接有效期，单位为秒；过期后该签约链接不可用；不传使用默认值
	 */
	@ApiField("sign_link_expiry_period")
	private String signLinkExpiryPeriod;

	public String getExpiryPeriod() {
		return this.expiryPeriod;
	}
	public void setExpiryPeriod(String expiryPeriod) {
		this.expiryPeriod = expiryPeriod;
	}

	public String getMerchantIdNumber() {
		return this.merchantIdNumber;
	}
	public void setMerchantIdNumber(String merchantIdNumber) {
		this.merchantIdNumber = merchantIdNumber;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOuterLogonId() {
		return this.outerLogonId;
	}
	public void setOuterLogonId(String outerLogonId) {
		this.outerLogonId = outerLogonId;
	}

	public String getProductAgrtCode() {
		return this.productAgrtCode;
	}
	public void setProductAgrtCode(String productAgrtCode) {
		this.productAgrtCode = productAgrtCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSignLinkExpiryPeriod() {
		return this.signLinkExpiryPeriod;
	}
	public void setSignLinkExpiryPeriod(String signLinkExpiryPeriod) {
		this.signLinkExpiryPeriod = signLinkExpiryPeriod;
	}

}
