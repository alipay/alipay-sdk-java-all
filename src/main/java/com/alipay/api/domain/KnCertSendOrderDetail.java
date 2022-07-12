package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销凭证明细
 *
 * @author auto create
 * @since 1.0, 2020-05-19 14:51:59
 */
public class KnCertSendOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 4184328885895397288L;

	/**
	 * 在此凭证单据下，用户还剩余的有效凭证点数
	 */
	@ApiField("cert_remain_point")
	private Long certRemainPoint;

	/**
	 * 营销平台凭证模板ID(即营销凭证批次号)，可能是数字和字母的组合
	 */
	@ApiField("cert_template_id")
	private String certTemplateId;

	/**
	 * 用户此凭证单据产生的时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 用户此凭证单据下的凭证的失效时间
	 */
	@ApiField("gmt_expire")
	private Date gmtExpire;

	/**
	 * 产生此用户凭证时的凭证单据号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	public Long getCertRemainPoint() {
		return this.certRemainPoint;
	}
	public void setCertRemainPoint(Long certRemainPoint) {
		this.certRemainPoint = certRemainPoint;
	}

	public String getCertTemplateId() {
		return this.certTemplateId;
	}
	public void setCertTemplateId(String certTemplateId) {
		this.certTemplateId = certTemplateId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtExpire() {
		return this.gmtExpire;
	}
	public void setGmtExpire(Date gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

}
