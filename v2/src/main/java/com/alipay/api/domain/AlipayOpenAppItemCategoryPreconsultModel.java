package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目预咨询接口
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:14:50
 */
public class AlipayOpenAppItemCategoryPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 7832378973548582714L;

	/**
	 * 商品详情图的图片ID。文件id通过alipay.open.file.upload 上传资源获取file_id，或通过alipay.marketing.image.enhance.upload获取image_id均可上传成功
	 */
	@ApiField("img_id")
	private String imgId;

	/**
	 * 商品详情页URL
	 */
	@ApiField("path")
	private String path;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getImgId() {
		return this.imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
