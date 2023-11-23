package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建记账本页面申请接口
 *
 * @author auto create
 * @since 1.0, 2023-03-24 20:29:09
 */
public class AlipayFundAccountbookPageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8155584361775272316L;

	/**
	 * 账本别名
	 */
	@ApiField("account_book_alias")
	private String accountBookAlias;

	/**
	 * 业务场景码，固定值：代理页面创建
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务扩展字段
	 */
	@ApiField("business_param")
	private BusinessParamDTO businessParam;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签约开通商户主体信息
	 */
	@ApiField("principal_info")
	private PrincipalInfoDTO principalInfo;

	/**
	 * 产品码，固定值：资金账本管理
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountBookAlias() {
		return this.accountBookAlias;
	}
	public void setAccountBookAlias(String accountBookAlias) {
		this.accountBookAlias = accountBookAlias;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public BusinessParamDTO getBusinessParam() {
		return this.businessParam;
	}
	public void setBusinessParam(BusinessParamDTO businessParam) {
		this.businessParam = businessParam;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public PrincipalInfoDTO getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(PrincipalInfoDTO principalInfo) {
		this.principalInfo = principalInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
