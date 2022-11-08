package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 额度查询接口
 *
 * @author auto create
 * @since 1.0, 2022-04-21 11:06:28
 */
public class AlipayFundAgreementQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7855918211951225276L;

	/**
	 * 授权协议号
	 */
	@ApiListField("agreement_no_list")
	@ApiField("string")
	private List<String> agreementNoList;

	/**
	 * 场景码，非固定值，使用的对应的资金场景码保持一致
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 额度产品码，非固定值，使用的对应的资金产品码保持一致
	 */
	@ApiField("product_code")
	private String productCode;

	public List<String> getAgreementNoList() {
		return this.agreementNoList;
	}
	public void setAgreementNoList(List<String> agreementNoList) {
		this.agreementNoList = agreementNoList;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
