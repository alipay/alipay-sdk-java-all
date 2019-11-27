package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品展示信息
 *
 * @author auto create
 * @since 1.0, 2016-03-28 13:53:44
 */
public class PrizeDisplayDto extends AlipayObject {

	private static final long serialVersionUID = 4738852526582278261L;

	/**
	 * 奖品描述
	 */
	@ApiField("prize_desc")
	private String prizeDesc;

	/**
	 * 奖品详情图片id
	 */
	@ApiField("prize_img")
	private String prizeImg;

	/**
	 * 奖品logo图片id
	 */
	@ApiField("prize_logo")
	private String prizeLogo;

	/**
	 * 9.0优惠券
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品使用须知
	 */
	@ApiListField("prize_terms")
	@ApiField("string")
	private List<String> prizeTerms;

	/**
	 * 商品sku描述
	 */
	@ApiField("sku_desc")
	private String skuDesc;

	/**
	 * 商品sku图片ids
	 */
	@ApiListField("sku_imgs")
	@ApiField("string")
	private List<String> skuImgs;

	public String getPrizeDesc() {
		return this.prizeDesc;
	}
	public void setPrizeDesc(String prizeDesc) {
		this.prizeDesc = prizeDesc;
	}

	public String getPrizeImg() {
		return this.prizeImg;
	}
	public void setPrizeImg(String prizeImg) {
		this.prizeImg = prizeImg;
	}

	public String getPrizeLogo() {
		return this.prizeLogo;
	}
	public void setPrizeLogo(String prizeLogo) {
		this.prizeLogo = prizeLogo;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public List<String> getPrizeTerms() {
		return this.prizeTerms;
	}
	public void setPrizeTerms(List<String> prizeTerms) {
		this.prizeTerms = prizeTerms;
	}

	public String getSkuDesc() {
		return this.skuDesc;
	}
	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}

	public List<String> getSkuImgs() {
		return this.skuImgs;
	}
	public void setSkuImgs(List<String> skuImgs) {
		this.skuImgs = skuImgs;
	}

}
