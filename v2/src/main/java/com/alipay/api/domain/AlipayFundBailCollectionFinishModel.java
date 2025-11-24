package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保证金委托代扣案件终止
 *
 * @author auto create
 * @since 1.0, 2022-12-20 21:32:14
 */
public class AlipayFundBailCollectionFinishModel extends AlipayObject {

	private static final long serialVersionUID = 6377249599524622653L;

	/**
	 * 代扣协议号，对应唯一的保证金代扣协议及保证金资金池
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递，json格式。
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 外部委托号，对应唯一的委托案件
	 */
	@ApiField("out_collection_no")
	private String outCollectionNo;

	/**
	 * 催收案件主体，请输入2088开头的16位uid
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/**
	 * 催收案件主体，请输入2088开头的16位uid
	 */
	@ApiField("principal_user_id")
	private String principalUserId;

	/**
	 * 销售产品码，用于接入保证金业务，本字段取值固定为BAIL_AUTH
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

	public String getOutCollectionNo() {
		return this.outCollectionNo;
	}
	public void setOutCollectionNo(String outCollectionNo) {
		this.outCollectionNo = outCollectionNo;
	}

	public String getPrincipalOpenId() {
		return this.principalOpenId;
	}
	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}

	public String getPrincipalUserId() {
		return this.principalUserId;
	}
	public void setPrincipalUserId(String principalUserId) {
		this.principalUserId = principalUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
