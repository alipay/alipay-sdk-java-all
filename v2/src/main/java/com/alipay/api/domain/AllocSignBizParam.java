package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权签约业务扩展参数模型
 *
 * @author auto create
 * @since 1.0, 2025-12-15 16:56:09
 */
public class AllocSignBizParam extends AlipayObject {

	private static final long serialVersionUID = 5274261633896244183L;

	/**
	 * 是否屏蔽签约页抽佣比例设置
true -屏蔽
false -正常展示
	 */
	@ApiField("limit_alloc_ratio_disable")
	private Boolean limitAllocRatioDisable;

	public Boolean getLimitAllocRatioDisable() {
		return this.limitAllocRatioDisable;
	}
	public void setLimitAllocRatioDisable(Boolean limitAllocRatioDisable) {
		this.limitAllocRatioDisable = limitAllocRatioDisable;
	}

}
