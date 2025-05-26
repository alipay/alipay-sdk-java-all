package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景调用方创建制卡单
 *
 * @author auto create
 * @since 1.0, 2024-05-28 17:47:05
 */
public class AlipayFundCardGenerateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4443674414876353684L;

	/**
	 * 扣款协议号，安全发场景必填
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码，DEPOSIT_CERT：充值凭证
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 制卡资金来源：默认ACCOUNT_BOOK
	 */
	@ApiField("fund_source")
	private String fundSource;

	/**
	 * 资金来源凭证：ACCOUNT_BOOK模式下为子户号
	 */
	@ApiField("fund_source_cert")
	private String fundSourceCert;

	/**
	 * 制卡单据明细，本期仅支持一条明细
	 */
	@ApiListField("order_list")
	@ApiField("fund_card_generate_order")
	private List<FundCardGenerateOrder> orderList;

	/**
	 * 外部单号，幂等用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getFundSource() {
		return this.fundSource;
	}
	public void setFundSource(String fundSource) {
		this.fundSource = fundSource;
	}

	public String getFundSourceCert() {
		return this.fundSourceCert;
	}
	public void setFundSourceCert(String fundSourceCert) {
		this.fundSourceCert = fundSourceCert;
	}

	public List<FundCardGenerateOrder> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<FundCardGenerateOrder> orderList) {
		this.orderList = orderList;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
