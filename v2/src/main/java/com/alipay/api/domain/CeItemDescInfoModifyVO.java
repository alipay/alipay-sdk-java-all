package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详情信息
 *
 * @author auto create
 * @since 1.0, 2026-04-14 16:52:45
 */
public class CeItemDescInfoModifyVO extends AlipayObject {

	private static final long serialVersionUID = 1624281822532639279L;

	/**
	 * 商品详情描述文本（不超过2000字）。若接入商品详情页组件，将在详情页组件处透出。
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * null
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
