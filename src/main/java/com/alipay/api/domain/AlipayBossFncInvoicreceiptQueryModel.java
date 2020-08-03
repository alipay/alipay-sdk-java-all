package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 基于对账单号查询开票单据信息
 *
 * @author auto create
 * @since 1.0, 2020-04-14 17:31:21
 */
public class AlipayBossFncInvoicreceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7534934277645988152L;

	/**
	 * 对账单号
	 */
	@ApiListField("statement_bill_nos")
	@ApiField("string")
	private List<String> statementBillNos;

	public List<String> getStatementBillNos() {
		return this.statementBillNos;
	}
	public void setStatementBillNos(List<String> statementBillNos) {
		this.statementBillNos = statementBillNos;
	}

}
