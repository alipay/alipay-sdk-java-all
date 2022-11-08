package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店绑定（或解绑）委托人
 *
 * @author auto create
 * @since 1.0, 2022-01-10 20:27:14
 */
public class AlipayDataDataserviceAdStoreBindModel extends AlipayObject {

	private static final long serialVersionUID = 5397938288869556687L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 拓展信息，新增时必填
例如：
{
    "storeId": "门店id", // 用于幂等
    "storeName": "门店名称",
    "address": "门店地址详情"，
    "addressExtInfo": "门店地址补充信息",
    "lat": "门店纬度",
    "lnt": "门店经度",
    "provinceName": "门店所在省份",
    "cityName": "门店所在城市",
    "telephone": "联系电话",
    "tradeId": "门店行业"
}
	 */
	@ApiField("extend_info")
	private StoreExtendInfo extendInfo;

	/**
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 0 - 绑定门店
1 - 解绑门店
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 投放账户id
	 */
	@ApiField("user_id")
	private Long userId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public StoreExtendInfo getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(StoreExtendInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
