package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku提报结果
 *
 * @author auto create
 * @since 1.0, 2025-10-22 10:59:42
 */
public class MerchantSkuUploadResult extends AlipayObject {

	private static final long serialVersionUID = 6149589869993582172L;

	/**
	 * 商家侧商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧SKUID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 上传结果状态。返回SPU_NOT_EXSIT和 CSPU_NOT_EXSIT不存在时，需要联系BD确认品类是否正确，确认完成后可以重试
	 */
	@ApiField("status")
	private String status;

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
