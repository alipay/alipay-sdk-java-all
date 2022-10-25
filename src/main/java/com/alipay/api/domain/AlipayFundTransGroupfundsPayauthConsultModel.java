package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团体资金用户收付款权限预校验
 *
 * @author auto create
 * @since 1.0, 2019-05-17 11:54:22
 */
public class AlipayFundTransGroupfundsPayauthConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3465259189191864287L;

	/**
	 * 当前发起资金操作用户支付宝账户ID
	 */
	@ApiField("current_user_id")
	private String currentUserId;

	/**
	 * 扩展请求参数，业务扩展时使用
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 资金操作类型，"collect": 收款，"payment": 付款
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 业务来源,对于聚会小程序统一透传"openParty"
	 */
	@ApiField("source")
	private String source;

	public String getCurrentUserId() {
		return this.currentUserId;
	}
	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
