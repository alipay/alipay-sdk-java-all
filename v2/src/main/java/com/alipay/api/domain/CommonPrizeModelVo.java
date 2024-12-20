package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通奖品模型
 *
 * @author auto create
 * @since 1.0, 2021-01-17 13:54:10
 */
public class CommonPrizeModelVo extends AlipayObject {

	private static final long serialVersionUID = 8548793152223999555L;

	/**
	 * 奖品描述图片url
	 */
	@ApiField("prize_desc_image_url")
	private String prizeDescImageUrl;

	/**
	 * 奖品底部文案
	 */
	@ApiField("prize_down_desc_text")
	private String prizeDownDescText;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	public String getPrizeDescImageUrl() {
		return this.prizeDescImageUrl;
	}
	public void setPrizeDescImageUrl(String prizeDescImageUrl) {
		this.prizeDescImageUrl = prizeDescImageUrl;
	}

	public String getPrizeDownDescText() {
		return this.prizeDownDescText;
	}
	public void setPrizeDownDescText(String prizeDownDescText) {
		this.prizeDownDescText = prizeDownDescText;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

}
