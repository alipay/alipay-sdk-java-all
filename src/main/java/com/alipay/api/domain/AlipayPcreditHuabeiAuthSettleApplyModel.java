package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗先享支付接口
 *
 * @author auto create
 * @since 1.0, 2019-08-09 12:11:15
 */
public class AlipayPcreditHuabeiAuthSettleApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4549592894898392337L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private ExtraParams extendParams;

	/**
	 * 该参数控制结算完成之后的操作，true或者不填代表解约，false代表不解约
	 */
	@ApiField("need_terminated")
	private String needTerminated;

	/**
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 需要支付的金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商户的支付宝用户id。如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public ExtraParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtraParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getNeedTerminated() {
		return this.needTerminated;
	}
	public void setNeedTerminated(String needTerminated) {
		this.needTerminated = needTerminated;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}
