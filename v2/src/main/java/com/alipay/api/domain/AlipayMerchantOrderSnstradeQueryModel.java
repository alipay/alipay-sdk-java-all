package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV动销数据接口
 *
 * @author auto create
 * @since 1.0, 2025-04-29 16:33:19
 */
public class AlipayMerchantOrderSnstradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6258436913488746493L;

	/**
	 * 物料售卖接入id
	 */
	@ApiField("asset_access_id")
	private String assetAccessId;

	/**
	 * 日期精确到天
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 渠道编码
	 */
	@ApiField("ch_info")
	private String chInfo;

	public String getAssetAccessId() {
		return this.assetAccessId;
	}
	public void setAssetAccessId(String assetAccessId) {
		this.assetAccessId = assetAccessId;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

}
