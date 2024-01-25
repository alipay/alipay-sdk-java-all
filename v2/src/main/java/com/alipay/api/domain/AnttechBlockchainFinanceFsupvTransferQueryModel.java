package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管控账户资金划拨结果查询
 *
 * @author auto create
 * @since 1.0, 2023-12-05 10:30:50
 */
public class AnttechBlockchainFinanceFsupvTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7766917723666894569L;

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
