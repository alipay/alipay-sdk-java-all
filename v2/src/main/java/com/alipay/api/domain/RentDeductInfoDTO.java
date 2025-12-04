package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁代扣签约信息
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:46:43
 */
public class RentDeductInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2118451875371691562L;

	/**
	 * 商户代扣协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 代扣服务名称。用于在代扣协议详情中展示，方便用户区分该笔代扣对应的订单，建议传入标准的商品名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 代扣签约场景。租赁代扣固定传入RENT_DEDUCT
	 */
	@ApiField("sign_scene")
	private String signScene;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

}
