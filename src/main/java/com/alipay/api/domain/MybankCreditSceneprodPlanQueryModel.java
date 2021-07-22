package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融贷款方案查询
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:44:32
 */
public class MybankCreditSceneprodPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8771241824913874122L;

	/**
	 * 数据来源渠道，从服务窗调用开放平台接口的是OPENAPI, 手机端为APP，天猫调用是TMALL
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 客户信息来源，该字段会写入到客户签署的网商合约中
	 */
	@ApiField("customer_channel")
	private String customerChannel;

	/**
	 * 扩展参数,针对不同的平台特殊业务场景，将需要的参数填入改字段，目前针对直租业务有以下参数：itemprice 车辆价格，lastprop 车辆残值率,extintamt 基础服务包+增值服务包，loantenor 贷款期数，creditamtprop 授信额度比例调整值；
	 */
	@ApiField("ext_param")
	private String extParam;

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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCustomerChannel() {
		return this.customerChannel;
	}
	public void setCustomerChannel(String customerChannel) {
		this.customerChannel = customerChannel;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

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
