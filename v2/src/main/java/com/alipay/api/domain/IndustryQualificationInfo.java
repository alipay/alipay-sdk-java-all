package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户行业资质，表示商户具备某行业从业资格
 *
 * @author auto create
 * @since 1.0, 2021-04-07 21:04:06
 */
public class IndustryQualificationInfo extends AlipayObject {

	private static final long serialVersionUID = 1462449453227972696L;

	/**
	 * 商户行业资质图片。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key
	 */
	@ApiField("industry_qualification_image")
	private String industryQualificationImage;

	/**
	 * 商户行业资质类型，具体选值参见https://mif-pub.alipayobjects.com/QualificationType.xlsx
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
