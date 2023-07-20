package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管控账户资金划拨结果查询
 *
 * @author auto create
 * @since 1.0, 2023-05-29 11:42:08
 */
public class AnttechBlockchainFinanceFsupvTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5811588516436534437L;

	/**
	 * 受理号，即管控账户资金划拨响应中返回的受理号
	 */
	@ApiField("accepted_no")
	private String acceptedNo;

	public String getAcceptedNo() {
		return this.acceptedNo;
	}
	public void setAcceptedNo(String acceptedNo) {
		this.acceptedNo = acceptedNo;
	}

}
