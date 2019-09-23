package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票授权关系同步
 *
 * @author auto create
 * @since 1.0, 2019-08-29 16:50:43
 */
public class AlipayEbppInvoiceAuthSignModel extends AlipayObject {

	private static final long serialVersionUID = 1214279896278625569L;

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
