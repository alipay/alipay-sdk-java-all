package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业同步的商家upc图片表请求入参
 *
 * @author auto create
 * @since 1.0, 2025-10-27 15:29:42
 */
public class MerchantUpcImgRequestVo extends AlipayObject {

	private static final long serialVersionUID = 7888889992474723492L;

	/**
	 * 官方商品code
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 国标码
	 */
	@ApiField("goods_upc")
	private String goodsUpc;

	/**
	 * 主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 转存后支付宝图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 是否主图
	 */
	@ApiField("is_main")
	private Long isMain;

	/**
	 * 商户appId
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商家图片url
	 */
	@ApiField("merchant_img_url")
	private String merchantImgUrl;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getGoodsUpc() {
		return this.goodsUpc;
	}
	public void setGoodsUpc(String goodsUpc) {
		this.goodsUpc = goodsUpc;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Long getIsMain() {
		return this.isMain;
	}
	public void setIsMain(Long isMain) {
		this.isMain = isMain;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getMerchantImgUrl() {
		return this.merchantImgUrl;
	}
	public void setMerchantImgUrl(String merchantImgUrl) {
		this.merchantImgUrl = merchantImgUrl;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}
