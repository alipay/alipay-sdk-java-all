package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全家福信息
 *
 * @author auto create
 * @since 1.0, 2023-03-02 11:14:12
 */
public class OpenApiFamilyInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1229225568382581544L;

	/**
	 * 全家福已收集皮肤数量
	 */
	@ApiField("family_count")
	private Long familyCount;

	/**
	 * 全家福弹窗图片
	 */
	@ApiField("family_img")
	private String familyImg;

	/**
	 * 全家福需要皮肤最大数量
	 */
	@ApiField("family_max_count")
	private Long familyMaxCount;

	/**
	 * 全家福状态
	 */
	@ApiField("family_state")
	private String familyState;

	/**
	 * 全家福弹窗跳转url
	 */
	@ApiField("family_url")
	private String familyUrl;

	/**
	 * 奖品图片地址
	 */
	@ApiField("prize_img")
	private String prizeImg;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 单品id
	 */
	@ApiField("sku_id")
	private String skuId;

	public Long getFamilyCount() {
		return this.familyCount;
	}
	public void setFamilyCount(Long familyCount) {
		this.familyCount = familyCount;
	}

	public String getFamilyImg() {
		return this.familyImg;
	}
	public void setFamilyImg(String familyImg) {
		this.familyImg = familyImg;
	}

	public Long getFamilyMaxCount() {
		return this.familyMaxCount;
	}
	public void setFamilyMaxCount(Long familyMaxCount) {
		this.familyMaxCount = familyMaxCount;
	}

	public String getFamilyState() {
		return this.familyState;
	}
	public void setFamilyState(String familyState) {
		this.familyState = familyState;
	}

	public String getFamilyUrl() {
		return this.familyUrl;
	}
	public void setFamilyUrl(String familyUrl) {
		this.familyUrl = familyUrl;
	}

	public String getPrizeImg() {
		return this.prizeImg;
	}
	public void setPrizeImg(String prizeImg) {
		this.prizeImg = prizeImg;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
