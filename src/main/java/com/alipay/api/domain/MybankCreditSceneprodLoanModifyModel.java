package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融订单状态修改
 *
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:18
 */
public class MybankCreditSceneprodLoanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7811888959496479498L;

	/**
	 * 网商申请单号。注意网商申请单号和外部订单号至少要传一个
	 */
	@ApiField("app_seq_no")
	private String appSeqNo;

	/**
	 * 业务订单扩展字段，根据机构不同填入的参数会有区别
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 扩展字段实体，规范了通用的扩展字段内的信息，便于调用方使用，与ext_param作用相同。与ext_param有同名字段冲突时以ext_param_info内容为准。
	 */
	@ApiField("ext_param_info")
	private SceneExtParam extParamInfo;

	/**
	 * 出资机构在网商的角色号（ipRoleId）, 不需要更改可以不填
	 */
	@ApiField("finance_inst_iprole_id")
	private String financeInstIproleId;

	/**
	 * 贷款金额，单位：分 。如果不需要更改可以不传
	 */
	@ApiField("loan_amt")
	private String loanAmt;

	/**
	 * 贷款期数，单位：月，如果不需要更改可以不传
	 */
	@ApiField("loan_period")
	private String loanPeriod;

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
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 要更改的订单状态
	 */
	@ApiField("status")
	private String status;

	public String getAppSeqNo() {
		return this.appSeqNo;
	}
	public void setAppSeqNo(String appSeqNo) {
		this.appSeqNo = appSeqNo;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public SceneExtParam getExtParamInfo() {
		return this.extParamInfo;
	}
	public void setExtParamInfo(SceneExtParam extParamInfo) {
		this.extParamInfo = extParamInfo;
	}

	public String getFinanceInstIproleId() {
		return this.financeInstIproleId;
	}
	public void setFinanceInstIproleId(String financeInstIproleId) {
		this.financeInstIproleId = financeInstIproleId;
	}

	public String getLoanAmt() {
		return this.loanAmt;
	}
	public void setLoanAmt(String loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getLoanPeriod() {
		return this.loanPeriod;
	}
	public void setLoanPeriod(String loanPeriod) {
		this.loanPeriod = loanPeriod;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
