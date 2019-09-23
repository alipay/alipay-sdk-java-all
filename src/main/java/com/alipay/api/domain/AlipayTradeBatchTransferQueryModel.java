package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请款分账查询接口
 *
 * @author auto create
 * @since 1.0, 2019-09-12 17:16:44
 */
public class AlipayTradeBatchTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3715738688778814978L;

	/**
	 * 扩展字段
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
