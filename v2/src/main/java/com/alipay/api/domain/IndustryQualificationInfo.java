package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户行业资质，表示商户具备某行业从业资格
 *
 * @author auto create
 * @since 1.0, 2024-11-25 11:04:20
 */
public class IndustryQualificationInfo extends AlipayObject {

	private static final long serialVersionUID = 3418662825436621626L;

	/**
	 * 商户行业资质图片。其值为通过ant.merchant.expand.indirect.image.upload上传图片得到的image_id
	 */
	@ApiField("industry_qualification_image")
	private String industryQualificationImage;

	/**
	 * <a href="https://gw.alipayobjects.com/os/bmw-prod/7aa3a36b-2bc2-4d57-815f-08edd55ef67e.xlsx">商户行业资质类型，具体选值参见文档</a>
	 */
	@ApiField("industry_qualification_type")
	private String industryQualificationType;

	public String getIndustryQualificationImage() {
		return this.industryQualificationImage;
	}
	public void setIndustryQualificationImage(String industryQualificationImage) {
		this.industryQualificationImage = industryQualificationImage;
	}

	public String getIndustryQualificationType() {
		return this.industryQualificationType;
	}
	public void setIndustryQualificationType(String industryQualificationType) {
		this.industryQualificationType = industryQualificationType;
	}

}
