package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融订单资产转让
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:59:03
 */
public class MybankCreditSceneprodLoanAssetTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8619916127237947523L;

	/**
	 * 接收资产方的网商银行账户, 内标，200开头，不是8888开头的
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 业务订单扩展字段，根据机构不同填入的参数会有区别
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 出资机构在网商的角色号（ipRoleId）
	 */
	@ApiField("finance_inst_iprole_id")
	private String financeInstIproleId;

	/**
	 * 机构编码，机构接入场景金融平台时分配，固定值
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品编码，场景金融平台给机构提供的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 服务机构在网商的角色号（ipRoleId）
	 */
	@ApiField("service_inst_iprole_id")
	private String serviceInstIproleId;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getFinanceInstIproleId() {
		return this.financeInstIproleId;
	}
	public void setFinanceInstIproleId(String financeInstIproleId) {
		this.financeInstIproleId = financeInstIproleId;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getServiceInstIproleId() {
		return this.serviceInstIproleId;
	}
	public void setServiceInstIproleId(String serviceInstIproleId) {
		this.serviceInstIproleId = serviceInstIproleId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
