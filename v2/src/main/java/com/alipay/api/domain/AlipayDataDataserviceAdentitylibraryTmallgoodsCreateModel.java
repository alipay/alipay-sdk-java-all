package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天猫商品同步
 *
 * @author auto create
 * @since 1.0, 2026-09-25 11:00:35
 */
public class AlipayDataDataserviceAdentitylibraryTmallgoodsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8785682155734961352L;

	/**
	 * 异步点击监测链接
	 */
	@ApiField("async_click_url")
	private String asyncClickUrl;

	/**
	 * 异步曝光监测链接
	 */
	@ApiField("async_exposure_url")
	private String asyncExposureUrl;

	/**
	 * 天猫商品 ID（对应 outId）
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品主图 URL
	 */
	@ApiField("main_image_url")
	private String mainImageUrl;

	/**
	 * 非负整数，单位：分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 灯火账户 ID（UDS 代理*商家，对应 adbase_ad_principal.id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 商家的OID
	 */
	@ApiField("principal_oid")
	private String principalOid;

	/**
	 * 账户鉴权标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 同步点击监测链接
	 */
	@ApiField("sync_click_url")
	private String syncClickUrl;

	public String getAsyncClickUrl() {
		return this.asyncClickUrl;
	}
	public void setAsyncClickUrl(String asyncClickUrl) {
		this.asyncClickUrl = asyncClickUrl;
	}

	public String getAsyncExposureUrl() {
		return this.asyncExposureUrl;
	}
	public void setAsyncExposureUrl(String asyncExposureUrl) {
		this.asyncExposureUrl = asyncExposureUrl;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getMainImageUrl() {
		return this.mainImageUrl;
	}
	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
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

	public String getSyncClickUrl() {
		return this.syncClickUrl;
	}
	public void setSyncClickUrl(String syncClickUrl) {
		this.syncClickUrl = syncClickUrl;
	}

}
