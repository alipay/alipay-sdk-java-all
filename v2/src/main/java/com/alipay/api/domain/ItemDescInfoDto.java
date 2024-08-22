package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详情信息描述
 *
 * @author auto create
 * @since 1.0, 2024-04-10 15:18:56
 */
public class ItemDescInfoDto extends AlipayObject {

	private static final long serialVersionUID = 7869681912285769193L;

	/**
	 * 商品详情描述文本（不超过2000字）
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品详情描述图片（最多10张）
	 */
	@ApiListField("imgs")
	@ApiField("string")
	private List<String> imgs;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getImgs() {
		return this.imgs;
	}
	public void setImgs(List<String> imgs) {
		this.imgs = imgs;
	}

}
