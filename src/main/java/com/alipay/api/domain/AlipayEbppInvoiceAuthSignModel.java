package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票授权关系同步
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:40:34
 */
public class AlipayEbppInvoiceAuthSignModel extends AlipayObject {

	private static final long serialVersionUID = 5612721359739517422L;

	/**
	 * 发票授权类型，可选值：INVOICE_AUTO_SYNC（发票自动回传）
INVOICE_TWOWAY_AUTO_SYNC（发票双向自动回传）
	 */
	@ApiField("authorization_type")
	private String authorizationType;

	/**
	 * 扩展字段，格式为：KEY1=VALUE1,KEY2=VALUE2,KEY3=VALUE3
邮箱地址KEY为EMAIL_ADDRESS
	 */
	@ApiField("extend_fields")
	private String extendFields;

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

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
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
