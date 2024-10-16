package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单消息触发发送接口
 *
 * @author auto create
 * @since 1.0, 2024-07-15 20:49:15
 */
public class AlipayCommerceBillEventTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 8311375965824411446L;

	/**
	 * 账单ID列表，账单ID格式由各机构自己定义即可，若填写则仅针对指定的账单ID推送还款消息，否则推送该用户下所有的还款消息
	 */
	@ApiListField("bill_id_list")
	@ApiField("string")
	private List<String> billIdList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getBillIdList() {
		return this.billIdList;
	}
	public void setBillIdList(List<String> billIdList) {
		this.billIdList = billIdList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
