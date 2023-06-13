package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 杭州亚运大屏-左屏-一站通离线指标监控指标
 *
 * @author auto create
 * @since 1.0, 2023-06-13 16:52:52
 */
public class AlipayDataMdaMiniappofflineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2735583346619951348L;

	/**
	 * 亚运PASS
	 */
	@ApiField("use_pass")
	private Long usePass;

	public Long getUsePass() {
		return this.usePass;
	}
	public void setUsePass(Long usePass) {
		this.usePass = usePass;
	}

}
