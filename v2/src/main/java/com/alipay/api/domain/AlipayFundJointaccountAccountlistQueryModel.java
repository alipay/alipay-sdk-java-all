package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账户列表
 *
 * @author auto create
 * @since 1.0, 2025-06-30 20:05:19
 */
public class AlipayFundJointaccountAccountlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4886175958579357895L;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 查询模式：本次仅支持MASTER
	 */
	@ApiField("index_type")
	private String indexType;

	/**
	 * 小荷包产品码，区分不同的小荷包类型
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIndexType() {
		return this.indexType;
	}
	public void setIndexType(String indexType) {
		this.indexType = indexType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
