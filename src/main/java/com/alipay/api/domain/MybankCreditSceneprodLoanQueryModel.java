package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融订单状态查询
 *
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:08
 */
public class MybankCreditSceneprodLoanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2835742866166652196L;

	/**
	 * 网商申请单号
	 */
	@ApiField("app_seq_no")
	private String appSeqNo;

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

	public String getAppSeqNo() {
		return this.appSeqNo;
	}
	public void setAppSeqNo(String appSeqNo) {
		this.appSeqNo = appSeqNo;
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

}
