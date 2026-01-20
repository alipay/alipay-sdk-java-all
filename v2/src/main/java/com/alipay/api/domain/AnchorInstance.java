package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 锚定物实例
 *
 * @author auto create
 * @since 1.0, 2025-12-15 21:29:21
 */
public class AnchorInstance extends AlipayObject {

	private static final long serialVersionUID = 5349586526951542529L;

	/**
	 * 锚定物ID
	 */
	@ApiField("anchor_id")
	private String anchorId;

	/**
	 * 锚定物实例ID
	 */
	@ApiField("anchor_instance_id")
	private String anchorInstanceId;

	public String getAnchorId() {
		return this.anchorId;
	}
	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
	}

	public String getAnchorInstanceId() {
		return this.anchorInstanceId;
	}
	public void setAnchorInstanceId(String anchorInstanceId) {
		this.anchorInstanceId = anchorInstanceId;
	}

}
