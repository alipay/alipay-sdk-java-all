package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询用户匹配的客群信息
 *
 * @author auto create
 * @since 1.0, 2020-03-22 14:50:50
 */
public class AlipayDataDataserviceAntlbsCrowdMatchModel extends AlipayObject {

	private static final long serialVersionUID = 7786772946667337551L;

	/**
	 * crowd_code ＋ 客群匹配接口 ＋ 客群码，创建客群时可获取
	 */
	@ApiListField("crowd_code")
	@ApiField("string")
	private List<String> crowdCode;

	/**
	 * scene_code ＋ 客群匹配接口 ＋ 客群归属的场景，在icrowd平台上可以看到
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * uid ＋ 客群匹配接口 ＋ 用户唯一ID，目前只支持支付宝账号，其他ID类型请联系接口负责人确认是否支持
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * uid_type ＋ 客群匹配接口 ＋ ID类型，目前只支持支付宝账号（USER_ID），其他ID类型请联系接口负责人确认是否支持
	 */
	@ApiField("uid_type")
	private String uidType;

	public List<String> getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(List<String> crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUidType() {
		return this.uidType;
	}
	public void setUidType(String uidType) {
		this.uidType = uidType;
	}

}
