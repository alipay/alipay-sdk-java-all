package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车之家线索接通状态模型
 *
 * @author auto create
 * @since 1.0, 2026-06-17 15:23:50
 */
public class AutohomeContactStatusModel extends AlipayObject {

	private static final long serialVersionUID = 2869887384283637677L;

	/**
	 * 0：否
1：是
	 */
	@ApiField("has_contacted")
	private Long hasContacted;

	/**
	 * 0：否
1：是
2：待定（用户未明确表示）
	 */
	@ApiField("has_intent")
	private Long hasIntent;

	public Long getHasContacted() {
		return this.hasContacted;
	}
	public void setHasContacted(Long hasContacted) {
		this.hasContacted = hasContacted;
	}

	public Long getHasIntent() {
		return this.hasIntent;
	}
	public void setHasIntent(Long hasIntent) {
		this.hasIntent = hasIntent;
	}

}
