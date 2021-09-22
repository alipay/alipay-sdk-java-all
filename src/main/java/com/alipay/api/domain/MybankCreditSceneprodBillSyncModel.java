package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单同步接口
 *
 * @author auto create
 * @since 1.0, 2019-04-01 09:48:52
 */
public class MybankCreditSceneprodBillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3624937748964989968L;

	/**
	 * 网商申请单号(必须S结尾)
资产转让后资产持有人同步账单时必填
	 */
	@ApiField("app_seq_no")
	private String appSeqNo;

	/**
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("scene_prod_bill_detail")
	private List<SceneProdBillDetail> billList;

	/**
	 * 客户姓名
资产转让后资产持有人同步账单时必填
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
资产转让后资产持有人同步账单时必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 支用号
资产转让后资产持有人同步账单时必填
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/**
	 * 扩展字段，用于适配不同机构的特殊要求
	 */
	@ApiField("ext_param")
	private String extParam;

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

	public List<SceneProdBillDetail> getBillList() {
		return this.billList;
	}
	public void setBillList(List<SceneProdBillDetail> billList) {
		this.billList = billList;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getDrawdownNo() {
		return this.drawdownNo;
	}
	public void setDrawdownNo(String drawdownNo) {
		this.drawdownNo = drawdownNo;
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
