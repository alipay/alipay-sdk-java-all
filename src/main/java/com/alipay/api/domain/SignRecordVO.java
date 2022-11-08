package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签约记录详情
 *
 * @author auto create
 * @since 1.0, 2022-08-18 17:17:13
 */
public class SignRecordVO extends AlipayObject {

	private static final long serialVersionUID = 8239885498592243562L;

	/**
	 * 法务C端协议分配的协议ID，用于唯一标识一个协议或复用协议
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 签约记录集合
	 */
	@ApiListField("log_vos")
	@ApiField("sign_record_log_v_o")
	private List<SignRecordLogVO> logVos;

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
	 * S-签约，U-解约
	 */
	@ApiField("status")
	private String status;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public List<SignRecordLogVO> getLogVos() {
		return this.logVos;
	}
	public void setLogVos(List<SignRecordLogVO> logVos) {
		this.logVos = logVos;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
