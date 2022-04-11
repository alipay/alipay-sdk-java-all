package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除绑定关系
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:19:41
 */
public class AlipayCommerceOperationPromoterRelationDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2477787737278949162L;

	/**
	 * 需要解除的门店对映的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 海鼎门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 店员id，需要解除的导购员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
