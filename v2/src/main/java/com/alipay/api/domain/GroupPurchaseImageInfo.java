package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团购类目资质图片信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class GroupPurchaseImageInfo extends AlipayObject {

	private static final long serialVersionUID = 1519641591174865224L;

	/**
	 * 资质图片，使用openApi接口ant.merchant.expand.indirect.image.upload上传获取到的image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiField("image_pic")
	private String imagePic;

	public String getImagePic() {
		return this.imagePic;
	}
	public void setImagePic(String imagePic) {
		this.imagePic = imagePic;
	}

}
