package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取医保电子凭证线上支付授权信息
 *
 * @author auto create
 * @since 1.0, 2021-08-03 19:18:12
 */
public class AlipayCommerceMedicalOctokenAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3755214933599452836L;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 授权完成后回跳ISV页面地址
	 */
	@ApiField("call_url")
	private String callUrl;

	/**
	 * 渠道信息(由支付宝分配)
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 线上业务类型编码
	 */
	@ApiField("ol_biz_type_code")
	private String olBizTypeCode;

	/**
	 * 定点医药机构编码
	 */
	@ApiField("org_cfc_id")
	private String orgCfcId;

	/**
	 * 机构渠道认证编码
	 */
	@ApiField("org_chnl_crtf_code")
	private String orgChnlCrtfCode;

	/**
	 * 合作伙伴所在城市编码(国标)
	 */
	@ApiField("partner_city_code")
	private String partnerCityCode;

	/**
	 * 合作伙伴Id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * ISV请求业务唯一流水号
	 */
	@ApiField("req_biz_no")
	private String reqBizNo;

	/**
	 * 订单总金额(单位: 元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

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

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOlBizTypeCode() {
		return this.olBizTypeCode;
	}
	public void setOlBizTypeCode(String olBizTypeCode) {
		this.olBizTypeCode = olBizTypeCode;
	}

	public String getOrgCfcId() {
		return this.orgCfcId;
	}
	public void setOrgCfcId(String orgCfcId) {
		this.orgCfcId = orgCfcId;
	}

	public String getOrgChnlCrtfCode() {
		return this.orgChnlCrtfCode;
	}
	public void setOrgChnlCrtfCode(String orgChnlCrtfCode) {
		this.orgChnlCrtfCode = orgChnlCrtfCode;
	}

	public String getPartnerCityCode() {
		return this.partnerCityCode;
	}
	public void setPartnerCityCode(String partnerCityCode) {
		this.partnerCityCode = partnerCityCode;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getReqBizNo() {
		return this.reqBizNo;
	}
	public void setReqBizNo(String reqBizNo) {
		this.reqBizNo = reqBizNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
