package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板的退出信息配置
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:00:14
 */
public class ZMGOQuitConfig extends AlipayObject {

	private static final long serialVersionUID = 3643513955731699944L;

	/**
	 * 退出提示
	 */
	@ApiField("quit_desc")
	private String quitDesc;

	/**
	 * 退出跳转商家页地址，当quit_type取值为：QUIT_MERCHANT_JUMP，必传
	 */
	@ApiField("quit_jump_url")
	private String quitJumpUrl;

	/**
	 * 退出芝麻GO方式，取值：
  （1）QUIT_COMMON("QUIT_COMMON", "标准退出"),
（2）QUIT_MERCHANT_JUMP("QUIT_MERCHANT_JUMP", "商家页退出"),
（3）QUIT_ONLY_TIPS("QUIT_ONLY_TIPS", "仅退出提示")
	 */
	@ApiField("quit_type")
	private String quitType;

	public String getQuitDesc() {
		return this.quitDesc;
	}
	public void setQuitDesc(String quitDesc) {
		this.quitDesc = quitDesc;
	}

	public String getQuitJumpUrl() {
		return this.quitJumpUrl;
	}
	public void setQuitJumpUrl(String quitJumpUrl) {
		this.quitJumpUrl = quitJumpUrl;
	}

	public String getQuitType() {
		return this.quitType;
	}
	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}

}
