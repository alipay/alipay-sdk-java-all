package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景金融代客还款接口
 *
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:52
 */
public class MybankCreditSceneprodRepayDeputyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3314922951566717671L;

	/**
	 * 网商分配的申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/**
	 * 如果需要调整代客还款信息的时候，该项必填
	 */
	@ApiListField("bill_list")
	@ApiField("scene_prod_deputy_payment_bill_detail")
	private List<SceneProdDeputyPaymentBillDetail> billList;

	/**
	 * 网商分配的支用单号
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/**
	 * 操作类型：申请/修改/删除：  APPLY   ,  查询：QUERY
	 */
	@ApiField("operation_type")
	private String operationType;

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
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAppSeqno() {
		return this.appSeqno;
	}
	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}

	public List<SceneProdDeputyPaymentBillDetail> getBillList() {
		return this.billList;
	}
	public void setBillList(List<SceneProdDeputyPaymentBillDetail> billList) {
		this.billList = billList;
	}

	public String getDrawdownNo() {
		return this.drawdownNo;
	}
	public void setDrawdownNo(String drawdownNo) {
		this.drawdownNo = drawdownNo;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
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
