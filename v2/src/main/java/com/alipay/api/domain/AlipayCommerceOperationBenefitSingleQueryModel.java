package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益查询
 *
 * @author auto create
 * @since 1.0, 2021-10-27 14:11:02
 */
public class AlipayCommerceOperationBenefitSingleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4595361999512738747L;

	/**
	 * 外部权益id，由商家自行指定，需要确保在该商家权益内能保证区分出唯一权益内容。在内券权益中，该值传内券活动ID（activityId）
	 */
	@ApiField("out_benefit_id")
	private String outBenefitId;

	/**
	 * 卡包模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getOutBenefitId() {
		return this.outBenefitId;
	}
	public void setOutBenefitId(String outBenefitId) {
		this.outBenefitId = outBenefitId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
