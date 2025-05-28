package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钢铁匣保存记录
 *
 * @author auto create
 * @since 1.0, 2022-10-28 14:37:13
 */
public class AlipayUserSafeboxRecordSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5835477264246128719L;

	/**
	 * 用钢铁匣公钥加密后的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 用于加密传输标题和内容的钢铁匣密钥版本。默认值1
	 */
	@ApiField("key_version")
	private String keyVersion;

	/**
	 * 用户（UserId）在应用（AppId）下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 钢铁匣为接入方提供的应用场景码。一个APPID可以对应多个场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用钢铁匣公钥加密后的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 唯一id，用作幂等。每一个唯一id只能对应一条记录。同一个场景码下，对应多个唯一id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyVersion() {
		return this.keyVersion;
	}
	public void setKeyVersion(String keyVersion) {
		this.keyVersion = keyVersion;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
