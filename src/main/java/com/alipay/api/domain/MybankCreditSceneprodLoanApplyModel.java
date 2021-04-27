package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融下单接口
 *
 * @author auto create
 * @since 1.0, 2021-04-16 11:29:29
 */
public class MybankCreditSceneprodLoanApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5421728476547222645L;

	/**
	 * 支付宝版本号
	 */
	@ApiField("alipay_version")
	private String alipayVersion;

	/**
	 * 订单审核结果回调地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 数据来源渠道，从服务窗调用开放平台接口的是OPENAPI, 手机端为APP，天猫调用是TMALL
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 业务订单扩展字段，根据机构不同填入的参数会有区别
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 扩展字段实体，规范了通用的扩展字段内的信息，便于调用方使用，与ext_param作用相同。与ext_param有同名字段冲突时以ext_param_info中内容为准。
	 */
	@ApiField("ext_param_info")
	private SceneExtParam extParamInfo;

	/**
	 * 出资机构在网商的角色号（ipRoleId）, 下单时不确定可以不填
	 */
	@ApiField("finance_inst_iprole_id")
	private String financeInstIproleId;

	/**
	 * 贷款金额，单位：分 。如果在下单时不确定可以不传
	 */
	@ApiField("loan_amt")
	private String loanAmt;

	/**
	 * 贷款期数，单位：月，如果在下单时不确定可以不传
	 */
	@ApiField("loan_period")
	private String loanPeriod;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

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
	 * 新车车贷
01023200002000002828
二手车车贷
01023200002000002931
转分期回租租金贷
01023200002000003090
新车直租租金贷
01023200002000003206
新车回租租金贷
01023200002000003394
二手车直租租金贷
01023200002000002932
二手车回租租金贷
01023200002000003531
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	/**
	 * 场景代码，用于区分后续业务流程
	 */
	@ApiField("scene")
	private String scene;

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
	 * 核身VID
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getAlipayVersion() {
		return this.alipayVersion;
	}
	public void setAlipayVersion(String alipayVersion) {
		this.alipayVersion = alipayVersion;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
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

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
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

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
