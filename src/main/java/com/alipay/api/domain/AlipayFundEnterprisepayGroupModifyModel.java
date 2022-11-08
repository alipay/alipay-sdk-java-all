package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 因公付更新账户下群组
 *
 * @author auto create
 * @since 1.0, 2022-06-07 16:33:13
 */
public class AlipayFundEnterprisepayGroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2849235828968999371L;

	/**
	 * 企业签约账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 平台和企业的三方授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 出资信息
	 */
	@ApiField("fund_ext_info")
	private FundExtInfo fundExtInfo;

	/**
	 * 群组名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 更新操作类型：多个时逗号分隔
NAME-群组名称
FUND-出资信息
字段不传时，默认全量更新
	 */
	@ApiListField("operation_type_list")
	@ApiField("string")
	private List<String> operationTypeList;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，默认值
ENTERPRISE_PAY
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

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

	public FundExtInfo getFundExtInfo() {
		return this.fundExtInfo;
	}
	public void setFundExtInfo(FundExtInfo fundExtInfo) {
		this.fundExtInfo = fundExtInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOperationTypeList() {
		return this.operationTypeList;
	}
	public void setOperationTypeList(List<String> operationTypeList) {
		this.operationTypeList = operationTypeList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
