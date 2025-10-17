package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量结算查询
 *
 * @author auto create
 * @since 1.0, 2023-12-21 22:12:18
 */
public class AlipayTradeBatchSettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1573452662465151727L;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 批量结算时传入的外部流水号，与settle_no二者必填其一。 out_request_no和settle_no如果同时存在，优先取settle_no
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 结算单据号，与out_request_no二者必填其一
	 */
	@ApiField("settle_no")
	private String settleNo;

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSettleNo() {
		return this.settleNo;
	}
	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

}
