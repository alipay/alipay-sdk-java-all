package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方小程序扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-06-18 16:58:26
 */
public class MiniProgramExtraInfo extends AlipayObject {

	private static final long serialVersionUID = 4887434777547332246L;

	/**
	 * mini_program_id+否+服务商提供待处理的小程序ID
	 */
	@ApiField("mini_program_id")
	private String miniProgramId;

	public String getMiniProgramId() {
		return this.miniProgramId;
	}
	public void setMiniProgramId(String miniProgramId) {
		this.miniProgramId = miniProgramId;
	}

}
