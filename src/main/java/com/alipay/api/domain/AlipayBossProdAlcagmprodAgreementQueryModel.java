package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法务c端用户协议签约查询
 *
 * @author auto create
 * @since 1.0, 2022-11-07 16:12:15
 */
public class AlipayBossProdAlcagmprodAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5465324932639118871L;

	/**
	 * 法务C端协议分配的协议ID，用于唯一标识一个协议或复用协议。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 一般是户号/订单号/2088等； 1、签约与解约保持一致； 2、与离线口径的签约Id保持一致；
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

	/**
	 * 产品码（产品星球）
	 */
	@ApiField("product_cd")
	private String productCd;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutSignNo() {
		return this.outSignNo;
	}
	public void setOutSignNo(String outSignNo) {
		this.outSignNo = outSignNo;
	}

	public String getProductCd() {
		return this.productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
