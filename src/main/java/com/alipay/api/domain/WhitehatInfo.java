package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 白帽子信息
 *
 * @author auto create
 * @since 1.0, 2018-11-25 14:36:52
 */
public class WhitehatInfo extends AlipayObject {

	private static final long serialVersionUID = 7864441345983378351L;

	/**
	 * 当前有效的安全币奖励
	 */
	@ApiField("coin")
	private Long coin;

	/**
	 * 历史总金币奖励
	 */
	@ApiField("history_coin")
	private Long historyCoin;

	/**
	 * 称号
	 */
	@ApiField("level")
	private String level;

	public Long getCoin() {
		return this.coin;
	}
	public void setCoin(Long coin) {
		this.coin = coin;
	}

	public Long getHistoryCoin() {
		return this.historyCoin;
	}
	public void setHistoryCoin(Long historyCoin) {
		this.historyCoin = historyCoin;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
