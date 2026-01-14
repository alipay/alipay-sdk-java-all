package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 妈妈添加委托人接口
 *
 * @author auto create
 * @since 1.0, 2025-05-13 16:46:05
 */
public class AlipayDataDataserviceAdPrincipalformmCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 6363924458221441728L;

	/**
	 * 登录用户支付宝统一ID,2088开头字符串。登录校验和可反查出user_id。
	 */
	@ApiField("alipay_oid")
	private String alipayOid;

	/**
	 * 权限token,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商家其他信息
	 */
	@ApiField("extend_info")
	private AlimamaPrincipalExtendInfo extendInfo;

	/**
	 * 一级行业id
	 */
	@ApiField("first_trade_id")
	private String firstTradeId;

	/**
	 * 商家支付宝统一id
	 */
	@ApiField("principal_oid")
	private String principalOid;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 二级行业id
	 */
	@ApiField("second_trade_id")
	private String secondTradeId;

	public String getAlipayOid() {
		return this.alipayOid;
	}
	public void setAlipayOid(String alipayOid) {
		this.alipayOid = alipayOid;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public AlimamaPrincipalExtendInfo getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(AlimamaPrincipalExtendInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFirstTradeId() {
		return this.firstTradeId;
	}
	public void setFirstTradeId(String firstTradeId) {
		this.firstTradeId = firstTradeId;
	}

	public String getPrincipalOid() {
		return this.principalOid;
	}
	public void setPrincipalOid(String principalOid) {
		this.principalOid = principalOid;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getSecondTradeId() {
		return this.secondTradeId;
	}
	public void setSecondTradeId(String secondTradeId) {
		this.secondTradeId = secondTradeId;
	}

}
