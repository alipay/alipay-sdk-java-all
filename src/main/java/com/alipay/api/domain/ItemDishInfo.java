package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详情-菜品数据DTO
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class ItemDishInfo extends AlipayObject {

	private static final long serialVersionUID = 2269482157549772717L;

	/**
	 * 商品详情-菜品图片中的图片描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 详情图片中，菜品图片。支持bmp,png,jpeg,jpg,gif格式的图片，建议宽高比16:9，建议宽高：1242*698px 图片大小≤5M。图片大小超过5M,接口会报错。若图片尺寸不对，口碑服务器自身不会做压缩，但是口碑把这些图片放到客户端上展现时，自己会做性能优化(等比缩放，以图片中心为基准裁剪)。
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

	/**
	 * 详情图片中，菜品标题。请勿超过20个汉字，40个字符
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getImageUrls() {
		return this.imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
