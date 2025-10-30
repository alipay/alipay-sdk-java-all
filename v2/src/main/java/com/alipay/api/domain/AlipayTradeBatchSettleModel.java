package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量请求结算
 *
 * @author auto create
 * @since 1.0, 2025-02-25 10:26:38
 */
public class AlipayTradeBatchSettleModel extends AlipayObject {

	private static final long serialVersionUID = 2776222475492261933L;

	/**
	 * 收单产品码，商家和支付宝签约的产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复，如果重复则返回该流水号对应的结算单据的状态。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 结算明细条款
	 */
	@ApiListField("settle_clauses")
	@ApiField("settle_clause")
	private List<SettleClause> settleClauses;

	/**
	 * 结算方式，目前仅支持提前放款结算quickSettlement，提前放款结算需要商户开通快收服务，不填则为普通结算方式
	 */
	@ApiField("settle_type")
	private String settleType;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

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

	public List<SettleClause> getSettleClauses() {
		return this.settleClauses;
	}
	public void setSettleClauses(List<SettleClause> settleClauses) {
		this.settleClauses = settleClauses;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

}
