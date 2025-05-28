package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融账单查询接口
 *
 * @author auto create
 * @since 1.0, 2022-08-16 11:57:41
 */
public class MybankCreditSceneprodBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1844756894934589699L;

	/**
	 * 网商银行的申请单号，通过mybank.credit.sceneprod.loan.apply接口返回的applyno获取
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/**
	 * 支用号，银行直投模式才会使用，需要和app_seqno一并传来
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝 ，PERSON 身份证
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid， 填入的值与site值相关。
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAppSeqno() {
		return this.appSeqno;
	}
	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
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
