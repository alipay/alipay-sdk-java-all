package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 素材的生产结果
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:31:03
 */
public class MaterialResultInfo extends AlipayObject {

	private static final long serialVersionUID = 7662949534627752781L;

	/**
	 * 测试物品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 结果url
	 */
	@ApiField("result_img")
	private String resultImg;

	/**
	 * 任务状态
	 */
	@ApiField("status")
	private String status;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getResultImg() {
		return this.resultImg;
	}
	public void setResultImg(String resultImg) {
		this.resultImg = resultImg;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
