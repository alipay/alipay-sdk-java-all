package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 团购类目资质信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class CategoryQualificationInfo extends AlipayObject {

	private static final long serialVersionUID = 8129337974458557237L;

	/**
	 * 资质图片信息
	 */
	@ApiListField("images")
	@ApiField("group_purchase_image_info")
	private List<GroupPurchaseImageInfo> images;

	/**
	 * 资质编码
	 */
	@ApiField("qual_code")
	private String qualCode;

	public List<GroupPurchaseImageInfo> getImages() {
		return this.images;
	}
	public void setImages(List<GroupPurchaseImageInfo> images) {
		this.images = images;
	}

	public String getQualCode() {
		return this.qualCode;
	}
	public void setQualCode(String qualCode) {
		this.qualCode = qualCode;
	}

}
