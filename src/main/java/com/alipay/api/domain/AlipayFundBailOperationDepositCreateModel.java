package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建保证金缴纳单
 *
 * @author auto create
 * @since 1.0, 2021-12-27 14:26:50
 */
public class AlipayFundBailOperationDepositCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2524616952979941524L;

	/**
	 * 协议号，保证金唯一协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 创建保证金缴纳单金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展大字段,扩展信息主键值限制为com.alipay.accordercore.common.service.facade.control.auth.model.enums.ExtInfoKey
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 单据标题，用于收银台展示，传空将使用主单标题---”保证金资金池“
	 */
	@ApiField("operation_title")
	private String operationTitle;

	/**
	 * 外部请求号，商户流水号，创单的幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付超时时间，超时关闭流水，不可继续支付
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

	/**
	 * 产品码，固定传
BAIL_AUTH
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 备注，展示在账单中
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 业务方指定需要展示在收银台的的用户昵称
	 */
	@ApiField("user_nick")
	private String userNick;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

	public String getOperationTitle() {
		return this.operationTitle;
	}
	public void setOperationTitle(String operationTitle) {
		this.operationTitle = operationTitle;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayTimeout() {
		return this.payTimeout;
	}
	public void setPayTimeout(String payTimeout) {
		this.payTimeout = payTimeout;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
