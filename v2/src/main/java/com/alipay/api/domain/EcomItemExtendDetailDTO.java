package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商商品详情模型
 *
 * @author auto create
 * @since 1.0, 2022-12-15 19:15:57
 */
public class EcomItemExtendDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 2746337827547961215L;

	/**
	 * cardType + 唯一 + 储值卡类目投保场景 + 通过上下游约定获取
枚举类型：
    STORED("STORED", "储值卡"),
    FREQUENCY("FREQUENCY", "次卡"),
    TERM("TERM", "周期卡"),
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 储值卡可用金额，单位分
	 */
	@ApiField("card_use_amount")
	private Long cardUseAmount;

	/**
	 * 储值卡可用次数
	 */
	@ApiField("card_use_count")
	private Long cardUseCount;

	/**
	 * 储值卡使用周期，单位天
	 */
	@ApiField("card_use_period")
	private Long cardUsePeriod;

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

	/**
	 * 设备是否支持锁定
	 */
	@ApiField("lockable_device")
	private Boolean lockableDevice;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getCardUseAmount() {
		return this.cardUseAmount;
	}
	public void setCardUseAmount(Long cardUseAmount) {
		this.cardUseAmount = cardUseAmount;
	}

	public Long getCardUseCount() {
		return this.cardUseCount;
	}
	public void setCardUseCount(Long cardUseCount) {
		this.cardUseCount = cardUseCount;
	}

	public Long getCardUsePeriod() {
		return this.cardUsePeriod;
	}
	public void setCardUsePeriod(Long cardUsePeriod) {
		this.cardUsePeriod = cardUsePeriod;
	}

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

	public Boolean getLockableDevice() {
		return this.lockableDevice;
	}
	public void setLockableDevice(Boolean lockableDevice) {
		this.lockableDevice = lockableDevice;
	}

}
