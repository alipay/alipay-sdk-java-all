package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星云账号登出
 *
 * @author auto create
 * @since 1.0, 2024-07-10 17:13:56
 */
public class AlipayIserviceIsresourceapiBizuserQuitModel extends AlipayObject {

	private static final long serialVersionUID = 3832259882251229471L;

	/**
	 * 企业用户ID
	 */
	@ApiField("biz_user_id")
	private String bizUserId;

	/**
	 * 星云分配给企业的产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 星云给企业分配的租户code
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 星云用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizUserId() {
		return this.bizUserId;
	}
	public void setBizUserId(String bizUserId) {
		this.bizUserId = bizUserId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
