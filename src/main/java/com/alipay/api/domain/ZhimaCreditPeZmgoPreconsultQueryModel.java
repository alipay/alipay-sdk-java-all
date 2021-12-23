package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务预查询接口
 *
 * @author auto create
 * @since 1.0, 2020-08-12 09:38:39
 */
public class ZhimaCreditPeZmgoPreconsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5835116487585948592L;

	/**
	 * 用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务来源：阿里集团内传ALIBABA_INNER
	 */
	@ApiField("biz_src")
	private String bizSrc;

	/**
	 * 业务类型：淘宝特价版传LITE_TAO
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizSrc() {
		return this.bizSrc;
	}
	public void setBizSrc(String bizSrc) {
		this.bizSrc = bizSrc;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
