package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商商品详情模型
 *
 * @author auto create
 * @since 1.0, 2022-10-27 10:56:15
 */
public class EcomItemExtendDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 3364978832674893669L;

	/**
	 * extInfo
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 游戏账号
	 */
	@ApiField("game_account")
	private String gameAccount;

	/**
	 * 游戏账号所属客户端
	 */
	@ApiField("game_account_client")
	private String gameAccountClient;

	/**
	 * 游戏账号所属客户端id
	 */
	@ApiField("game_account_client_id")
	private String gameAccountClientId;

	/**
	 * 游戏id
	 */
	@ApiField("game_id")
	private String gameId;

	/**
	 * 游戏名称
	 */
	@ApiField("game_name")
	private String gameName;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGameAccount() {
		return this.gameAccount;
	}
	public void setGameAccount(String gameAccount) {
		this.gameAccount = gameAccount;
	}

	public String getGameAccountClient() {
		return this.gameAccountClient;
	}
	public void setGameAccountClient(String gameAccountClient) {
		this.gameAccountClient = gameAccountClient;
	}

	public String getGameAccountClientId() {
		return this.gameAccountClientId;
	}
	public void setGameAccountClientId(String gameAccountClientId) {
		this.gameAccountClientId = gameAccountClientId;
	}

	public String getGameId() {
		return this.gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return this.gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

}
