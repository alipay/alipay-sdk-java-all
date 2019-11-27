package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融签约接口
 *
 * @author auto create
 * @since 1.0, 2017-11-17 17:27:56
 */
public class MybankCreditSceneprodArrangementSignModel extends AlipayObject {

	private static final long serialVersionUID = 1321357541951148666L;

	/**
	 * 机构编码，机构接入场景金融平台时分配，固定值
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 产品编码，场景金融平台给机构提供的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码，通过该场景码确定需要验证的参数内容，以及返回的贷款方案的格式
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 本次请求流水号，全局唯一
	 */
	@ApiField("seq_no")
	private String seqNo;

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

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
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
