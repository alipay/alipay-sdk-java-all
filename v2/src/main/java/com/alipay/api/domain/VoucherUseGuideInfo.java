package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销引导
 *
 * @author auto create
 * @since 1.0, 2024-09-06 15:13:53
 */
public class VoucherUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 8384486751552112641L;

	/**
	 * 小程序核销引导
	 */
	@ApiField("mini_app_use_guide_info")
	private VoucherMiniAppUseGuideInfo miniAppUseGuideInfo;

	/**
	 * 使用引导模式
	 */
	@ApiListField("use_guide_mode")
	@ApiField("string")
	private List<String> useGuideMode;

	/**
	 * 核销跳转链接
	 */
	@ApiField("use_url")
	private String useUrl;

	public VoucherMiniAppUseGuideInfo getMiniAppUseGuideInfo() {
		return this.miniAppUseGuideInfo;
	}
	public void setMiniAppUseGuideInfo(VoucherMiniAppUseGuideInfo miniAppUseGuideInfo) {
		this.miniAppUseGuideInfo = miniAppUseGuideInfo;
	}

	public List<String> getUseGuideMode() {
		return this.useGuideMode;
	}
	public void setUseGuideMode(List<String> useGuideMode) {
		this.useGuideMode = useGuideMode;
	}

	public String getUseUrl() {
		return this.useUrl;
	}
	public void setUseUrl(String useUrl) {
		this.useUrl = useUrl;
	}

}
