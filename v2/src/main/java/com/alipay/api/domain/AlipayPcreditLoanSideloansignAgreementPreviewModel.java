package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随身贷授信协议预览
 *
 * @author auto create
 * @since 1.0, 2025-04-17 23:56:21
 */
public class AlipayPcreditLoanSideloansignAgreementPreviewModel extends AlipayObject {

	private static final long serialVersionUID = 7734619511852399115L;

	/**
	 * 指定agreementList以动态渲染和预览对应的协议合同内容
	 */
	@ApiListField("agreement_list")
	@ApiField("agreeement_pre_view_req")
	private List<AgreeementPreViewReq> agreementList;

	/**
	 * 信贷业务场景类型Code
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * SIMPLE_CREDIT极简授信
	 */
	@ApiField("credit_type")
	private String creditType;

	/**
	 * 部分协议内容展示需要上游咨询结果信息, 以及用户提交前填写的动态字段, 需要在参扩展信息中透传
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 出资机构机构ID
	 */
	@ApiField("fund_supplier_code")
	private String fundSupplierCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁借贷款产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public List<AgreeementPreViewReq> getAgreementList() {
		return this.agreementList;
	}
	public void setAgreementList(List<AgreeementPreViewReq> agreementList) {
		this.agreementList = agreementList;
	}

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCreditType() {
		return this.creditType;
	}
	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFundSupplierCode() {
		return this.fundSupplierCode;
	}
	public void setFundSupplierCode(String fundSupplierCode) {
		this.fundSupplierCode = fundSupplierCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
