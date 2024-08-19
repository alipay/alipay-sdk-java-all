package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 带货车商品模型
 *
 * @author auto create
 * @since 1.0, 2024-05-31 16:46:20
 */
public class LiveStoreItemInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5553391291271265591L;

	/**
	 * 控货结果
	 */
	@ApiField("check_result")
	private OpenContentGoodsCheckResult checkResult;

	/**
	 * 商品是否在带货车，true表示在带货车，false表示不在
	 */
	@ApiField("in_store")
	private Boolean inStore;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	public OpenContentGoodsCheckResult getCheckResult() {
		return this.checkResult;
	}
	public void setCheckResult(OpenContentGoodsCheckResult checkResult) {
		this.checkResult = checkResult;
	}

	public Boolean getInStore() {
		return this.inStore;
	}
	public void setInStore(Boolean inStore) {
		this.inStore = inStore;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
