package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意审核拒绝扩展信息
 *
 * @author auto create
 * @since 1.0, 2020-11-03 14:36:45
 */
public class CreativeRefuseExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 8873632178855891811L;

	/**
	 * 创意审核拒绝的附加信息之图片列表
	 */
	@ApiListField("image_url_list")
	@ApiField("string")
	private List<String> imageUrlList;

	public List<String> getImageUrlList() {
		return this.imageUrlList;
	}
	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}

}
