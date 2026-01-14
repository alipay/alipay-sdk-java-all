package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币商户签约进度查询
 *
 * @author auto create
 * @since 1.0, 2024-11-20 14:44:41
 */
public class MybankEcnyMerchantSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4334835673764651296L;

	/**
	 * 外部请求号和受理流水号两者必填一项
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 外部请求号和受理流水号两者必填一项
	 */
	@ApiField("process_no")
	private String processNo;

	/**
	 * 钱包ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProcessNo() {
		return this.processNo;
	}
	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
