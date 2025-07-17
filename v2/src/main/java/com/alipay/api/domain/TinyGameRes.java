package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小游戏信息
 *
 * @author auto create
 * @since 1.0, 2025-06-17 13:55:23
 */
public class TinyGameRes extends AlipayObject {

	private static final long serialVersionUID = 1284217557925829598L;

	/**
	 * 小游戏appId，用于创建计划时使用
	 */
	@ApiField("tiny_game_id")
	private String tinyGameId;

	/**
	 * 小游戏具体名称
	 */
	@ApiField("tiny_game_name")
	private String tinyGameName;

	public String getTinyGameId() {
		return this.tinyGameId;
	}
	public void setTinyGameId(String tinyGameId) {
		this.tinyGameId = tinyGameId;
	}

	public String getTinyGameName() {
		return this.tinyGameName;
	}
	public void setTinyGameName(String tinyGameName) {
		this.tinyGameName = tinyGameName;
	}

}
