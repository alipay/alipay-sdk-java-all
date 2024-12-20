package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * sku信息
 *
 * @author auto create
 * @since 1.0, 2023-03-02 14:06:02
 */
public class OpenApiSkuInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7159458565549442688L;

	/**
	 * 数字类奖项详情
	 */
	@ApiField("award_total_info_vo")
	private OpenApiAwardTotalInfoVO awardTotalInfoVo;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 最大分享人数
	 */
	@ApiField("max_count")
	private Long maxCount;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分享描述
	 */
	@ApiField("share_desc")
	private String shareDesc;

	/**
	 * 分享头像信息
	 */
	@ApiListField("share_info")
	@ApiField("open_api_user_detail_info")
	private List<OpenApiUserDetailInfo> shareInfo;

	/**
	 * 商品已获得后详情跳转链接
	 */
	@ApiField("sku_detail_url")
	private String skuDetailUrl;

	/**
	 * 商品获得前跳转链接
	 */
	@ApiField("sku_get_url")
	private String skuGetUrl;

	/**
	 * 单品id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku图片
	 */
	@ApiField("sku_img")
	private String skuImg;

	/**
	 * 状态
	 */
	@ApiField("sku_state")
	private String skuState;

	/**
	 * sku类型
	 */
	@ApiField("sku_type")
	private String skuType;

	public OpenApiAwardTotalInfoVO getAwardTotalInfoVo() {
		return this.awardTotalInfoVo;
	}
	public void setAwardTotalInfoVo(OpenApiAwardTotalInfoVO awardTotalInfoVo) {
		this.awardTotalInfoVo = awardTotalInfoVo;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getMaxCount() {
		return this.maxCount;
	}
	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShareDesc() {
		return this.shareDesc;
	}
	public void setShareDesc(String shareDesc) {
		this.shareDesc = shareDesc;
	}

	public List<OpenApiUserDetailInfo> getShareInfo() {
		return this.shareInfo;
	}
	public void setShareInfo(List<OpenApiUserDetailInfo> shareInfo) {
		this.shareInfo = shareInfo;
	}

	public String getSkuDetailUrl() {
		return this.skuDetailUrl;
	}
	public void setSkuDetailUrl(String skuDetailUrl) {
		this.skuDetailUrl = skuDetailUrl;
	}

	public String getSkuGetUrl() {
		return this.skuGetUrl;
	}
	public void setSkuGetUrl(String skuGetUrl) {
		this.skuGetUrl = skuGetUrl;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuImg() {
		return this.skuImg;
	}
	public void setSkuImg(String skuImg) {
		this.skuImg = skuImg;
	}

	public String getSkuState() {
		return this.skuState;
	}
	public void setSkuState(String skuState) {
		this.skuState = skuState;
	}

	public String getSkuType() {
		return this.skuType;
	}
	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}

}
