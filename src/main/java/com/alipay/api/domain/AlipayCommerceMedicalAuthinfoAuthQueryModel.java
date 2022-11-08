package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国家医保局线上业务身份核验信息授权查询接口
 *
 * @author auto create
 * @since 1.0, 2021-12-28 20:07:12
 */
public class AlipayCommerceMedicalAuthinfoAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4672332667819536767L;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 授权回调地址
	 */
	@ApiField("call_url")
	private String callUrl;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_params")
	private AuthExtendParams extendParams;

	/**
	 * 机构编码
	 */
	@ApiField("ins_code")
	private String insCode;

	/**
	 * 线上业务类型编码
	 */
	@ApiField("ol_biz_type_code")
	private String olBizTypeCode;

	/**
	 * olBizTypeCode=04107(医保移动支付业务)时必传
	 */
	@ApiField("org_app_id")
	private String orgAppId;

	/**
	 * 机构渠道认证编码
	 */
	@ApiField("org_chnl_crtf_code")
	private String orgChnlCrtfCode;

	/**
	 * 定点医药机构代码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 商户请求流水号
	 */
	@ApiField("req_biz_no")
	private String reqBizNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCallUrl() {
		return this.callUrl;
	}
	public void setCallUrl(String callUrl) {
		this.callUrl = callUrl;
	}

	public AuthExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(AuthExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getInsCode() {
		return this.insCode;
	}
	public void setInsCode(String insCode) {
		this.insCode = insCode;
	}

	public String getOlBizTypeCode() {
		return this.olBizTypeCode;
	}
	public void setOlBizTypeCode(String olBizTypeCode) {
		this.olBizTypeCode = olBizTypeCode;
	}

	public String getOrgAppId() {
		return this.orgAppId;
	}
	public void setOrgAppId(String orgAppId) {
		this.orgAppId = orgAppId;
	}

	public String getOrgChnlCrtfCode() {
		return this.orgChnlCrtfCode;
	}
	public void setOrgChnlCrtfCode(String orgChnlCrtfCode) {
		this.orgChnlCrtfCode = orgChnlCrtfCode;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getReqBizNo() {
		return this.reqBizNo;
	}
	public void setReqBizNo(String reqBizNo) {
		this.reqBizNo = reqBizNo;
	}

}
