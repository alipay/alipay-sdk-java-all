package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝协议支付许可创建接口
 *
 * @author auto create
 * @since 1.0, 2024-03-01 14:30:12
 */
public class AlipayUserAgreementPermissionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1368146736443589494L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务参数，如果notice_template是SERVIOCE_NOTICE时，此参数必传
	 */
	@ApiField("business_params")
	private BusinessParamsMap businessParams;

	/**
	 * 目前共两种类型SERVIOCE_NOTICE和DEFAULT_PERMISSION，如果是服务变更提醒，需传入SERVIOCE_NOTICE
	 */
	@ApiField("notice_template")
	private String noticeTemplate;

	/**
	 * 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 订单总金额。 单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public BusinessParamsMap getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(BusinessParamsMap businessParams) {
		this.businessParams = businessParams;
	}

	public String getNoticeTemplate() {
		return this.noticeTemplate;
	}
	public void setNoticeTemplate(String noticeTemplate) {
		this.noticeTemplate = noticeTemplate;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
