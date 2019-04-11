package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票授权关系解约
 *
 * @author auto create
 * @since 1.0, 2018-12-11 16:30:06
 */
public class AlipayEbppInvoiceAuthUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 2568159664135794827L;

	/**
	 * 发票授权类型，可选值：INVOICE_AUTO_SYNC（发票自动回传）
	 */
	@ApiField("authorization_type")
	private String authorizationType;

	/**
	 * 开票商户品牌简称，与商户入驻时的品牌简称保持一致。
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthorizationType() {
		return this.authorizationType;
	}
	public void setAuthorizationType(String authorizationType) {
		this.authorizationType = authorizationType;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
