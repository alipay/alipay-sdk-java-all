package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品下单
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:27:30
 */
public class AlipayCommerceOperationTimescardOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2725239157297582883L;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private VirtualItemOrderExtInfo extendInfo;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("isv_partner_id")
	private String isvPartnerId;

	/**
	 * 次卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public VirtualItemOrderExtInfo getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(VirtualItemOrderExtInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getIsvPartnerId() {
		return this.isvPartnerId;
	}
	public void setIsvPartnerId(String isvPartnerId) {
		this.isvPartnerId = isvPartnerId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
