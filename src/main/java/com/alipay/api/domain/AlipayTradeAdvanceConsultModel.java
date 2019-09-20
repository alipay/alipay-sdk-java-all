package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 垫资查询
 *
 * @author auto create
 * @since 1.0, 2019-06-15 00:44:06
 */
public class AlipayTradeAdvanceConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6144168939964773658L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 行业产品信息，咨询是，会从该产品对应的销售方案中获取相关垫资规则配置
	 */
	@ApiField("industry_product_code")
	private String industryProductCode;

	/**
	 * 子商户id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 子商户类型
	 */
	@ApiField("sub_merchant_type")
	private String subMerchantType;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getIndustryProductCode() {
		return this.industryProductCode;
	}
	public void setIndustryProductCode(String industryProductCode) {
		this.industryProductCode = industryProductCode;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubMerchantType() {
		return this.subMerchantType;
	}
	public void setSubMerchantType(String subMerchantType) {
		this.subMerchantType = subMerchantType;
	}

}
