package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询用户付款码皮肤信息
 *
 * @author auto create
 * @since 1.0, 2023-03-15 13:57:37
 */
public class AlipayCommerceSportsFacepayskinBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7651744727288652249L;

	/**
	 * 支付宝客户端版本号
	 */
	@ApiField("client_version")
	private String clientVersion;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 付款码皮肤ID集合
	 */
	@ApiListField("skin_id_list")
	@ApiField("string")
	private List<String> skinIdList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getClientVersion() {
		return this.clientVersion;
	}
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getSkinIdList() {
		return this.skinIdList;
	}
	public void setSkinIdList(List<String> skinIdList) {
		this.skinIdList = skinIdList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
