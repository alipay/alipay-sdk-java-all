package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融银行直投签约咨询接口
 *
 * @author auto create
 * @since 1.0, 2021-04-27 11:35:34
 */
public class MybankCreditSceneprodSignConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1396185783685471967L;

	/**
	 * 网商申请单号，S结尾
	 */
	@ApiField("app_seq_no")
	private String appSeqNo;

	/**
	 * 机构发给银行签约咨询的相关内容，与机构合约内容保持一致
	 */
	@ApiField("data_info")
	private String dataInfo;

	/**
	 * 签约环节，用于区分签约的类型
	 */
	@ApiField("sign_stage")
	private String signStage;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid或者身份证，与site值相关
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAppSeqNo() {
		return this.appSeqNo;
	}
	public void setAppSeqNo(String appSeqNo) {
		this.appSeqNo = appSeqNo;
	}

	public String getDataInfo() {
		return this.dataInfo;
	}
	public void setDataInfo(String dataInfo) {
		this.dataInfo = dataInfo;
	}

	public String getSignStage() {
		return this.signStage;
	}
	public void setSignStage(String signStage) {
		this.signStage = signStage;
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
