package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融前准入接口
 *
 * @author auto create
 * @since 1.0, 2021-04-27 15:11:34
 */
public class MybankCreditSceneprodPreadmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5322869532683844826L;

	/**
	 * 客户姓名，开户时使用
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 机构编码，机构接入场景金融平台时分配，固定值
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 机构特殊的校验规则
	 */
	@ApiField("pre_admit_rule")
	private String preAdmitRule;

	/**
	 * 产品编码，场景金融平台给机构提供的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 本次请求流水号，全局唯一
	 */
	@ApiField("seq_no")
	private String seqNo;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝； PERSON：身份证；
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，该字段内容与site的内容相关
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getPreAdmitRule() {
		return this.preAdmitRule;
	}
	public void setPreAdmitRule(String preAdmitRule) {
		this.preAdmitRule = preAdmitRule;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSeqNo() {
		return this.seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
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
