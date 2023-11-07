package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡制卡单据详情查询
 *
 * @author auto create
 * @since 1.0, 2023-10-25 17:54:30
 */
public class AlipayFundMbpcardGencardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4387523915665224757L;

	/**
	 * 制卡单号；out_request_no和gen_card_no二选一
	 */
	@ApiField("gen_card_no")
	private String genCardNo;

	/**
	 * 外部单号；out_request_no和gen_card_no二选一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getGenCardNo() {
		return this.genCardNo;
	}
	public void setGenCardNo(String genCardNo) {
		this.genCardNo = genCardNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
