package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约信息
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:13:48
 */
public class MpcDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 3447535283157626823L;

	/**
	 * 显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 邮费
	 */
	@ApiField("post_fee")
	private Long postFee;

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getPostFee() {
		return this.postFee;
	}
	public void setPostFee(Long postFee) {
		this.postFee = postFee;
	}

}
